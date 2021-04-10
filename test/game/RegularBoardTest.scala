package game

import org.junit.jupiter.api.Test

class RegularBoardTest {

  @Test def testContains(): Unit = {
    println("contains")
    for (x <- 1 to 8) {
      for (y <- 1 to 8) {
        val position = new PositionImpl(x, y)
        val msg = s"Board should contain position ${position.toString}"
        assert(RegularBoard.contains(position), msg)
      }
    }
  }

}
