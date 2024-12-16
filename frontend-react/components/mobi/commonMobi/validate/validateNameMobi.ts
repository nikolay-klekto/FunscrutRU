export function validateNameMobi(name: string) {
    const nameRegex = /^[a-zA-Zа-яА-ЯёЁ\s'-]+$/
    const isValid = nameRegex.test(name)

    return {
        status: isValid,
        textError: isValid ? '' : 'Введите корректное имя',
        styleError: !isValid,
    }
}
