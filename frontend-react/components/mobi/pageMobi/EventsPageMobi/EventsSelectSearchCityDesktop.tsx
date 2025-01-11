import React, { useState } from 'react'
import { ChevronDownIcon } from '@/components/assets/icons'
import { Button } from '@/components/ui/button'

import { Check } from 'lucide-react'

import { Command, CommandEmpty, CommandGroup, CommandInput, CommandItem, CommandList } from '@/components/ui/command'
import { Popover, PopoverContent, PopoverTrigger } from '@/components/ui/popover'

const cities = [
    { value: 'minsk', label: 'Минск' },
    { value: 'brest', label: 'Брест' },
    { value: 'vitebsk', label: 'Витебск' },
    { value: 'gomel', label: 'Гомель' },
    { value: 'grodno', label: 'Гродно' },
    { value: 'mogilev', label: 'Могилев' },
]

const EventsSelectSearchDateDesktop = () => {
    const [open, setOpen] = useState(false)
    const [value, setValue] = useState('')

    const [isOpen, setIsOpen] = useState(false)
    const handleSelectToggle = () => {
        setIsOpen((prev) => !prev)
    }

    return (
        <Popover open={open} onOpenChange={setOpen}>
            <PopoverTrigger asChild className="relative z-[3]">
                <Button
                    variant={'select_btn_desktop'}
                    size={'select_btn_desktop_events'}
                    onClick={handleSelectToggle}
                    className={`relative z-[3] ${isOpen ? ' bg-gradient-desktop' : 'bg-[#101030]'}`}
                    role="combobox"
                    aria-expanded={open}
                >
                    Город
                    <ChevronDownIcon
                        className={`h-[15px] w-[27px] transition-transform  duration-200 2xl:w-[20px] ${isOpen ? 'rotate-180' : ''}`}
                    />
                </Button>
            </PopoverTrigger>
            <PopoverContent
                className="3xl:w-[300px] absolute right-0 top-[13px] z-50 w-[400px] rounded-[42px] p-[2px] 2xl:w-[270px]"
                style={{
                    background: 'linear-gradient(90deg, #8333f3, #5f4af3, #3b51a8)',
                }}
            >
                <Command className="flex flex-col gap-1 rounded-[42px] bg-[#1F203F] p-3">
                    <CommandInput placeholder="Поиск" />
                    <CommandList>
                        <CommandEmpty>Не найден.</CommandEmpty>
                        <CommandGroup>
                            {cities.map((cities) => (
                                <CommandItem
                                    key={cities.value}
                                    value={cities.value}
                                    onSelect={(currentValue) => {
                                        setValue(currentValue === value ? '' : currentValue)
                                        setOpen(false)
                                    }}
                                >
                                    {cities.label}
                                    <Check
                                        className={`ml-auto ${value === cities.value ? 'opacity-100' : 'opacity-0'}`}
                                    />
                                </CommandItem>
                            ))}
                        </CommandGroup>
                    </CommandList>
                </Command>
            </PopoverContent>
        </Popover>
    )
}

export default EventsSelectSearchDateDesktop

/*interface SelectItemProps {
    value: string
    children: React.ReactNode
    isChecked: boolean
    onClick: () => void
}

interface SelectOption {
    value: string
    label: string
}

const EventsSelectSearchDateDesktop = () => {
    const [isOpen, setIsOpen] = useState(false)
    const [selectedOptions, setSelectedOptions] = useState<string[]>([])

    const toggleOption = (value: string) => {
        setSelectedOptions((prev) =>
            prev.includes(value) ? prev.filter((option) => option !== value) : [...prev, value],
        )
    }

    const handleSelectToggle = () => {
        setIsOpen((prev) => !prev)
    }

    const options: SelectOption[] = [
        { value: 'minsk', label: 'Минск' },
        { value: 'brest', label: 'Брест' },
        { value: 'conferences', label: 'Конференции' },
        { value: 'master_classes', label: 'Мастер-классы/семинары/тренинги' },
        { value: 'internships', label: 'Стажировки' },
        { value: 'job_fairs', label: 'Ярмарки вакансий' },
    ]

    return (
        <div className="relative z-[3]">
            <Button
                variant={'select_btn_desktop'}
                size={'select_btn_desktop_events'}
                onClick={handleSelectToggle}
                className={` ${isOpen ? ' bg-gradient-desktop' : 'bg-[#101030]'}`}
            >
                Город
                <ChevronDownIcon
                    className={`h-[15px] w-[27px] transition-transform  duration-200 2xl:w-[20px] ${isOpen ? 'rotate-180' : ''}`}
                />
            </Button>
            {isOpen && (
                <div
                    className="3xl:w-[300px] absolute right-0 top-[80px] z-50 w-[400px] rounded-[42px] p-[2px] 2xl:w-[270px]"
                    style={{
                        background: 'linear-gradient(90deg, #8333f3, #5f4af3, #3b51a8)',
                    }}
                >
                    <div className="flex flex-col gap-1 rounded-[42px] bg-[#1F203F] p-3">
                        {options.map((option) => (
                            <SelectItem
                                key={option.value}
                                value={option.value}
                                isChecked={selectedOptions.includes(option.value)}
                                onClick={() => toggleOption(option.value)}
                            >
                                {option.label}
                            </SelectItem>
                        ))}
                    </div>
                </div>
            )}
        </div>
    )
}

const SelectItem = React.forwardRef<HTMLDivElement, SelectItemProps>(
    ({ children, isChecked, onClick, ...props }, forwardedRef) => {
        return (
            <div
                className={`relative z-[3] flex cursor-pointer items-center justify-between rounded-[18px] p-[15px] text-[15px] font-medium ${
                    isChecked ? 'bg-[#5F4AF30F] text-white' : 'bg-transparent text-[#878797]'
                }`}
                {...props}
                ref={forwardedRef}
                onClick={onClick}
                role="menuitem"
                tabIndex={0}
                onKeyDown={(e) => {
                    if (e.key === 'Enter' || e.key === ' ') {
                        e.preventDefault()
                        onClick()
                    }
                }}
            >
                <div className="flex ">
                    <div className="pl-[14px]">{children}</div>
                </div>
            </div>
        )
    },
)

SelectItem.displayName = 'SelectItem'

export default EventsSelectSearchDateDesktop*/
