package game

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

  @Test def testCompanionObjectApply(): Unit = {
    val offsetX = Random.nextInt(8) - 4
    val offsetY = Random.nextInt(8) - 4
    val expected = new RelativePosition(offsetX, offsetY)
    val spotAppliedRange = RelativePositionRange(expected)
    val actualStart = spotAppliedRange.start
    val actualFinish = spotAppliedRange.finish
    assertEquals(expected, actualStart)
    assertEquals(expected, actualFinish)
  }

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

  @Test def testToString(): Unit = {
    println("toString")
    val range = RelativePositionRangeTest.makeRange
    val startStr = range.start.toString.replace(" ", "")
    val finishStr = range.finish.toString.replace(" ", "")
    val expected = s"${startStr}to$finishStr"
    val actual = range.toString.replace(" ", "")
    assertEquals(expected, actual)
  }

  @Test def testReferentialEquality(): Unit = {
    val range = RelativePositionRangeTest.makeRange
    assertEquals(range, range)
  }

  @Test def testNotEqualsNull(): Unit = {
    val range = RelativePositionRangeTest.makeRange
    assertNotEquals(range, null)
  }

  @Test def testNotEqualsDiffClass(): Unit = {
    val range = RelativePositionRangeTest.makeRange
    assertNotEquals(range, range.toString)
  }

  @Test def testNotEqualsDiffStart(): Unit = {
    val rangeA = RelativePositionRangeTest.makeRange
    val rangeAStart = rangeA.start
    val diffStart = new RelativePosition(rangeAStart.offsetX + 1,
      rangeAStart.offsetY - 1)
    val rangeB = new RelativePositionRange(diffStart, rangeA.finish)
    assertNotEquals(rangeA, rangeB)
  }

  @Test def testEquals(): Unit = {
    val someRange = RelativePositionRangeTest.makeRange
    val sameRange = new RelativePositionRange(someRange.start, someRange.finish)
    assertEquals(someRange, sameRange)
  }

  @Test def testNotEqualsDiffFinish(): Unit = {
    val rangeA = RelativePositionRangeTest.makeRange
    val rangeAFinish = rangeA.finish
    val diffFinish = new RelativePosition(rangeAFinish.offsetX - 1,
      rangeAFinish.offsetY + 1)
    val rangeB = new RelativePositionRange(rangeA.start, diffFinish)
    assertNotEquals(rangeA, rangeB)
  }

  @Test def testHashCode(): Unit = {
    println("hashCode")
    val positions = for {
      x <- -7 to 7
      y <- -7 to -7
    } yield new RelativePosition(x, y)
    val ranges = for {
      start <- positions
      finish <- positions
    } yield new RelativePositionRange(start, finish)
    val hashes = ranges.map(_.hashCode)
    val expected = ranges.toSet.size
    val actual = hashes.toSet.size
    assertEquals(expected, actual)
  }

}
