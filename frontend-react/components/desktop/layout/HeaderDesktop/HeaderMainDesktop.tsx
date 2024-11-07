'use client'
import React from 'react'
import Link from 'next/link'
import FunscrutLogo from './FunscrutLogo'
import { Button } from '@/components/ui/button'
import { ForwardIcon } from '@/components/assets/icons'

const HeaderMainDesktop: React.FC = () => {
    return (
        <>
            <div className="flex w-3/5 flex-col">
                <div>
                    <FunscrutLogo />
                    <p className="3xl:mb-[68px] mb-[100px] text-[clamp(18px,_1.5vw,_32px)] font-medium text-white 2xl:mb-[56px]">
                        Помогаем пройти стажировку в интересующей профессии и компании, независимо от наличия опыта и
                        навыков
                    </p>
                </div>
                <div className="group inline-flex w-fit items-center">
                    <Link href="/professions">
                        <Button
                            variant="accent_desktop"
                            size="wide_desktop"
                            className="group-hover:shadow_desktop_custom"
                        >
                            <span className="gradient-text-desktop-custom textResponsive px-[30px] 2xl:px-[20px]">
                                Выбрать профессию
                            </span>
                        </Button>
                    </Link>
                    <Link href="/professions">
                        <Button
                            variant="accent_desktop"
                            size="circle_desktop"
                            className="group-hover:button-shadow_right_desktop_custom"
                        >
                            <ForwardIcon />
                        </Button>
                    </Link>
                </div>
            </div>
        </>
    )
}
export default HeaderMainDesktop
