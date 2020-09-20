package de.deggers.demo.style

import javafx.scene.paint.Color
import tornadofx.CssSelection
import tornadofx.Stylesheet
import tornadofx.multi


class DarkStyle : Stylesheet(), StyleContract {
    init {
        rootSelector
        buttonSelector
    }

    override val rootSelector: CssSelection
        get() = root {
            backgroundColor = multi(Color.BLACK)
        }

    override val buttonSelector: CssSelection
        get() = button {
            backgroundColor = multi(Color.LIGHTGREEN)
        }
}