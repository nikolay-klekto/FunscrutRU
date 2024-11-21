import React from 'react'

import { Button } from '@/components/ui/button'
import { Input } from '@/components/ui/input'
import { contentContactsDesktop, contentSocialContactsDesktop } from './contentContactsDesktop'

const ContactsDesktop: React.FC = () => {
    return (
        <>
            <div className="flex justify-between pt-52 pb-[297px]">
                <div className="flex flex-col gap-7 max-w-[541px] mr-24 3xl:mr-20 2xl:mr-20 border border-red-500">
                    <h2 className="text-26xl font-semibold uppercase 3xl:text-23xl  2xl:text-22xl">Cвяжитесь с нами</h2>
                    <Button variant="select_desktop" size="contacts_btn">
                        Хочу в команду
                    </Button>
                </div>
                <div className="w-[1020px] border border-red-500">
                    <div className="flex justify-between">
                        <div className="flex flex-col">
                            {contentContactsDesktop.map((item) => (
                                <div
                                    key={item.id}
                                    className={`${item.id !== contentContactsDesktop.length ? 'pb-[60px]' : ''}`}
                                >
                                    <p className="pb-[5px] text-7xl font-semibold text-white/50">{item.title}</p>
                                    {item.href ? (
                                        <a
                                            href={item.href}
                                            target="_blank"
                                            rel="noopener noreferrer"
                                            className="text-15xl font-semibold"
                                        >
                                            {item.value}
                                        </a>
                                    ) : (
                                        <p className="text-14xl font-semibold">{item.value}</p>
                                    )}
                                </div>
                            ))}
                        </div>
                        <div className="flex flex-col justify-between pt-2.5">
                            {contentSocialContactsDesktop.map((item) => (
                                <div key={item.id} className="flex items-center gap-5 max-w-[376px]">
                                    <div>
                                        <a
                                            href={item.href}
                                            className="flex items-center justify-center w-[58px] h-[62px] rounded-full bg-gradient-desktop"
                                        >
                                            {item.icon}
                                        </a>
                                    </div>
                                    <p className="text-7xl font-medium">{item.name}</p>
                                </div>
                            ))}
                        </div>
                    </div>
                    <div className="w-full h-[1px] bg-white/50 rounded-full mt-[99px] mb-[63px]"></div>
                    <div>
                        <h3 className="text-20xl font-semibold uppercase">Напишите нам</h3>
                        <form action="">
                            <div className="flex justify-between pb-12 pt-14">
                                <div className="flex flex-col gap-[33px]">
                                    <label htmlFor="name" className="sr-only">
                                        Имя
                                    </label>
                                    <Input
                                        type="text"
                                        id="name"
                                        placeholder="Имя*"
                                        className="h-[53px] w-[452px] rounded-[53px] px-4 py-3.5 text-5xl bg-transparent ring-offset-transparent"
                                        style={{ border: '2px solid #878797' }}
                                        required
                                    />
                                    <label htmlFor="email" className="sr-only">
                                        E-mail
                                    </label>
                                    <Input
                                        type="email"
                                        id="email"
                                        placeholder="E-mail*"
                                        className="h-[53px] w-[452px] rounded-[53px] px-4 py-3.5 text-5xl bg-transparent ring-offset-transparent"
                                        style={{ border: '2px solid #878797' }}
                                        required
                                    />
                                </div>
                                <div className="flex flex-col gap-[33px] pl-3">
                                    <label htmlFor="tel" className="sr-only">
                                        Телефон
                                    </label>
                                    <Input
                                        type="tel"
                                        id="tel"
                                        placeholder="Телефон*"
                                        className="h-[53px] w-[484px] rounded-[53px] px-4 py-3.5 text-5xl bg-transparent ring-offset-transparent border-[2px] border-[#878797] 3xl:w-[452px] 2xl:w-[452px]"
                                        required
                                    />
                                    <label htmlFor="role" className="sr-only">
                                        Клиент/партнер/соискатель
                                    </label>
                                    <Input
                                        type="text"
                                        id="role"
                                        placeholder="Клиент/партнер/соискатель"
                                        className="h-[53px] w-[484px] rounded-[53px] px-4 py-3.5 text-5xl bg-transparent ring-offset-transparent border-[2px] border-[#878797] 3xl:w-[452px] 2xl:w-[452px]"
                                        required
                                    />
                                </div>
                            </div>
                            <label htmlFor="message" className="sr-only">
                                Опишите свой вопрос
                            </label>
                            <textarea
                                name="message"
                                id="message"
                                placeholder="Опишите свой вопрос*"
                                className="h-60 w-full rounded-[33px] px-4 py-3.5 text-5xl bg-transparent ring-offset-transparent focus:outline-none border-[2px] border-[#878797] placeholder:text-muted-foreground"
                                required
                            />
                            <div className="flex justify-between pt-[60px]">
                                <Button variant="select_desktop" size="contacts_btn_send">
                                    Отправить
                                </Button>
                                <p className="max-w-[663px] pl-3 text-white/20 text-[17px] font-medium">
                                    Нажимая кнопку “Отправить”, я даю согласие на обработку своих персональных данных и
                                    соглашаюсь с Условиями использования и Политикой конфиденциальности
                                </p>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </>
    )
}

export default ContactsDesktop
