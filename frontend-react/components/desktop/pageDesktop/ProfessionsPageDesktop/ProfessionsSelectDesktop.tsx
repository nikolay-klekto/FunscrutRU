import React, { useState } from 'react'
import { ChevronDownIcon, CheckedBoxIcon } from '@/components/assets/icons'
import { Button } from '@/components/ui/button'

interface SelectItemProps {
    value: string
    children: React.ReactNode
    isChecked: boolean
    onClick: () => void
}

interface SelectOption {
    value: string
    label: string
}

const ProfessionsSelectDesktop = () => {
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
        { value: 'IT', label: 'IT-отрасль' },
        { value: 'healthcare', label: 'Здравоохранение' },
        { value: 'art', label: 'Искусство' },
        { value: 'sport', label: 'Спорт' },
        { value: 'field5', label: 'Отрасль 5' },
        { value: 'field6', label: 'Отрасль 6' },
    ]

    return (
        <div className="relative z-[3]">
            <Button
                variant={'select_btn_desktop'}
                size={'select_btn_desktop'}
                onClick={handleSelectToggle}
                className={` ${isOpen ? ' bg-gradient-desktop' : 'bg-[#101030]'}`}
            >
                Отрасль профессии
                <ChevronDownIcon
                    className={`h-[15px] w-[27px] transition-transform  duration-200 2xl:w-[20px] ${isOpen ? 'rotate-180' : ''}`}
                />
            </Button>
            {isOpen && (
                <div
                    className="3xl:w-[300px] absolute top-[80px] z-50 w-[337px] rounded-[42px] p-[2px] 2xl:w-[270px]"
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
                className={`relative z-[3] flex cursor-pointer items-center gap-[14px] rounded-[18px] p-[15px] font-medium ${
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
                <div className="relative flex size-[20px] items-center justify-center">
                    <input
                        type="checkbox"
                        checked={isChecked}
                        onChange={(e) => {
                            e.stopPropagation()
                            onClick()
                        }}
                        className="absolute inset-0 size-full cursor-pointer opacity-0"
                    />
                    {isChecked ? (
                        <CheckedBoxIcon
                            style={{
                                position: 'absolute',
                                width: '30px',
                                height: '25px',
                            }}
                        />
                    ) : (
                        <div
                            className="absolute inset-0 z-[3] rounded-[3px]"
                            style={{
                                border: '2px solid #878797',
                                background: 'transparent',
                            }}
                        ></div>
                    )}
                </div>
                {children}
            </div>
        )
    },
)

SelectItem.displayName = 'SelectItem'

export default ProfessionsSelectDesktop
