package game.moves.pawns

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class WhitePawnPromotionCaptureLeftTest {

  @Test def testIsCapture(): Unit = {
    println("isCapture")
    assert(WhitePawnPromotionCaptureLeft.isCapture,
      "Pawn promotion with capture should be capture")
  }

}
