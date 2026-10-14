package game.moves

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions._

class WhiteEnPassantTest {

  // TODO: Write tests for meetsPrerequisites

  @Test def testIsCapture(): Unit = {
    println("isCapture")
    assert(WhiteEnPassant.isCapture, "En passant should be capture")
  }

}
