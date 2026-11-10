package game.moves.pawns

import org.junit.jupiter.api.Test

class WhitePawnPromotionTest {

  @Test def testIsCapture(): Unit = {
    println("isCapture")
    assert(!WhitePawnPromotion.isCapture,
      "No-capture pawn promotion should not be capture")
  }

}
