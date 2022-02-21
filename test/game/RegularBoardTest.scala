package game

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class RegularBoardTest {

  @Test def testContains(): Unit = {
    println("contains")
    for (x <- 1 to 8) {
      for (y <- 1 to 8) {
        val position = new RegularPosition(x, y)
        val msg = s"Board should contain position ${position.toString}"
        assert(RegularBoard.contains(position), msg)
      }
    }
  }

  @Test def testDoesNotContain(): Unit = {
    val range = 1 to 8
    for (x <- -256 to 256) {
      for (y <- -256 to 256) {
        val position = new RegularPosition(x, y)
        if (!(range contains x) || !(range contains y)) {
          val msg = s"Board should NOT contain ${position.toString}"
          assert(!RegularBoard.contains(position), msg)
        }
      }
    }
  }

  @Test def testDoesNotContainPositionOfOtherType(): Unit = {
    fail("Haven't written test yet")
  }

}
