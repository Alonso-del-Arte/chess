package game

import scala.util.Random

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

  @Test def testOffsetNotWithinBoundsTooFarWest(): Unit = {
    val x = Random.nextInt(8) + 1
    val y = Random.nextInt(8) + 1
    val position = new RegularPosition(x, y)
    val badRelX = -x - Random.nextInt(8)
    val badOffset = new RelativePosition(badRelX, 0)
    val msg = s"${badOffset.toString} too much for ${position.toString}"
    assert (!position.isOffsetWithinBounds(badOffset, RegularBoard), msg)
  }

  @Test def testOffsetNotWithinBoundsTooFarSouth(): Unit = {
    val x = Random.nextInt(8) + 1
    val y = Random.nextInt(8) + 1
    val position = new RegularPosition(x, y)
    val badRelY = -y - Random.nextInt(8)
    val badOffset = new RelativePosition(0, badRelY)
    val msg = s"${badOffset.toString} too much for ${position.toString}"
    assert (!position.isOffsetWithinBounds(badOffset, RegularBoard), msg)
  }

  @Test def testOffsetNotWithinBoundsTooFarEast(): Unit = {
    val x = Random.nextInt(8) + 1
    val y = Random.nextInt(8) + 1
    val position = new RegularPosition(x, y)
    val badRelX = (9 - x) + Random.nextInt(8)
    val badOffset = new RelativePosition(badRelX, 0)
    val msg = s"${badOffset.toString} too much for ${position.toString}"
    assert (!position.isOffsetWithinBounds(badOffset, RegularBoard), msg)
  }

  @Test def testOffsetNotWithinBoundsTooFarNorth(): Unit = {
    val x = Random.nextInt(8) + 1
    val y = Random.nextInt(8) + 1
    val position = new RegularPosition(x, y)
    val badRelY = (9 - y) + Random.nextInt(8)
    val badOffset = new RelativePosition(0, badRelY)
    val msg = s"${badOffset.toString} too much for ${position.toString}"
    assert (!position.isOffsetWithinBounds(badOffset, RegularBoard), msg)
  }

  @Test def testIsOffsetWithinBounds(): Unit = {
    val x = Random.nextInt(8) + 1
    val y = Random.nextInt(8) + 1
    val position = new RegularPosition(x, y)
    val minOffsetX = -x + 1
    val minOffsetY = -y + 1
    val maxOffsetX = 8 - x
    val maxOffsetY = 8 - y
    val msgPart = s"Should be able to offset ${position.toString} by "
    for (offsetX <- minOffsetX to maxOffsetX) {
      for (offsetY <- minOffsetY to maxOffsetY) {
        val offset = new RelativePosition(offsetX, offsetY)
        val msg = msgPart + offset.toString
        assert (position.isOffsetWithinBounds(offset, RegularBoard), msg)
      }
    }
  }

  // TODO: Write tests for boards smaller than RegularBoard

  @Test def testTranslate(): Unit = {
    println("translate")
    for (x <- 1 to 8) {
      for (y <- 1 to 8) {
        val position = new RegularPosition(x, y)
        RegularPositionTest.checkTranslations(position)
      }
    }
  }

  @Test def testApply(): Unit = {
    println("apply")
    for (x <- 1 to 8) {
      for (y <- 1 to 8) {
        val s = s"${(x + 96).toChar}${(y + 48).toChar}"
        val expected = new RegularPosition(x, y)
        val actual = RegularPosition(s)
        assertEquals(expected, actual)
      }
    }
  }

  @Test def testApplyRejectsEmptyStringPositionIndicator(): Unit = {
    val t: Throwable = assertThrows(classOf[IllegalArgumentException], () => {
      val badPosition = RegularPosition("")
      println("Should not have been able to create " + badPosition.toString
        + " with empty String")
    })
    println("Empty String indicator correctly caused exception")
    val excMsg = t.getMessage
    assert(excMsg != null, "Exception message should not be null")
    println("\"" + excMsg + "\"")
  }

  @Test def testApplyRejectsTooShortPositionIndicator(): Unit = {
    val s = Random.nextPrintableChar().toString
    val t: Throwable = assertThrows(classOf[IllegalArgumentException], () => {
      val badPosition = RegularPosition(s)
      println("Should not have been able to create " + badPosition.toString
        + " with String \"" + s + "\"")
    })
    println("String \"" + s + "\" correctly caused exception")
    val excMsg = t.getMessage
    assert(excMsg != null, "Exception message should not be null")
    println("\"" + excMsg + "\"")
  }

}
