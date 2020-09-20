package de.deggers.demo

import javafx.geometry.Pos
import javafx.scene.text.TextAlignment
import tornadofx.*
import javax.swing.GroupLayout

data class Key(val label: String, val size: Double = 18.00)

class Keyboard : View() {

    private val firstRow = listOf(
        Key(label = "Tab", size = 28.00),
        Key(label = "Q"),
        Key(label = "W")
    )

  override val root = vbox {
    paddingAll = 20
    prefWidth = 800.00
    prefHeight = 300.00

    hbox {
      spacing = 5.05
      alignment = Pos.TOP_LEFT

      firstRow.forEach {key: Key ->
        button{
          text = key.label
          alignment = Pos.CENTER
        }.style {
          maxWidth = key.size.mm
          minWidth = key.size.mm
          maxHeight = 18.mm
          minHeight = 18.mm
          padding = CssBox(-8.mm, 0.mm, 0.mm, -8.mm)
          fontSize = 22.px
        }
      }
    }
  }
}
