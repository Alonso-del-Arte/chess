package game.moves.pawns

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class WhitePawnPromotionCaptureRightTest {

  @Test def testIsCapture(): Unit = {
    println("isCapture")
    assert(WhitePawnPromotionCaptureRight.isCapture,
      "Pawn promotion with capture should be capture")
  }

  @Test def testInvolvesPiecesOfSameSide(): Unit = {
    println("involvesPiecesOfSameSide")
    assert(WhitePawnPromotionCaptureRight.involvesPiecesOfSameSide,
      "Pawn promotion should involve one other piece of same side")
  }

}
