package game.moves.pawns

import org.junit.jupiter.api.Test

class BlackPawnPromotionCaptureRightTest {

  @Test def testIsCapture(): Unit = {
    println("isCapture")
    assert(BlackPawnPromotionCaptureRight.isCapture,
      "Pawn promotion with capture should be capture")
  }

  @Test def testInvolvesPiecesOfSameSide(): Unit = {
    println("involvesPiecesOfSameSide")
    assert(!BlackPawnPromotionCaptureRight.involvesPiecesOfSameSide,
      "Pawn promotion should not involve another piece of same side")
  }

}
