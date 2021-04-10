package game

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions._

object RegularPositionTest {

  def checkTranslations(position: RegularPosition): Unit = {
    val startX = -position.x + 1
    val startY = -position.y + 1
    val finishX = 8 - position.x
    val finishY = 8 - position.y
    for (x <- startX to finishX) {
      for (y <- startY to finishY) {
        val offset = new RelativePosition(x, y)
        val expected = new RegularPosition(position.x + x, position.y + y)
        val actual = position.translate(offset)
        assertEquals(expected, actual)
      }
    }
  }

}

class RegularPositionTest {

  @Test def testToString(): Unit = {
    println("toString")
    for (x <- 1 to 8) {
      for (y <- 1 to 8) {
        val position = new RegularPosition(x, y)
        val expected = "" + (x + 96).toChar + (y + 48).toChar
        val actual = position.toString
        assertEquals(expected, actual)
      }
    }
  }

  @Test def testTranslate(): Unit = {
    println("translate")
    for (x <- 1 to 8) {
      for (y <- 1 to 8) {
        val position = new RegularPosition(x, y)
        RegularPositionTest.checkTranslations(position)
      }
    }
  }

}
