package game

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions._

class RelativePositionRangeTest {

  @Test def testDetermineStep(): Unit = {
    println("determineStep")
    val start = new RelativePosition(-7, 8)
    val finish = new RelativePosition(-8, 8)
    val expected = new RelativePosition(-1, 0)
    val actual = RelativePositionRange.determineStep(start, finish)
    assertEquals(expected, actual)
  }

}
