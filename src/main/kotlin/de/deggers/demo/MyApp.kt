package de.deggers.demo


import de.deggers.demo.style.LightStyle
import tornadofx.*

class MyApp : App(Keyboard::class, LightStyle::class) {
   
    fun main(args: Array<String>) {
        launch<MyApp>(args)
    }
}

