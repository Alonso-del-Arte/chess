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

  @Test def testMoveSouthwest(): Unit = {
    println("moveSouthwest")
    val expected = new RelativePositionRange(new RelativePosition(-1, 1),
      new RelativePosition(-1, 1))
    val actual = ShortMoveRanges.moveSouthwest
    assertEquals(expected, actual)
  }

  @Test def testMoveSoutheast(): Unit = {
    println("moveSoutheast")
    val expected = new RelativePositionRange(new RelativePosition(-1, -1),
      new RelativePosition(-1, -1))
    val actual = ShortMoveRanges.moveSoutheast
    assertEquals(expected, actual)
  }

  @Test def testMoveForward(): Unit = {
    println("moveForward")
    val expected = new RelativePositionRange(new RelativePosition(0, 1),
      new RelativePosition(0, 1))
    val actual = ShortMoveRanges.moveForward
    assertEquals(expected, actual)
  }

  @Test def testMoveRight(): Unit = {
    println("moveRight")
    val expected = new RelativePositionRange(new RelativePosition(1, 0),
      new RelativePosition(1, 0))
    val actual = ShortMoveRanges.moveRight
    assertEquals(expected, actual)
  }

  @Test def testMoveBack(): Unit = {
    println("moveBack")
    val expected = new RelativePositionRange(new RelativePosition(0, -1),
      new RelativePosition(0, -1))
    val actual = ShortMoveRanges.moveBack
    assertEquals(expected, actual)
  }

}
