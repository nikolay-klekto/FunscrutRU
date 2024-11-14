'use client'

import React from 'react'
import { ArrowWhiteMobi } from '@/components/assets/iconsMobi'
import { Button } from '@/components/ui/button'

interface HeaderCardItemDesktop {
    textBlack: string
    textColor: string
    textBlackBr: string
    price: number
    currency: string
}

const HeaderCardsItemMobi: React.FC<HeaderCardItemDesktop> = ({
    textBlack,
    textColor,
    textBlackBr,
    price,
    currency,
}) => {
    return (
        <>
            <div
                className="sm_s:min-h-[192px] m-auto flex min-h-[212px] w-[346px] items-center justify-center rounded-[41px] drop-shadow-[0_3.26px_3.26px_rgba(0,0,0,0.25)] sm:min-h-[176px]"
                style={{
                    backgroundImage: "url('/background/subtract_mobi.svg')",
                    backgroundSize: 'cover',
                    backgroundPosition: 'center, center',
                    backgroundRepeat: 'no-repeat, no-repeat',
                }}
            >
                <div className="flex flex-1 flex-col items-center justify-center gap-[30px]">
                    <div className="sm_s:text-3xl sm_s:leading-[24px] px-[30px] text-justify text-5xl font-medium leading-[32px] text-white sm:text-3xl sm:leading-[24px]">
                        {textBlack}{' '}
                        <span className="bg-sub-title-gradient-mobi20 rounded-[20px] px-[4px] font-bold text-white sm:px-[2px]">
                            {textColor}{' '}
                        </span>
                        {textBlackBr}
                    </div>
                    <div className="text28px_mobi font-medium text-white">
                        {price} {currency}
                    </div>
                    <Button variant="circleBlue" size="circleMobi" className="absolute bottom-0 right-0">
                        <ArrowWhiteMobi />
                    </Button>
                </div>
            </div>
        </>
    )
}
export default HeaderCardsItemMobi
