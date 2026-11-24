package game.moves.pawns

import org.junit.jupiter.api.Test

class WhitePawnPromotionCaptureLeftTest {

  @Test def testIsCapture(): Unit = {
    println("isCapture")
    assert(WhitePawnPromotionCaptureLeft.isCapture,
      "Pawn promotion with capture should be capture")
  }

  @Test def testInvolvesPiecesOfSameSide(): Unit = {
    println("involvesPiecesOfSameSide")
    assert(!WhitePawnPromotionCaptureLeft.involvesPiecesOfSameSide,
      "Pawn promotion should not involve another piece of same side")
  }

}
