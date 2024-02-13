package com.ficko.tabletopcompanion

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform