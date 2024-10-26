'use client'

import React from 'react'
import Link from 'next/link'
import { usePathname } from 'next/navigation'

const HeaderNavigationDesktop: React.FC = () => {
    const pathname = usePathname()

    const isActive = (path: string) => pathname === path

    return (
        <nav className="inline-block bg-[#101030] p-4 ">
            <ul className="inline-flex justify-evenly align-middle bg-white rounded-[50px] p-1">
                <li
                    className={
                        isActive('/')
                            ? 'text-white bg-gradient-desktop rounded-[50px] flex justify-center items-center'
                            : 'bg-gradient-desktop hover:bg-gradient-desktop-hover bg-clip-text text-transparent flex justify-center items-center'
                    }
                >
                    <Link
                        href="/"
                        className="font-bold text-4xl leading-[22px] uppercase  lg:px-[15px] lg:py-[5px] xl:px-[30px] xl:py-[10px] px-[57.5px] py-[19px]
"
                    >
                        Главная
                    </Link>
                </li>
                <li
                    className={
                        isActive('/professions')
                            ? 'text-white bg-gradient-desktop rounded-[50px] flex justify-center items-center'
                            : 'bg-gradient-desktop hover:bg-gradient-desktop-hover bg-clip-text text-transparent flex justify-center items-center'
                    }
                >
                    <Link
                        href="/professions"
                        className="font-bold text-4xl leading-[22px] uppercase  lg:px-[15px] lg:py-[5px] xl:px-[30px] xl:py-[10px] px-[57.5px] py-[19px]"
                    >
                        Профессии
                    </Link>
                </li>
                <li
                    className={
                        isActive('/companies')
                            ? 'text-white bg-gradient-desktop rounded-[50px] flex justify-center items-center'
                            : 'bg-gradient-desktop hover:bg-gradient-desktop-hover bg-clip-text text-transparent flex justify-center items-center'
                    }
                >
                    <Link
                        href="/companies"
                        className="font-bold text-4xl leading-[22px] uppercase  lg:px-[15px] lg:py-[5px] xl:px-[30px] xl:py-[10px] px-[57.5px] py-[19px]"
                    >
                        Компании
                    </Link>
                </li>
                <li
                    className={
                        isActive('/profevents')
                            ? 'text-white bg-gradient-desktop rounded-[50px] flex justify-center items-center'
                            : 'bg-gradient-desktop hover:bg-gradient-desktop-hover bg-clip-text text-transparent flex justify-center items-center'
                    }
                >
                    <Link
                        href="/profevents"
                        className="font-bold text-4xl leading-[22px] uppercase lg:px-[15px] lg:py-[5px] xl:px-[30px] xl:py-[10px] px-[57.5px] py-[19px]"
                    >
                        Мероприятия
                    </Link>
                </li>
                <li
                    className={
                        isActive('/contacts')
                            ? 'text-white bg-gradient-desktop rounded-[50px] flex justify-center items-center'
                            : 'bg-gradient-desktop hover:bg-gradient-desktop-hover bg-clip-text text-transparent flex justify-center items-center'
                    }
                >
                    <Link
                        href="/contacts"
                        className="font-bold text-4xl leading-[22px] uppercase  lg:px-[15px] lg:py-[5px] xl:px-[30px] xl:py-[10px] px-[57.5px] py-[19px]"
                    >
                        Наши контакты
                    </Link>
                </li>
            </ul>
        </nav>
    )
}
export default HeaderNavigationDesktop
