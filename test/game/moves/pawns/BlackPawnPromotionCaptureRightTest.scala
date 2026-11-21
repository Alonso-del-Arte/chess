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
    assert(BlackPawnPromotionCaptureRight.involvesPiecesOfSameSide,
      "Pawn promotion should involve one other piece of same side")
  }

}
