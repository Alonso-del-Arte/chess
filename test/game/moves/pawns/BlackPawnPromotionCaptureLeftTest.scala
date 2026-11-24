package game.moves.pawns

import org.junit.jupiter.api.Test

class BlackPawnPromotionCaptureLeftTest {

  @Test def testIsCapture(): Unit = {
    println("isCapture")
    assert(BlackPawnPromotionCaptureLeft.isCapture,
      "Pawn promotion with capture should be capture")
  }

  @Test def testInvolvesPiecesOfSameSide(): Unit = {
    println("involvesPiecesOfSameSide")
    assert(!BlackPawnPromotionCaptureLeft.involvesPiecesOfSameSide,
      "Pawn promotion should not involve another piece of same side")
  }

}
