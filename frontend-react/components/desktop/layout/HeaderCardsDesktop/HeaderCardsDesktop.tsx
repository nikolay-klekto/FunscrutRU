'use client'

import React from 'react'
import { content } from './content'
import { ArrowGradientDesktop } from '@/components/assets/iconsDesktop'
import { Button } from '@/components/ui/button'

const HeaderCardsDesktop: React.FC = () => {
    return (
        <>
            <div className="flex justify-between pt-[220px] ">
                <div>hfelfh</div>
                <div className="flex flex-col gap-[20px] p-[61px]">
                    {content.map((item) => (
                        <div
                            className="flex min-h-[260px] max-w-[426px] flex-1 flex-col justify-center gap-[26px] bg-[url('/background/subtract_desk.svg')] bg-no-repeat px-10 drop-shadow-[0_4px_4px_rgba(0,0,0,0.25)]"
                            key={item.id}
                        >
                            <div className="text-7xl font-medium">
                                {item.textBlack}{' '}
                                <span
                                    className="font-bold leading-[40px] bg-sub-title-gradient-desktop"
                                    style={{
                                        WebkitBackgroundClip: 'text',
                                        WebkitTextFillColor: 'transparent',
                                    }}
                                >
                                    {item.textColor}{' '}
                                </span>
                                {item.textBlackBr}
                            </div>
                            <div
                                className="bg-sub-title-gradient-desktop text-5xl font-semibold"
                                style={{
                                    WebkitBackgroundClip: 'text',
                                    WebkitTextFillColor: 'transparent',
                                }}
                            >
                                от{' '}
                                <span className="text-11xl font-medium">
                                    {item.price} {item.currency}/ {item.time}
                                </span>
                            </div>
                            <Button variant="circle" size="circleDesk" className="absolute bottom-0 right-0">
                                <ArrowGradientDesktop />
                            </Button>
                        </div>
                    ))}
                </div>
            </div>
        </>
    )
}
export default HeaderCardsDesktop
