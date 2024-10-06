package org.cloudieeats.app

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform