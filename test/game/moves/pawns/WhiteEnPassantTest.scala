package game.moves.pawns

import org.junit.jupiter.api.Test

class WhiteEnPassantTest {

  // TODO: Write tests for meetsPrerequisites

  @Test def testIsCapture(): Unit = {
    println("isCapture")
    assert(WhiteEnPassant.isCapture, "En passant should be capture")
  }

  @Test def testInvolvesPiecesOfSameSide(): Unit = {
    println("involvesPiecesOfSameSide")
    assert(!WhiteEnPassant.involvesPiecesOfSameSide,
      "En passant should not involve other pieces of same side")
  }

}
