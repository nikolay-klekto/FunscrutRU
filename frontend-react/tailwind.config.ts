import type { Config } from 'tailwindcss'
import { PluginAPI } from 'tailwindcss/types/config'
import colorsConfig from './tailwind-config/colorsConfig'
import screensConfig from './tailwind-config/screensConfig'
import borderRadiusConfig from './tailwind-config/borderRadiusConfig'
import keyframesConfig from './tailwind-config/keyframesConfig'
import animationConfig from './tailwind-config/animationConfig'
import fontSizeConfig from './tailwind-config/fontSizeConfig'
import backgroundImageConfig from './tailwind-config/backgroundImageConfig'
import plugin from 'tailwindcss/plugin'
import boxShadowConfig from './tailwind-config/boxShadowConfig'

const config = {
    darkMode: ['class'],
    content: ['./pages/**/*.{ts,tsx}', './components/**/*.{ts,tsx}', './app/**/*.{ts,tsx}', './src/**/*.{ts,tsx}'],
    prefix: '',
    theme: {
        container: {
            center: true,
            padding: '2rem',
            screens: {
                'sm': '320px',
                'sm_s': '344px',
                'sm_l': '375px',
                'sm_xl': '375px',
                'md': '768px',
                'lg': '1024px',
                'xl': '1280px',
                '2xl': '1440px',
                '3xl': '1560px',
                '4xl': '1920px',
            },
        },
        extend: {
            colors: colorsConfig,
            screens: screensConfig,
            borderRadius: borderRadiusConfig,
            keyframes: keyframesConfig,
            animation: animationConfig,
            fontSize: fontSizeConfig,
            backgroundImage: backgroundImageConfig,
            boxShadow: boxShadowConfig,
        },
    },
    plugins: [
        require('tailwindcss-animate'),
        function ({ addUtilities, theme }: PluginAPI) {
            addUtilities({
                '.container-no-right-padding': {
                    padding: '4rem 0 4rem 4rem',
                    maxWidth: theme('screens.4xl'),
                },
            })
        },
    ],
} satisfies Config

export default config
