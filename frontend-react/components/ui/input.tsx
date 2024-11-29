import * as React from 'react'
import { cva, type VariantProps } from 'class-variance-authority'
import { cn } from '@/lib/utils'

const inputVariants = cva(
    'flex w-full rounded-md border text-sm ring-offset-background transition-colors file:border-0 file:bg-transparent file:text-sm file:font-medium placeholder:text-muted-foreground focus-visible:outline-none disabled:cursor-not-allowed disabled:opacity-50',
    {
        variants: {
            variant: {
                default:
                    'border-input bg-background focus-visible:ring-2 focus-visible:ring-ring focus-visible:ring-offset-2',
            },
            size: {
                default: 'h-10 px-3 py-2',
            },
            rounded: {
                default: 'rounded-md',
            },
        },
        defaultVariants: {
            variant: 'default',
            size: 'default',
            rounded: 'default',
        },
    },
)

export interface EnhancedInputProps
    extends Omit<React.InputHTMLAttributes<HTMLInputElement>, 'size' | 'onChange'>,
        VariantProps<typeof inputVariants> {
    validate?: (value: string) => string | undefined
    error?: string
    onChange?: (value: string) => void
    onFocus?: () => void
    onBlur?: () => void
    label?: string
    helperText?: string
    wrapperClassName?: string
}

const EnhancedInput = React.forwardRef<HTMLInputElement, EnhancedInputProps>(
    (
        {
            className,
            type,
            variant,
            size,
            rounded,
            validate,
            error,
            onChange,
            onFocus,
            onBlur,
            label,
            helperText,
            wrapperClassName,
            ...props
        },
        ref,
    ) => {
        const [internalValue, setInternalValue] = React.useState<string>((props.value as string) || '')
        const [internalError, setInternalError] = React.useState<string | undefined>(error)
        const [isFocused, setIsFocused] = React.useState(false)

        React.useEffect(() => {
            if (props.value !== undefined) {
                setInternalValue(props.value as string)
            }
        }, [props.value])

        React.useEffect(() => {
            setInternalError(error)
        }, [error])

        const handleChange = (e: React.ChangeEvent<HTMLInputElement>) => {
            const newValue = e.target.value
            setInternalValue(newValue)

            if (validate) {
                const validationError = validate(newValue)
                setInternalError(validationError)
            }

            onChange?.(newValue)
        }

        const handleFocus = (e: React.FocusEvent<HTMLInputElement>) => {
            setIsFocused(true)
            onFocus?.()
        }

        const handleBlur = (e: React.FocusEvent<HTMLInputElement>) => {
            setIsFocused(false)
            onBlur?.()
            if (validate) {
                const validationError = validate(internalValue)
                setInternalError(validationError)
            }
        }

        return (
            <div className={cn('flex flex-col gap-1.5', wrapperClassName)}>
                {label && <label className="text-sm font-medium text-foreground">{label}</label>}
                <input
                    type={type}
                    className={cn(
                        inputVariants({ variant, size, rounded }),
                        isFocused && 'ring-2 ring-ring ring-offset-2',
                        className,
                    )}
                    ref={ref}
                    value={internalValue}
                    onChange={handleChange}
                    onFocus={handleFocus}
                    onBlur={handleBlur}
                    {...props}
                />
                {(helperText || internalError) && (
                    <span className={cn('text-xs', internalError ? 'text-destructive' : 'text-muted-foreground')}>
                        {internalError || helperText}
                    </span>
                )}
            </div>
        )
    },
)

EnhancedInput.displayName = 'EnhancedInput'

export { EnhancedInput, inputVariants }
