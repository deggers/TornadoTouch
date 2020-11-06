package de.deggers.demo

import javafx.geometry.Pos
import javafx.scene.control.Button
import javafx.scene.paint.Color
import tornadofx.*

data class Key(val label: String, val size: Double = 18.00)

class Keyboard : View() {

  private val tab = button { text = "tab" }.also { it.alignment = Pos.CENTER }
  private val q = button { text = "q" }.also { it.alignment = Pos.CENTER }
  private val w = button { text = "w" }.also { it.alignment = Pos.CENTER }

  private val firstRow: List<Button> = listOf(
    tab,
    q,
    w
  )

  override val root = vbox {
    paddingAll = 22
    prefWidth = 800.00
    prefHeight = 300.00

    setOnKeyPressed { event ->
      if (event.text.toLowerCase() == "q") {
        q.style {
          maxWidth = 18.mm
          minWidth = 18.mm
          maxHeight = 18.mm
          minHeight = 18.mm
          padding = CssBox(-8.mm, 0.mm, 0.mm, -8.mm)
          fontSize = 22.px
          backgroundColor += Color.DARKBLUE }
      }
    }

    setOnKeyReleased { event ->
      if (event.text.toLowerCase() == "q") {
        q.style {
          maxWidth = 18.mm
          minWidth = 18.mm
          maxHeight = 18.mm
          minHeight = 18.mm
          padding = CssBox(-8.mm, 0.mm, 0.mm, -8.mm)
          fontSize = 22.px
          }
      }
    }

    hbox {
      spacing = 5.05
      alignment = Pos.TOP_LEFT

      firstRow.forEach { button: Button ->
        button.style {
          maxWidth = 18.mm
          minWidth = 18.mm
          maxHeight = 18.mm
          minHeight = 18.mm
          padding = CssBox(-8.mm, 0.mm, 0.mm, -8.mm)
          fontSize = 22.px
        }
        add(button)
      }
    }
  }
}
