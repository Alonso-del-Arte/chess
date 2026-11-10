package game.moves.pawns

import org.junit.jupiter.api.Test

class BlackEnPassantRightTest {

  @Test def testIsCapture(): Unit = {
    println("isCapture")
    assert(BlackEnPassantRight.isCapture, "En passant should be capture")
  }

}
