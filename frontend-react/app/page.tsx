'use client'
import { useState, useEffect } from 'react'
import { useMediaQuery } from 'react-responsive'
import HeaderDesktop from '@/components/desktop/layout/HeaderDesktop/HeaderDesktop'
import FooterDesktop from '@/components/desktop/layout/FooterDesktop'
import HomePageDesktop from '@/components/desktop/pageDesktop/HomePageDesktop/HomePageDesktop'
import PromoDesktop from '@/components/desktop/layout/PromoDesktop/PromoDesktop'
import HeaderMobi from '@/components/mobi/layout/HeaderMobi/HeaderMobi'
import FooterMobi from '@/components/mobi/layout/FooterMobi'
import HomePageMobi from '@/components/mobi/pageMobi/HomePageMobi/HomePageMobi'
import PromoMobi from '@/components/mobi/layout/PromoMobi/PromoMobi'

export default function Home() {
    const [isClient, setIsClient] = useState(false)
    useEffect(() => {
        setIsClient(true)
    }, [])
    const isDesktop = useMediaQuery({
        query: '(min-width: 769px)',
    })

    if (!isClient) {
        return null
    }
    return (
        <div>
            {isDesktop ? (
                <>
                    <HeaderDesktop />
                    <main className="bg-[#101030]">
                        <HomePageDesktop />
                        <PromoDesktop />
                    </main>
                    <FooterDesktop />
                </>
            ) : (
                <>
                    <HeaderMobi />
                    <main className="bg-[#101030]">
                        <button>Send</button>
                        <HomePageMobi />
                    </main>
                    <FooterMobi />
                    <PromoMobi />
                </>
            )}
        </div>
    )
}
