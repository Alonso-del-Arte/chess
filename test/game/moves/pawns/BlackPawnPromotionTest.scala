package game.moves.pawns

import org.junit.jupiter.api.Test

class BlackPawnPromotionTest {

  @Test def testIsCapture(): Unit = {
    println("isCapture")
    assert(!BlackPawnPromotion.isCapture,
      "No-capture pawn promotion should not be capture")
  }

  @Test def testInvolvesPiecesOfSameSide(): Unit = {
    println("involvesPiecesOfSameSide")
    assert(BlackPawnPromotion.involvesPiecesOfSameSide,
      "Pawn promotion should involve another piece of same side")
  }

}
