package game.moves.pawns

import org.junit.jupiter.api.Test

class WhitePawnPromotionTest {

  @Test def testIsCapture(): Unit = {
    println("isCapture")
    assert(!WhitePawnPromotion.isCapture,
      "No-capture pawn promotion should not be capture")
  }

  @Test def testInvolvesPiecesOfSameSide(): Unit = {
    println("involvesPiecesOfSameSide")
    assert(WhitePawnPromotion.involvesPiecesOfSameSide,
      "Pawn promotion should involve another piece of same side")
  }

}
