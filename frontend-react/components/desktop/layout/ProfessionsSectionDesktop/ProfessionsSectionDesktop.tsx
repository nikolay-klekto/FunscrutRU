'use client'

import React from 'react'
import TitleDesktop from '@/components/desktop/shared/TitleDesktop'
import ProfessionCardDesktop from '@/components/desktop/layout/ProfessionsSectionDesktop/ProfessionCardDesktop'
import { Button } from '@/components/ui/button'
import ProfessionSearchField from './ProfessionSearchFieldDesktop'
import { content } from '@/components/desktop/layout/ProfessionsSectionDesktop/content'

interface ProfessionsSectionDesktopProps {
    cardsToShow?: number
}

const ProfessionsSectionDesktop: React.FC<ProfessionsSectionDesktopProps> = ({ cardsToShow = 4 }) => {
    return (
        <div className="container flex flex-col gap-[80px] py-[100px]">
            <div className="mb-35xl">
                <TitleDesktop title={'Профессии'} href={'#'} />
            </div>
            <div className="flex items-center justify-between">
                <p className="text-13xl 3xl:text-11xl font-medium uppercase text-white 2xl:text-9xl">
                    Наиболее популярные профессии
                </p>
                <Button variant={'select_desktop'} size={'gradient_border_btn'}>
                    Смотреть все
                </Button>
            </div>
            <div className="w-fill 3xl:gap-[28px] grid h-[clamp(450px,_470px,_520px)] grid-cols-4 gap-[32px] ">
                {content.slice(0, cardsToShow).map((item) => (
                    <ProfessionCardDesktop
                        key={item.id}
                        image={item.image}
                        profession={item.profession}
                        price={item.price.toString()}
                    />
                ))}
            </div>
            <ProfessionSearchField />
        </div>
    )
}
export default ProfessionsSectionDesktop
