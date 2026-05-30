package game

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

import scala.util.Random

class ShortMoveRangesTest {

  @Test def testMoveNortheast(): Unit = {
    println("moveNortheast")
    val expected = new RelativePositionRange(new RelativePosition(1, -1),
      new RelativePosition(1, -1))
    val actual = ShortMoveRanges.moveNortheast
    assertEquals(expected, actual)
  }

  @Test def testMoveNorthwest(): Unit = {
    println("moveNorthwest")
    val expected = new RelativePositionRange(new RelativePosition(1, 1),
      new RelativePosition(1, 1))
    val actual = ShortMoveRanges.moveNorthwest
    assertEquals(expected, actual)
  }

}
