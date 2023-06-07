package game

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions._

import scala.util.Random

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

  @Test
  def testReferentialEquality(): Unit = {
    val stepX = Random.nextInt(16) - 8
    val stepY = Random.nextInt(16) - 8
    val startX = Random.nextInt(32) - 16
    val finishX = startX + stepX
    val startY = Random.nextInt(32) - 16
    val finishY = startY + stepY
    val start = new RelativePosition(startX, startY)
    val finish = new RelativePosition(finishX, finishY)
    val range = new RelativePositionRange(start, finish)
    assertEquals(range, range)
  }

}
