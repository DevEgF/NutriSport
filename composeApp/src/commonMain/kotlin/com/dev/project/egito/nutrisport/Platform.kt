package com.dev.project.egito.nutrisport

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform