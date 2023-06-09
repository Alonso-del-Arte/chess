package game

import game.RelativePositionRangeTest.makeRange
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions._

import scala.util.Random

object RelativePositionRangeTest {

  private def makeRange: RelativePositionRange = {
    val stepX = Random.nextInt(16) - 8
    val stepY = Random.nextInt(16) - 8
    val startX = Random.nextInt(32) - 16
    val finishX = startX + stepX
    val startY = Random.nextInt(32) - 16
    val finishY = startY + stepY
    val start = new RelativePosition(startX, startY)
    val finish = new RelativePosition(finishX, finishY)
    new RelativePositionRange(start, finish)
  }

}

class RelativePositionRangeTest {

  @Test def testDetermineStep(): Unit = {
    println("determineStep")
    val stepX = Random.nextInt(16) - 8
    val stepY = Random.nextInt(16) - 8
    val startX = Random.nextInt(32) - 16
    val finishX = startX + stepX
    val startY = Random.nextInt(32) - 16
    val finishY = startY + stepY
    val start = new RelativePosition(startX, startY)
    val finish = new RelativePosition(finishX, finishY)
    val expected = new RelativePosition(stepX, stepY)
    val actual = RelativePositionRange.determineStep(start, finish)
    assertEquals(expected, actual)
  }

  @Test def testReferentialEquality(): Unit = {
    val range = makeRange
    assertEquals(range, range)
  }

  @Test def testNotEqualsNull(): Unit = {
    val range = makeRange
    assertNotEquals(range, null)
  }

  @Test def testNotEqualsDiffClass(): Unit = {
    val range = makeRange
    assertNotEquals(range, range.toString)
  }

}
