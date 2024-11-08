import React from 'react'
import Link from 'next/link'

import { contentFooterMobi } from './contentFooterMobi'
//добавить иконки в мобильной версию!!!!
import { TelegramIcon, InstagramIcon, VkIcon } from '@/components/assets/icons'

const FooterMobi: React.FC = () => {
    return (
        <>
            <footer
                className="flex items-center h-[639px] border border-red-500 border-solid"
                style={{
                    backgroundColor: 'rgb(16,16,48)',
                    backgroundImage: `linear-gradient(rgba(16,16,48,0.5), rgba(16,16,48,0.5)), url(/background/bgFooterMobi.png)`,
                    backgroundSize: 'cover',
                }}
            >
                <div className="container flex flex-col items-center justify-between border border-green-500 border-solid">
                    <TelegramIcon className="w-[58px] h-[48px]" />
                    <div className="flex justify-between w-full border border-red-500 border-solid">
                        {contentFooterMobi.map((section) => (
                            <div key={section.id}>
                                <p className="text-white text-3xl font-semibold pb-4">{section.title}</p>
                                <ul>
                                    {section.links.map((link, linkIndex) => (
                                        <li
                                            key={linkIndex}
                                            className={`text-white text-base font-medium ${linkIndex !== section.links.length - 1 ? 'pb-4' : ''} `}
                                        >
                                            <Link href={link.href}>{link.name}</Link>
                                        </li>
                                    ))}
                                </ul>
                            </div>
                        ))}
                    </div>
                    <div className="flex justify-between max-w-[112px] w-full py-10">
                        <a href="#" target="_blank" rel="noopener noreferrer">
                            <TelegramIcon />
                        </a>
                        <a href="#" target="_blank" rel="noopener noreferrer">
                            <InstagramIcon />
                        </a>
                        <a href="#" target="_blank" rel="noopener noreferrer">
                            <VkIcon />
                        </a>
                    </div>
                    <div className="w-full h-[2px] bg-[#878797] rounded-full"></div>
                    <div className="flex justify-between max-w-[1190px] custom-grey">Тут будут иконки</div>
                    <p className="max-w-[896px] custom-grey text-xs font-medium text-center pt-6 pb-4">
                        ООО “Надежные программы” УНП 100160363. 220006, Республика Беларусь, г. Минск, ул. Аранская 8,
                        блок 1, эт. 4 Свидетельство о госдарственной регистрации №100160363, выдано Минским
                        горисполкомом 26.10.2023 г. Интернет-магазин включен в Торговый реестр Республики Беларусь
                        01.01.2001 за №111111
                    </p>
                    <p className="text-white text-xs font-medium text-center">
                        funscrut .by © 2023, ООО «funscrut» УНП 000000000
                    </p>
                </div>
            </footer>
        </>
    )
}
export default FooterMobi
