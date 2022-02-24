package game

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions._

class InitialBoardStateTest {

  @Test def testBoard(): Unit = {
    println("board")
    assertEquals(RegularBoard, InitialBoardState.board)
  }

}
