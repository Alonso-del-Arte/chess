package game.moves.pawns

import org.junit.jupiter.api.Test

class BlackPawnPromotionCaptureLeftTest {

  @Test def testIsCapture(): Unit = {
    println("isCapture")
    assert(BlackPawnPromotionCaptureLeft.isCapture,
      "Pawn promotion with capture should be capture")
  }

}
