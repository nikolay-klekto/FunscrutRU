import React, { useState } from 'react'
import { Button } from '@/components/ui/button'
import { EnhancedInput } from '@/components/ui/input'
import { ForwardIcon } from '@/components/assets/icons'

const ProfessionSendMobi: React.FC = () => {
    const [isFocused, setIsFocused] = useState(false)
    const [useRequest, setUseRequest] = useState('')

    const handleSendRequest = () => {
        console.log('Отправка запроса на профессию:', useRequest)
        setUseRequest('')
    }

    return (
        <div className=" flex flex-col">
            <p className=" sm_xl:text-4xl sm_l:text-3xl sm_s:text-3xl mx-auto mb-[30px] text-[20px] font-semibold text-white sm:text-3xl md:text-5xl">
                Предложите, в какой ещё профессии вы бы ещё хотели попробовать себя
            </p>
            <div className="justify-bitween mx-auto flex w-full max-w-[450px] gap-[7px]">
                <EnhancedInput
                    type="text"
                    value={useRequest}
                    onChange={(e) => setUseRequest(e.target.value)}
                    variant={'search_mobi'}
                    size={'send_mobi'}
                    rounded={'rounded_50'}
                    wrapperClassName="w-full h-[44px] rounded-[50px] justify-bitween flex border-[2px] border-[#878797] bg-transparent p-[2px]"
                    onFocus={() => setIsFocused(true)}
                    onBlur={() => setIsFocused(false)}
                />
                <Button variant={'select_mobi'} size={'gradient_circle_mobi'} onClick={handleSendRequest}>
                    <ForwardIcon />
                </Button>
            </div>
        </div>
    )
}
export default ProfessionSendMobi
