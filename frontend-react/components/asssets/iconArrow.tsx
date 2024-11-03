import React from 'react'

interface ArrowBtnProps {
    width?: number
    height?: number
}

export const ArrowBtn: React.FC<ArrowBtnProps> = ({ width = 56, height = 56 }) => {
    return (
        <svg width={width} height={height} viewBox="0 0 56 56" fill="none" xmlns="http://www.w3.org/2000/svg">
            <path
                d="M48.2331 27.8018L29.5038 9.92383V20.1398C11.58 20.1398 7.36914 32.9918 7.36914 45.6798C12.5421 39.0564 17.1169 35.4638 29.5038 35.4638V45.6798L48.2331 27.8018Z"
                fill="url(#paint0_linear_782_18439)"
            />
            <defs>
                <linearGradient
                    id="paint0_linear_782_18439"
                    x1="4.043"
                    y1="28.2176"
                    x2="48.2331"
                    y2="28.2176"
                    gradientUnits="userSpaceOnUse"
                >
                    <stop stopColor="#8333F3" />
                    <stop offset="0.485532" stopColor="#5F4AF3" />
                    <stop offset="1" stopColor="#3B51A8" />
                </linearGradient>
            </defs>
        </svg>
    )
}
