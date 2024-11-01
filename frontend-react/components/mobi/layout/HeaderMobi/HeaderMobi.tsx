'use client'

import React from 'react'

import { LogoIcon } from '@/components/asssets/icons'
import HeaderNavigationMobi from './HeaderNavigationMobi'
import { ShoppingCartIcon, ProfileIcon } from '@/components/asssets/icons'
import { Button } from '@/components/ui/button'

const HeaderMobi: React.FC = () => {
    return (
        <>
            <header
                className="relative flex justify-center pt-[34px] pb-[35px] px-[59px] bg-[rgba(16,16,48,0.7)] border border-red-500 border-solid"
                style={{
                    backgroundImage: 'url(/background/colorBackground.png)',
                    backgroundSize: 'cover',
                }}
            >
                <div className="absolute inset-0 bg-[rgba(16,16,48,0.7)]"></div>
                <div className="relative w-full max-w-[1800px] justify-between flex items-center z-10 border border-red-500 border-solid">
                    <div className="flex flex-col justify-center items-center border border-red-500 border-solid">
                        <LogoIcon className="2xl:w-[46px] 2xl:h-[46px] xl:w-[46px] xl:h-[42px] lg:w-[46px] lg:h-[36px] md:w-[46px] md:h-[36px]" />
                        <p className="text-white text-4xl font-semibold whitespace-nowrap 4xl:text-2xl 3xl:text-xl 2xl:text-lg xl:text-xs lg:text-xs md:text-xs">
                            FUN SCRUT
                        </p>
                    </div>
                    <div className="flex gap-[32px] 4xl:gap-[2vw] 3xl:gap-[10px] 2xl:gap-[10px] xl:gap-[20px] lg:gap-[10px] md:gap-[10px]">
                        <Button variant="header_desktop_btn_gradient" size="header_btn">
                            Заказать звонок
                        </Button>
                    </div>
                    <div className="flex gap-[50px] 4xl:gap-[1.5vw] 3xl:gap-[20px] 2xl:gap-[1.5vw] xl:gap-[1.5vw] lg:gap-[1.5vw] md:gap-[1.5vw]">
                        <ShoppingCartIcon className="flex-shrink-0 w-[50px] h-[50px] 4xl:w-[40px] 4xl:h-[40px] 3xl:w-[36px] 3xl:h-[36px] 2xl:w-[30px] 2xl:h-[30px] xl:w-[24px] xl:h-[24px] lg:w-[20px] lg:h-[20px] md:w-[20px] md:h-[20px]" />
                        <ProfileIcon className="flex-shrink-0 w-[50px] h-[50px] 4xl:w-[40px] 4xl:h-[40px] 3xl:w-[36px] 3xl:h-[36px] 2xl:w-[30px] 2xl:h-[30px] xl:w-[24px] xl:h-[24px] lg:w-[20px] lg:h-[20px] md:w-[20px] md:h-[20px]" />
                    </div>
                </div>
            </header>
        </>
    )
}
export default HeaderMobi
