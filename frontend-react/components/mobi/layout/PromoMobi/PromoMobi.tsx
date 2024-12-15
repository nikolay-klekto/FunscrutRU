import React from 'react'
import { Button } from '@/components/ui/button'
import { ArrowBtn } from '@/components/assets/iconsMobi'

const PromoMobi: React.FC = () => {
    return (
        <div className="w-full px-[15px]">
            <div
                style={{
                    backgroundImage: 'url(/background/background-promo.webp)',
                    backgroundSize: 'cover',
                    backgroundRepeat: 'no-repeat',
                    backgroundPosition: 'center',
                }}
                className="mx-auto h-[496px] w-full rounded-[40px] px-[13px] pb-[14px] pt-[84px]"
            >
                <h3 className="m-0 w-[320px] text-9xl font-medium leading-tight text-white">
                    РЕГИСТРИРУЙСЯ, ВЫБИРАЙ ПРОФЕССИЮ И&nbsp;КОМПАНИЮ, ПОЛУЧАЙ НОВЫЕ ЗНАНИЯ И ОПЫТ
                </h3>
                <p className="mt-[63px] w-[300px] text-sm leading-tight tracking-wider text-white">
                    Пройди стажировку в абсолютно разных компаниях на многообразнейших понравившихся профессиях
                </p>

                <div className="mt-[33px] flex justify-center">
                    <Button variant="registration_mobi" size="promo_mobi" className="flex-1">
                        <span className="bg-gradient-to-r from-[#8333F3] to-[#3B51A8] bg-clip-text text-4xl text-transparent">
                            Найти стажировку
                        </span>
                    </Button>
                    <Button variant="arrow_mobi" size="promo_mobi">
                        <ArrowBtn width={30} height={30} />
                    </Button>
                </div>
            </div>
        </div>
    )
}

export default PromoMobi
