package de.deggers.demo.style

import javafx.scene.paint.Color.*
import tornadofx.*


class LightStyle : Stylesheet(), StyleContract {

    init {
        rootSelector
        buttonSelector
    }

    override val rootSelector: CssSelection
        get() = root {
            backgroundColor = multi(WHITE)
        }

    override val buttonSelector: CssSelection
        get() = button {
            backgroundColor = multi(LIGHTGREY)
        }
}