package com.kwabenaberko.cocoapodssample

import androidx.compose.ui.window.ComposeUIViewController
import platform.UIKit.UIDevice

class IOSPlatform: Platform {
    override val name: String = UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
}

actual fun getPlatform(): Platform = IOSPlatform()

fun mainViewController() = ComposeUIViewController { App() }