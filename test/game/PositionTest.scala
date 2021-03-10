package game

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions._

class PositionTest {

  @Test def testToString(): Unit = {
    println("toString")
    for (x <- 1 to 8) {
      for (y <- 1 to 8) {
        val position = new Position(x, y)
        val expected = "" + (x + 96).toChar + (y + 48).toChar
        val actual = position.toString
        assertEquals(expected, actual)
      }
    }
  }

}
