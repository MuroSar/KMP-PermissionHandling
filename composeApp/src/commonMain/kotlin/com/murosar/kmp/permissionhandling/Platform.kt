package com.murosar.kmp.permissionhandling

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform