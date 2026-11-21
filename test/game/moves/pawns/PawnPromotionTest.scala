package game.moves.pawns

import game.pieces.{Queen, PromotionFactory}

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class PawnPromotionTest {

  @Test def testQueenIsDefaultPromotionFactory(): Unit = {
    val expected: PromotionFactory = Queen
    val actual = PawnPromotion.promotionFactory
    assertEquals(expected, actual)
  }

}
