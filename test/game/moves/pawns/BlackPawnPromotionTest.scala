package game.moves.pawns

import org.junit.jupiter.api.Test

class BlackPawnPromotionTest {

  @Test def testIsCapture(): Unit = {
    println("isCapture")
    assert(!BlackPawnPromotion.isCapture,
      "No-capture pawn promotion should not be capture")
  }

}
