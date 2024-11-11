import React, { SVGProps } from 'react'

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

export const ArrowGradientMobi: React.FC = (props) => {
    return (
        <svg width="22.5" height="19.69" viewBox="0 0 21 18" fill="none" xmlns="http://www.w3.org/2000/svg" {...props}>
            <path
                d="M20.0827 8.61822L11.4081 0.337891V5.06951C3.10656 5.06951 1.15625 11.022 1.15625 16.8986C3.55212 13.8309 5.671 12.1669 11.4081 12.1669V16.8986L20.0827 8.61822Z"
                fill="url(#paint0_linear_46_24033)"
                stroke="url(#paint1_linear_46_24033)"
                strokeWidth="0.647059"
                strokeLinejoin="round"
            />
            <defs>
                <linearGradient
                    id="paint0_linear_46_24033"
                    x1="-0.384277"
                    y1="8.81079"
                    x2="20.0827"
                    y2="8.81079"
                    gradientUnits="userSpaceOnUse"
                >
                    <stop stopColor="#8333F3" />
                    <stop offset="0.485532" stopColor="#5F4AF3" />
                    <stop offset="1" stopColor="#3B51A8" />
                </linearGradient>
                <linearGradient
                    id="paint1_linear_46_24033"
                    x1="-0.384277"
                    y1="8.81079"
                    x2="20.0827"
                    y2="8.81079"
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

export const ArrowWhiteMobi: React.FC = (props) => {
    return (
        <svg width="24" height="22" viewBox="0 0 24 22" fill="none" xmlns="http://www.w3.org/2000/svg" {...props}>
            <path
                d="M23.5 10.8438L13.1875 1V6.625C3.31856 6.625 1 13.7014 1 20.6875C3.84824 17.0406 6.36719 15.0625 13.1875 15.0625V20.6875L23.5 10.8438Z"
                fill="white"
                stroke="white"
                stroke-width="0.814815"
                stroke-linejoin="round"
            />
        </svg>
    )
}

export const ProfileIconMobi: React.FC<SVGProps<SVGSVGElement>> = (props) => {
    return (
        <svg width="30" height="30" viewBox="0 0 50 50" fill="none" xmlns="http://www.w3.org/2000/svg" {...props}>
            <path
                d="M25.2137 27.7859C30.1448 27.7859 34.1423 23.7884 34.1423 18.8573C34.1423 13.9262 30.1448 9.92871 25.2137 9.92871C20.2826 9.92871 16.2852 13.9262 16.2852 18.8573C16.2852 23.7884 20.2826 27.7859 25.2137 27.7859Z"
                stroke="white"
                strokeWidth="3"
                strokeLinecap="round"
                strokeLinejoin="round"
            />
            <path
                d="M9.96484 41.714C11.5586 39.098 13.7984 36.936 16.4692 35.4357C19.1399 33.9355 22.1516 33.1475 25.2148 33.1475C28.2781 33.1475 31.2898 33.9355 33.9605 35.4357C36.6312 36.936 38.8711 39.098 40.4648 41.714"
                stroke="white"
                strokeWidth="3"
                strokeLinecap="round"
                strokeLinejoin="round"
            />
            <path
                d="M48.5 25C48.5 37.9787 37.9787 48.5 25 48.5C12.0213 48.5 1.5 37.9787 1.5 25C1.5 12.0213 12.0213 1.5 25 1.5C37.9787 1.5 48.5 12.0213 48.5 25Z"
                stroke="white"
                strokeWidth="3"
                strokeLinecap="round"
                strokeLinejoin="round"
            />
        </svg>
    )
}

export const ShoppingCartIconMobi: React.FC<SVGProps<SVGSVGElement>> = (props) => {
    return (
        <svg width="24" height="24" viewBox="0 0 50 50" fill="none" xmlns="http://www.w3.org/2000/svg" {...props}>
            <path
                d="M18.7493 47.3337C20.7284 47.3337 22.3327 45.7293 22.3327 43.7503C22.3327 41.7713 20.7284 40.167 18.7493 40.167C16.7703 40.167 15.166 41.7713 15.166 43.7503C15.166 45.7293 16.7703 47.3337 18.7493 47.3337Z"
                stroke="white"
                strokeWidth="3"
                strokeLinecap="round"
                strokeLinejoin="round"
            />
            <path
                d="M41.6673 47.3337C43.6463 47.3337 45.2507 45.7293 45.2507 43.7503C45.2507 41.7713 43.6463 40.167 41.6673 40.167C39.6883 40.167 38.084 41.7713 38.084 43.7503C38.084 45.7293 39.6883 47.3337 41.6673 47.3337Z"
                stroke="white"
                strokeWidth="3"
                strokeLinecap="round"
                strokeLinejoin="round"
            />
            <path
                d="M2.08398 2.08301H10.4173L16.0007 29.9788C16.1912 30.938 16.713 31.7996 17.4747 32.4128C18.2365 33.026 19.1896 33.3517 20.1673 33.333H40.4173C41.395 33.3517 42.3482 33.026 43.1099 32.4128C43.8717 31.7996 44.3935 30.938 44.584 29.9788L47.9173 12.4997H12.5007"
                stroke="white"
                strokeWidth="3"
                strokeLinecap="round"
                strokeLinejoin="round"
            />
        </svg>
    )
}

export const LogoIconMobi: React.FC<SVGProps<SVGSVGElement>> = (props) => {
    return (
        <svg width="58" height="48" viewBox="0 0 100 83" fill="none" xmlns="http://www.w3.org/2000/svg" {...props}>
            <path
                d="M79.6017 28.6676C79.6017 28.772 79.6012 28.8764 79.6001 28.9806C78.6447 29.2558 76.0181 30.0098 74.1747 30.5159C73.0793 30.8166 71.3819 31.3446 70.3316 31.5281C69.2813 31.7115 67.0287 31.8028 65.0035 31.7402C62.7411 31.6703 59.4326 31.3865 56.4574 31.0955C53.4821 30.8044 48.6592 30.2608 45.5027 30.1619C32.48 29.7538 21.2659 32.4819 21.2659 32.4819L21.2582 32.5756C21.0879 31.297 21 29.9925 21 28.6676C21 27.1881 21.1097 25.734 21.3214 24.3132C22.0333 24.2163 29.4836 23.2329 37.4114 23.4241C39.5737 23.4762 41.7716 23.4873 43.8779 23.7793C54.1052 25.1973 62.3015 27.6046 68.6113 28.2255C74.8193 28.8364 79.4271 28.1548 79.5969 28.1292C79.6001 28.3082 79.6017 28.4877 79.6017 28.6676ZM78.6187 21.1099C76.8042 20.2456 72.5718 18.5272 72.5718 18.5272C72.5718 18.5272 69.5159 17.1772 68.0868 16.5772C62.2898 14.143 62.1335 13.8965 51.3983 10.094C40.6631 6.29144 33.4893 4.70217 33.4893 4.70217C33.4893 4.70217 33.4599 4.70543 33.4039 4.71185C36.2999 2.66026 39.5834 1.12099 43.1217 0.226329C43.1442 0.236153 43.1667 0.245992 43.1892 0.255848C62.4819 8.68491 73.4779 16.3387 77.0337 18.9378L78.1786 19.8089C78.1786 19.8089 78.2037 19.8189 78.2485 19.8356C78.3812 20.2563 78.5047 20.6812 78.6187 21.1099ZM78.0904 25.1932C76.5984 25.0045 76.3553 24.9404 74.6485 24.8402C73.5765 24.7773 72.2895 24.7366 71.5704 24.7154C70.8512 24.6942 69.2627 24.4261 67.5678 24.1591C66.1816 23.9407 64.6206 23.7355 64.4168 23.7095C64.1956 23.6812 63.9929 23.6527 63.8016 23.6239C63.3656 23.5584 62.9891 23.4917 62.5879 23.4241C57.7426 22.608 51.3137 21.4213 45.7107 20.6776C33.6766 19.0803 23.1083 18.2545 23.1083 18.2545L22.8716 18.3403C23.9134 15.5733 25.3615 13.0048 27.1429 10.7079C27.1545 10.7096 27.1661 10.7113 27.1777 10.713C29.1282 10.995 33.2355 11.7505 33.2355 11.7505C33.2355 11.7505 43.1022 13.681 48.034 14.953C52.6624 16.1468 57.2591 17.5125 61.3993 18.7354C64.7924 19.7376 68.126 20.7285 70.7496 21.5705C72.9193 22.267 74.7113 22.9636 76.1427 23.4557C77.9039 24.0611 79.0681 24.4079 79.3046 24.4774C79.3454 24.7625 79.3821 25.0489 79.4146 25.3366C79.0502 25.3042 78.604 25.2582 78.0904 25.1932ZM79.3261 32.7046C78.8699 33.0227 78.2667 33.4287 77.5721 33.8605C76.8423 34.3141 75.7384 34.8612 75.0394 35.426C74.873 35.5605 73.4075 36.3759 73.0052 36.6332C72.8137 36.7556 71.5846 37.6197 70.1477 38.2729C68.5656 38.9921 66.7503 39.5025 66.2217 39.5616C65.2131 39.6744 62.529 40.1325 57.2735 40.21C54.0177 40.258 50.6228 40.2648 47.633 40.3634C45.7967 40.4239 44.1457 40.5191 42.6777 40.6797C38.8371 41.0998 35.6748 42.0505 33.1616 42.7588C29.4026 43.8182 26.8925 44.8508 26.0955 45.1952C24.5342 42.9091 23.2876 40.3909 22.4183 37.7032C23.241 37.4338 30.7693 35.0276 39.7199 34.1784C45.7152 33.6097 54.0644 34.535 56.0247 34.7472C61.0871 35.2951 65.5986 35.732 69.5374 34.9878C74.5497 34.0407 78.3752 32.2288 79.4483 31.6857C79.4134 32.0271 79.3726 32.3667 79.3261 32.7046ZM78.3109 37.2991C78.1725 37.43 78.0035 37.5938 77.9206 37.6707C77.0195 38.5065 75.0166 40.5387 70.7911 44.7951C70.7435 44.8357 70.6971 44.8733 70.6534 44.9059C70.6041 44.9426 70.5561 44.9782 70.5093 45.0127L70.5084 45.0134C68.9983 46.1272 68.7871 46.0923 68.2713 46.3541C62.6574 49.2042 54.5572 49.3392 51.5626 49.7755C49.8004 50.0322 48.2614 50.2505 46.8817 50.5669C40.2952 52.0773 37.7671 54.1168 36.5849 54.5909C33.941 53.1851 31.5373 51.3859 29.4519 49.2713C31.5245 48.4086 39.5224 45.1528 43.6313 44.5377C48.3771 43.8271 52.9318 43.5917 55.7381 43.6665C58.5445 43.7412 59.901 43.5874 60.9703 43.5086C62.0396 43.4298 64.3613 43.3277 65.0296 43.1366C65.2558 43.0719 66.9783 42.9379 69.1749 42.0802C69.8427 41.8194 70.5925 41.5455 71.268 41.1148C71.6785 40.853 72.3353 40.4352 72.7583 40.21C73.8942 39.6052 74.9425 38.8396 75.8325 38.1828C77.5711 36.8996 78.705 35.837 78.705 35.837L78.7316 35.7867C78.6046 36.2962 78.4642 36.8005 78.3109 37.2991ZM50.3009 58C47.6491 58 45.0791 57.6468 42.6356 56.9847C42.6589 56.9777 42.6823 56.9707 42.7057 56.9637C53.6309 53.7111 52.3394 54.2159 61.6447 52.2454C64.6238 51.6145 67.0408 50.6775 69.112 49.323C70.6251 48.3335 71.874 47.1894 72.9011 46.1738C74.5859 44.5079 75.6149 43.0989 75.8697 42.7375C76.0298 42.5488 76.1715 42.372 76.2968 42.207C71.4074 51.5897 61.5974 58 50.3009 58ZM76.1794 15.0606C74.7764 13.7993 73.045 12.4318 71.3781 11.0741C69.9694 9.92666 68.6287 8.77881 67.3455 7.78292C61.615 3.33552 56.5518 0.0289626 56.5518 0.0289626L56.5288 0C65.1598 1.87257 72.3777 7.55595 76.3342 15.2001C76.2832 15.154 76.2316 15.1075 76.1794 15.0606Z"
                fill="#E99B9B"
            />
            <path
                d="M1.422 78V65.22H9.198V67.704H4.032V70.35H8.082V72.834H4.032V78H1.422ZM16.2359 78.216C14.6879 78.216 13.4339 77.736 12.4739 76.776C11.5139 75.816 11.0339 74.544 11.0339 72.96V65.22H13.6439V72.996C13.6439 73.836 13.8779 74.496 14.3459 74.976C14.8139 75.456 15.4439 75.696 16.2359 75.696C17.0279 75.696 17.6579 75.456 18.1259 74.976C18.5939 74.496 18.8279 73.836 18.8279 72.996V65.22H21.4379V72.96C21.4379 74.532 20.9519 75.804 19.9799 76.776C19.0079 77.736 17.7599 78.216 16.2359 78.216ZM35.5449 78H33.2949L26.7429 69.666V78H24.1329V65.22H26.3829L32.9349 73.554V65.22H35.5449V78ZM46.2105 78.216C45.2025 78.216 44.2845 78.018 43.4565 77.622C42.6285 77.214 41.9865 76.65 41.5305 75.93L43.5465 74.256C43.8585 74.724 44.2605 75.096 44.7525 75.372C45.2445 75.636 45.7605 75.768 46.3005 75.768C46.8165 75.768 47.2305 75.654 47.5425 75.426C47.8665 75.198 48.0285 74.898 48.0285 74.526C48.0285 74.166 47.8845 73.854 47.5965 73.59C47.3205 73.326 46.8645 73.086 46.2285 72.87L45.1485 72.492C43.0485 71.76 41.9985 70.542 41.9985 68.838C41.9985 67.662 42.4005 66.732 43.2045 66.048C44.0085 65.352 45.0465 65.004 46.3185 65.004C47.9265 65.004 49.2765 65.592 50.3685 66.768L48.6225 68.55C48.0345 67.818 47.2785 67.452 46.3545 67.452C45.8865 67.452 45.4845 67.554 45.1485 67.758C44.8125 67.95 44.6445 68.226 44.6445 68.586C44.6445 68.958 44.7885 69.252 45.0765 69.468C45.3645 69.684 45.8745 69.924 46.6065 70.188L47.6325 70.566C49.6725 71.334 50.6865 72.6 50.6745 74.364C50.6745 75.504 50.2605 76.434 49.4325 77.154C48.6045 77.862 47.5305 78.216 46.2105 78.216ZM58.6001 78.216C56.7761 78.216 55.2161 77.574 53.9201 76.29C52.6361 74.994 51.9941 73.434 51.9941 71.61C51.9941 69.786 52.6361 68.232 53.9201 66.948C55.2161 65.652 56.7761 65.004 58.6001 65.004C59.8721 65.004 61.0361 65.316 62.0921 65.94C63.1481 66.552 63.9521 67.374 64.5041 68.406L62.2361 69.666C61.3961 68.238 60.1841 67.524 58.6001 67.524C57.4961 67.524 56.5541 67.926 55.7741 68.73C55.0061 69.522 54.6221 70.482 54.6221 71.61C54.6221 72.738 55.0061 73.704 55.7741 74.508C56.5541 75.3 57.4961 75.696 58.6001 75.696C60.1841 75.696 61.3961 74.982 62.2361 73.554L64.5041 74.814C63.9521 75.858 63.1541 76.686 62.1101 77.298C61.0661 77.91 59.8961 78.216 58.6001 78.216ZM66.3029 78V65.22H71.1989C72.3629 65.22 73.3049 65.58 74.0249 66.3C74.7569 67.02 75.1229 67.92 75.1229 69C75.1229 70.68 74.2469 71.79 72.4949 72.33L77.0849 78H73.9349L69.5429 72.618H68.9129V78H66.3029ZM68.9129 70.386H70.8929C71.3969 70.386 71.7929 70.266 72.0809 70.026C72.3809 69.774 72.5309 69.432 72.5309 69C72.5309 68.568 72.3809 68.232 72.0809 67.992C71.7929 67.74 71.3969 67.614 70.8929 67.614H68.9129V70.386ZM82.9624 78.216C81.4144 78.216 80.1604 77.736 79.2004 76.776C78.2404 75.816 77.7604 74.544 77.7604 72.96V65.22H80.3704V72.996C80.3704 73.836 80.6044 74.496 81.0724 74.976C81.5404 75.456 82.1704 75.696 82.9624 75.696C83.7544 75.696 84.3844 75.456 84.8524 74.976C85.3204 74.496 85.5544 73.836 85.5544 72.996V65.22H88.1644V72.96C88.1644 74.532 87.6784 75.804 86.7064 76.776C85.7344 77.736 84.4864 78.216 82.9624 78.216ZM93.2175 78V67.704H89.8155V65.22H99.2835V67.704H95.8455V78H93.2175Z"
                fill="white"
            />
        </svg>
    )
}

export const PhoneIconMobi: React.FC<SVGProps<SVGSVGElement>> = (props) => {
    return (
        <svg width="24" height="24" viewBox="0 0 24 24" fill="none" xmlns="http://www.w3.org/2000/svg" {...props}>
            <path
                d="M21.9994 19.9201V16.9201C22.0116 16.4297 21.8431 15.9519 21.526 15.5776C21.2088 15.2033 20.7652 14.9586 20.2794 14.8901C19.3194 14.7635 18.3767 14.5286 17.4694 14.1901C17.1115 14.0556 16.7225 14.0264 16.3486 14.1062C15.9746 14.1859 15.6313 14.3712 15.3594 14.6401L14.0894 15.9101C11.5859 14.4865 9.513 12.4136 8.08945 9.9101L9.35944 8.6401C9.62831 8.36821 9.8136 8.02494 9.89335 7.65098C9.97311 7.27701 9.94399 6.88802 9.80945 6.5301C9.47089 5.62282 9.23607 4.68016 9.10944 3.7201C9.04152 3.23954 8.80118 2.80008 8.43321 2.48363C8.06524 2.16718 7.59475 1.99532 7.10945 2.0001H4.10945C3.83179 2.00036 3.55722 2.05843 3.30324 2.17062C3.04925 2.28281 2.82141 2.44665 2.63421 2.65172C2.44702 2.85679 2.30457 3.09859 2.21595 3.36172C2.12732 3.62486 2.09446 3.90356 2.11944 4.1801C2.44769 7.27109 3.49942 10.2413 5.18945 12.8501C6.72478 15.2663 8.77327 17.3148 11.1894 18.8501C13.7864 20.5342 16.7423 21.5857 19.8194 21.9201C20.0968 21.9452 20.3764 21.912 20.6402 21.8228C20.904 21.7336 21.1463 21.5902 21.3515 21.402C21.5567 21.2137 21.7204 20.9846 21.832 20.7294C21.9435 20.4743 22.0006 20.1986 21.9994 19.9201Z"
                stroke="white"
                strokeWidth="2"
                strokeLinecap="round"
                strokeLinejoin="round"
            />
        </svg>
    )
}

export const BurgerMenuIconMobi: React.FC<SVGProps<SVGSVGElement>> = (props) => {
    return (
        <svg width="24" height="24" viewBox="0 0 24 24" fill="none" xmlns="http://www.w3.org/2000/svg" {...props}>
            <path d="M3 12H21" stroke="white" strokeWidth="2" strokeLinecap="round" strokeLinejoin="round" />
            <path d="M3 6H21" stroke="white" strokeWidth="2" strokeLinecap="round" strokeLinejoin="round" />
            <path d="M3 18H21" stroke="white" strokeWidth="2" strokeLinecap="round" strokeLinejoin="round" />
        </svg>
    )
}

export const CrossIconMobi: React.FC<SVGProps<SVGSVGElement>> = (props) => {
    return (
        <svg width="30" height="30" viewBox="0 0 53 53" fill="none" xmlns="http://www.w3.org/2000/svg" {...props}>
            <path
                d="M39.75 13.25L13.25 39.75"
                stroke="#878797"
                strokeWidth="4"
                strokeLinecap="round"
                strokeLinejoin="round"
            />
            <path
                d="M13.25 13.25L39.75 39.75"
                stroke="#878797"
                strokeWidth="4"
                strokeLinecap="round"
                strokeLinejoin="round"
            />
        </svg>
    )
}

export const TelegramIconMobi: React.FC<SVGProps<SVGSVGElement>> = (props) => {
    return (
        <svg width="24" height="24" viewBox="0 0 24 24" fill="none" xmlns="http://www.w3.org/2000/svg" {...props}>
            <path
                d="M19.5522 2.99691C19.3115 3.01443 19.0751 3.07091 18.8525 3.16416H18.8495C18.6357 3.24891 17.6195 3.67641 16.0745 4.32441L10.538 6.65616C6.56522 8.32866 2.65997 9.97566 2.65997 9.97566L2.70647 9.95766C2.70647 9.95766 2.43722 10.0462 2.15597 10.2389C1.98222 10.3495 1.8327 10.4941 1.71647 10.6642C1.57847 10.8667 1.46747 11.1764 1.50872 11.4967C1.57622 12.0382 1.92722 12.3629 2.17922 12.5422C2.43422 12.7237 2.67722 12.8084 2.67722 12.8084H2.68322L6.34547 14.0422C6.50972 14.5694 7.46147 17.6984 7.69022 18.4192C7.82522 18.8497 7.95647 19.1189 8.12072 19.3244C8.20022 19.4294 8.29322 19.5172 8.40497 19.5877C8.46307 19.6215 8.52501 19.6481 8.58947 19.6672L8.55197 19.6582C8.56322 19.6612 8.57222 19.6702 8.58047 19.6732C8.61047 19.6814 8.63072 19.6844 8.66897 19.6904C9.24872 19.8659 9.71447 19.5059 9.71447 19.5059L9.74072 19.4849L11.903 17.5162L15.527 20.2964L15.6095 20.3317C16.3647 20.6632 17.1297 20.4787 17.534 20.1532C17.9412 19.8254 18.0995 19.4062 18.0995 19.4062L18.1257 19.3387L20.9262 4.99191C21.0057 4.63791 21.026 4.30641 20.9382 3.98466C20.8477 3.65903 20.6388 3.37897 20.3525 3.19941C20.112 3.05325 19.8332 2.9827 19.5522 2.99691ZM19.4765 4.53441C19.4735 4.58166 19.4825 4.57641 19.4615 4.66716V4.67541L16.6872 18.8729C16.6752 18.8932 16.655 18.9374 16.5995 18.9817C16.541 19.0282 16.4945 19.0574 16.2507 18.9607L11.8182 15.5624L9.14072 18.0029L9.70322 14.4104L16.9452 7.66041C17.2437 7.38291 17.144 7.32441 17.144 7.32441C17.165 6.98391 16.6932 7.22466 16.6932 7.22466L7.56122 12.8819L7.55822 12.8669L3.18122 11.3932V11.3902L3.16997 11.3879C3.17765 11.3854 3.18516 11.3824 3.19247 11.3789L3.21647 11.3669L3.23972 11.3587C3.23972 11.3587 7.14797 9.71166 11.1207 8.03916C13.1097 7.20141 15.1137 6.35766 16.655 5.70666C17.569 5.32191 18.484 4.93941 19.4 4.55916C19.4615 4.53516 19.4322 4.53441 19.4765 4.53441Z"
                fill="white"
            />
        </svg>
    )
}

export const InstagramIconMobi: React.FC<SVGProps<SVGSVGElement>> = (props) => {
    return (
        <svg width="24" height="24" viewBox="0 0 24 24" fill="none" xmlns="http://www.w3.org/2000/svg" {...props}>
            <path
                d="M17.34 5.46C17.1027 5.46 16.8707 5.53038 16.6733 5.66224C16.476 5.79409 16.3222 5.98151 16.2313 6.20078C16.1405 6.42005 16.1168 6.66133 16.1631 6.89411C16.2094 7.12689 16.3236 7.34071 16.4915 7.50853C16.6593 7.67635 16.8731 7.79064 17.1059 7.83694C17.3387 7.88324 17.5799 7.85948 17.7992 7.76866C18.0185 7.67783 18.2059 7.52402 18.3378 7.32668C18.4696 7.12935 18.54 6.89734 18.54 6.66C18.54 6.34174 18.4136 6.03652 18.1885 5.81147C17.9635 5.58643 17.6583 5.46 17.34 5.46ZM21.94 7.88C21.9206 7.0503 21.7652 6.2294 21.48 5.45C21.2257 4.78313 20.83 4.17928 20.32 3.68C19.8248 3.16743 19.2196 2.77418 18.55 2.53C17.7727 2.23616 16.9508 2.07721 16.12 2.06C15.06 2 14.72 2 12 2C9.28 2 8.94 2 7.88 2.06C7.04915 2.07721 6.22734 2.23616 5.45 2.53C4.78168 2.77665 4.17693 3.16956 3.68 3.68C3.16743 4.17518 2.77418 4.78044 2.53 5.45C2.23616 6.22734 2.07721 7.04915 2.06 7.88C2 8.94 2 9.28 2 12C2 14.72 2 15.06 2.06 16.12C2.07721 16.9508 2.23616 17.7727 2.53 18.55C2.77418 19.2196 3.16743 19.8248 3.68 20.32C4.17693 20.8304 4.78168 21.2234 5.45 21.47C6.22734 21.7638 7.04915 21.9228 7.88 21.94C8.94 22 9.28 22 12 22C14.72 22 15.06 22 16.12 21.94C16.9508 21.9228 17.7727 21.7638 18.55 21.47C19.2196 21.2258 19.8248 20.8326 20.32 20.32C20.8322 19.8226 21.2283 19.2182 21.48 18.55C21.7652 17.7706 21.9206 16.9497 21.94 16.12C21.94 15.06 22 14.72 22 12C22 9.28 22 8.94 21.94 7.88ZM20.14 16C20.1327 16.6348 20.0178 17.2637 19.8 17.86C19.6403 18.2952 19.3839 18.6884 19.05 19.01C18.7256 19.3405 18.3332 19.5964 17.9 19.76C17.3037 19.9778 16.6748 20.0927 16.04 20.1C15.04 20.15 14.67 20.16 12.04 20.16C9.41 20.16 9.04 20.16 8.04 20.1C7.38089 20.1123 6.72459 20.0109 6.1 19.8C5.68578 19.6281 5.31136 19.3728 5 19.05C4.66809 18.7287 4.41484 18.3352 4.26 17.9C4.01586 17.2952 3.88044 16.6519 3.86 16C3.86 15 3.8 14.63 3.8 12C3.8 9.37 3.8 9 3.86 8C3.86448 7.35106 3.98295 6.70795 4.21 6.1C4.38605 5.67791 4.65627 5.30166 5 5C5.30381 4.65617 5.67929 4.3831 6.1 4.2C6.70955 3.98004 7.352 3.86508 8 3.86C9 3.86 9.37 3.8 12 3.8C14.63 3.8 15 3.8 16 3.86C16.6348 3.86728 17.2637 3.98225 17.86 4.2C18.3144 4.36865 18.7223 4.64285 19.05 5C19.3777 5.30718 19.6338 5.68273 19.8 6.1C20.0223 6.70893 20.1373 7.35178 20.14 8C20.19 9 20.2 9.37 20.2 12C20.2 14.63 20.19 15 20.14 16ZM12 6.87C10.9858 6.87198 9.99496 7.17453 9.15265 7.73942C8.31035 8.30431 7.65438 9.1062 7.26763 10.0438C6.88089 10.9813 6.78072 12.0125 6.97979 13.0069C7.17886 14.0014 7.66824 14.9145 8.38608 15.631C9.10392 16.3474 10.018 16.835 11.0129 17.0321C12.0077 17.2293 13.0387 17.1271 13.9755 16.7385C14.9123 16.35 15.7129 15.6924 16.2761 14.849C16.8394 14.0056 17.14 13.0142 17.14 12C17.1413 11.3251 17.0092 10.6566 16.7512 10.033C16.4933 9.40931 16.1146 8.84281 15.6369 8.36605C15.1592 7.88929 14.5919 7.51168 13.9678 7.25493C13.3436 6.99818 12.6749 6.86736 12 6.87ZM12 15.33C11.3414 15.33 10.6976 15.1347 10.15 14.7688C9.60234 14.4029 9.17552 13.8828 8.92348 13.2743C8.67144 12.6659 8.6055 11.9963 8.73398 11.3503C8.86247 10.7044 9.17963 10.111 9.64533 9.64533C10.111 9.17963 10.7044 8.86247 11.3503 8.73398C11.9963 8.6055 12.6659 8.67144 13.2743 8.92348C13.8828 9.17552 14.4029 9.60234 14.7688 10.15C15.1347 10.6976 15.33 11.3414 15.33 12C15.33 12.4373 15.2439 12.8703 15.0765 13.2743C14.9092 13.6784 14.6639 14.0454 14.3547 14.3547C14.0454 14.6639 13.6784 14.9092 13.2743 15.0765C12.8703 15.2439 12.4373 15.33 12 15.33Z"
                fill="white"
            />
        </svg>
    )
}

export const VkIconMobi: React.FC<SVGProps<SVGSVGElement>> = (props) => {
    return (
        <svg width="24" height="24" viewBox="0 0 24 24" fill="none" xmlns="http://www.w3.org/2000/svg" {...props}>
            <path
                d="M23.405 16.8653C22.861 15.7697 22.1442 14.7689 21.282 13.9013C20.9936 13.5754 20.6917 13.2618 20.377 12.9613L20.339 12.9243C20.2222 12.8108 20.1068 12.6958 19.993 12.5793C21.1716 10.9404 22.1801 9.18565 23.003 7.34229L23.036 7.26829L23.059 7.19029C23.168 6.82729 23.292 6.13729 22.852 5.51329C22.396 4.86929 21.667 4.75329 21.178 4.75329H18.931C18.4605 4.73185 17.9953 4.85979 17.6019 5.1188C17.2086 5.37781 16.9072 5.75462 16.741 6.19529C16.2574 7.34693 15.652 8.44351 14.935 9.46629V6.83329C14.935 6.49329 14.903 5.92329 14.538 5.44329C14.102 4.86729 13.471 4.75329 13.033 4.75329H9.467C9.00167 4.74258 8.55005 4.91125 8.20567 5.22437C7.86128 5.53748 7.65051 5.97105 7.617 6.43529L7.614 6.48029V6.52529C7.614 7.01029 7.806 7.36829 7.96 7.59329C8.029 7.69429 8.102 7.78629 8.149 7.84429L8.159 7.85729C8.209 7.91929 8.242 7.96029 8.275 8.00629C8.363 8.12429 8.488 8.30829 8.524 8.78229V10.2553C7.80818 9.05661 7.22124 7.78553 6.773 6.46329L6.765 6.44129L6.757 6.42029C6.635 6.10129 6.44 5.63729 6.049 5.28329C5.593 4.86829 5.053 4.75329 4.562 4.75329H2.282C1.785 4.75329 1.186 4.86929 0.739 5.34029C0.3 5.80429 0.25 6.36029 0.25 6.65429V6.78829L0.278 6.91829C0.909301 9.84907 2.21024 12.594 4.079 14.9383C4.93338 16.2856 6.09329 17.4126 7.46465 18.2278C8.83601 19.043 10.3802 19.5235 11.972 19.6303L12.013 19.6333H12.055C12.781 19.6333 13.538 19.5703 14.107 19.1913C14.874 18.6793 14.935 17.8943 14.935 17.5023V16.3643C15.132 16.5243 15.376 16.7383 15.675 17.0263C16.037 17.3883 16.325 17.7023 16.572 17.9763L16.704 18.1223C16.896 18.3363 17.085 18.5473 17.257 18.7203C17.473 18.9373 17.74 19.1763 18.074 19.3533C18.437 19.5443 18.818 19.6313 19.222 19.6313H21.503C21.984 19.6313 22.673 19.5173 23.158 18.9553C23.686 18.3433 23.646 17.5923 23.48 17.0533L23.45 16.9563L23.405 16.8653ZM17.685 16.9713C17.3751 16.6248 17.056 16.2867 16.728 15.9573L16.725 15.9543C15.368 14.6463 14.735 14.4193 14.287 14.4193C14.048 14.4193 13.785 14.4453 13.614 14.6593C13.537 14.7614 13.4865 14.8809 13.467 15.0073C13.4429 15.154 13.4322 15.3026 13.435 15.4513V17.5023C13.435 17.7573 13.393 17.8643 13.275 17.9423C13.118 18.0473 12.783 18.1323 12.064 18.1323C10.6982 18.0394 9.37398 17.6236 8.20018 16.9192C7.02637 16.2148 6.03652 15.2418 5.312 14.0803L5.304 14.0673L5.294 14.0553C3.55312 11.8884 2.33984 9.34653 1.75 6.63029C1.754 6.50029 1.782 6.42129 1.828 6.37329C1.875 6.32329 1.99 6.25329 2.282 6.25329H4.562C4.815 6.25329 4.947 6.30929 5.042 6.39429C5.148 6.49229 5.242 6.65729 5.354 6.95129C5.914 8.59729 6.67 10.1373 7.387 11.2683C7.745 11.8343 8.097 12.3053 8.415 12.6383C8.574 12.8043 8.729 12.9423 8.878 13.0403C9.021 13.1343 9.184 13.2093 9.352 13.2093C9.44 13.2093 9.543 13.1993 9.642 13.1563C9.74892 13.1091 9.83693 13.0274 9.892 12.9243C9.995 12.7363 10.024 12.4593 10.024 12.0963V8.72329C9.971 7.90529 9.724 7.44429 9.484 7.11729C9.4354 7.05189 9.38538 6.98754 9.334 6.92429L9.321 6.90829C9.27836 6.8565 9.23766 6.80313 9.199 6.74829C9.14977 6.68714 9.12015 6.61255 9.114 6.53429C9.12185 6.45483 9.15976 6.38137 9.21999 6.32894C9.28022 6.27652 9.35821 6.2491 9.438 6.25229H13.033C13.239 6.25229 13.308 6.30229 13.343 6.34929C13.393 6.41429 13.435 6.54929 13.435 6.83329V11.3613C13.435 11.8993 13.683 12.2633 14.043 12.2633C14.457 12.2633 14.756 12.0123 15.278 11.4903L15.287 11.4803L15.295 11.4713C16.466 10.0436 17.4227 8.45287 18.135 6.74929L18.139 6.73729C18.1925 6.58678 18.2938 6.4579 18.4274 6.37034C18.561 6.28277 18.7196 6.24131 18.879 6.25229H21.179C21.491 6.25229 21.593 6.33229 21.627 6.37929C21.662 6.42929 21.687 6.53629 21.627 6.74629C20.8056 8.58265 19.7901 10.3259 18.598 11.9463L18.59 11.9583C18.475 12.1353 18.348 12.3313 18.33 12.5553C18.31 12.7973 18.414 13.0163 18.597 13.2523C18.73 13.4483 19.005 13.7173 19.284 13.9903L19.31 14.0163C19.602 14.3023 19.919 14.6123 20.173 14.9123L20.18 14.9193L20.187 14.9273C20.9444 15.6828 21.5743 16.5561 22.052 17.5133C22.128 17.7733 22.082 17.9073 22.022 17.9763C21.953 18.0563 21.798 18.1313 21.504 18.1313H19.222C19.0665 18.1351 18.9126 18.0989 18.775 18.0263C18.6064 17.9282 18.4534 17.8055 18.321 17.6623C18.178 17.5193 18.023 17.3463 17.833 17.1353L17.686 16.9713H17.685Z"
                fill="white"
                fillRule="evenodd"
                clipRule="evenodd"
            />
        </svg>
    )
}
