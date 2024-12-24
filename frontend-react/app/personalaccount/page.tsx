'use client'

import { useState, useEffect } from 'react'
import { useMediaQuery } from 'react-responsive'
import HeaderDesktop from '@/components/desktop/layout/HeaderDesktop/HeaderDesktop'
import FooterDesktop from '@/components/desktop/layout/FooterDesktop/FooterDesktop'
import HeaderMobi from '@/components/mobi/layout/HeaderMobi/HeaderMobi'
import FooterMobi from '@/components/mobi/layout/FooterMobi/FooterMobi'
import PersonalAccountDesktop from '@/components/desktop/layout/PersonalAccountDesktop/PersonalAccountDesktop'
import PersonalAccountMobi from '@/components/mobi/layout/PersonalAccountMobi/PersonalAccountMobi'

export default function PersonalAccount() {
    const [isClient, setIsClient] = useState(false)

    useEffect(() => {
        setIsClient(true)
    })

    const isDesktop = useMediaQuery({
        query: '(min-width: 768px)',
    })

    if (!isClient) {
        return null
    }
    return (
        <div>
            {isDesktop ? (
                <>
                    <HeaderDesktop />
                    <main className="grow min-h-[20vh] bg-[#101030]">
                        <PersonalAccountDesktop />
                    </main>
                    <FooterDesktop />
                </>
            ) : (
                <>
                    <HeaderMobi />
                    <main className="bg-[#101030] text-white">
                        <PersonalAccountMobi />
                    </main>
                    <FooterMobi />
                </>
            )}
        </div>
    )
}
