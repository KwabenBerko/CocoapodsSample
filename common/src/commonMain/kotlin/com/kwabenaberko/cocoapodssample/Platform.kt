package com.kwabenaberko.cocoapodssample

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform