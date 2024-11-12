import { ReactNode } from 'react'

import { TelegramIconDesktop, InstagramIconDesktop, VkIconDesktop } from '@/components/assets/icons'

interface FooterIconLink {
    name: ReactNode
    href: string
}

interface FooterLink {
    name: string
    href: string
}

interface FooterSection {
    id: number
    title: string
    links: FooterLink[]
    icons?: FooterIconLink[]
}

export const contentFooterDesktop: FooterSection[] = [
    {
        id: 1,
        title: 'Информация',
        links: [
            { name: 'Главная', href: '#' },
            { name: 'Профессии', href: '#' },
            { name: 'Компании', href: '#' },
            { name: 'Мероприятия', href: '#' },
        ],
    },
    {
        id: 2,
        title: 'Личный кабинет',
        links: [
            { name: 'Корзина', href: '#' },
            { name: 'Предстоящие стажировки', href: '#' },
            { name: 'Архив', href: '#' },
            { name: 'Мой профиль', href: '#' },
        ],
    },
    {
        id: 3,
        title: 'Контакты',
        links: [
            { name: '+375 (29) 123 45 67', href: 'tel:+375291234567' },
            { name: 'abcd@mail.com', href: 'mailto:abcd@mail.com' },
        ],
        icons: [
            { name: <TelegramIconDesktop />, href: '#' },
            { name: <InstagramIconDesktop />, href: '#' },
            { name: <VkIconDesktop />, href: '#' },
        ],
    },
    {
        id: 4,
        title: 'Документы',
        links: [
            { name: 'Политика конфиденциальности', href: '#' },
            { name: 'Условия оплаты', href: '#' },
        ],
    },
]
