package game.moves.pawns

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class BlackPawnPromotionCaptureRightTest {

  @Test def testIsCapture(): Unit = {
    println("isCapture")
    assert(BlackPawnPromotionCaptureRight.isCapture,
      "Pawn promotion with capture should be capture")
  }

}
