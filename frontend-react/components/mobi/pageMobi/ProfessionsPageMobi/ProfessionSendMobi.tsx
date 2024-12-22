import React, { useState } from 'react'
import { Button } from '@/components/ui/button'
import { EnhancedInput } from '@/components/ui/input'

const ProfessionSendMobi: React.FC = () => {
    const [isFocused, setIsFocused] = useState(false)
    /*для отправки запроса профессии*/
    const [useRequest, setUseRequest] = useState('')

    const handleSendRequest = () => {
        console.log('Отправка запроса на профессию:', useRequest)
        setUseRequest('')
    }
    return (
        <div className="flex flex-col gap-[36px]">
            <div className="text36px_mobi mx-auto text-center font-medium uppercase">
                <p>Вас интересуют другие профессии?</p>
                <p>Напишите, и мы найдем стажировку ДЛЯ вас</p>
            </div>
            <div className="justify-bitween mx-auto flex items-center gap-[45px]">
                <EnhancedInput
                    type="text"
                    value={useRequest}
                    onChange={(value) => setUseRequest(value)}
                    variant={'search_mobi'}
                    size={'search_mobi'}
                    rounded={'full'}
                    wrapperClassName="justify-bitween 4xl:w-[750px] 3xl:w-[700px] relative flex h-[64px] w-[800px] rounded-[50px] p-[3px] 2xl:w-[600px] border-[3px] border-[#878797] bg-transparent"
                    onFocus={() => setIsFocused(true)}
                    onBlur={() => setIsFocused(false)}
                />
                <Button
                    variant={'select_mobi'}
                    size={'select_mobi'}
                    className="3xl:text-4xl 2xl:text-3xl"
                    onClick={handleSendRequest}
                >
                    Отправить
                </Button>
            </div>
        </div>
    )
}
export default ProfessionSendMobi