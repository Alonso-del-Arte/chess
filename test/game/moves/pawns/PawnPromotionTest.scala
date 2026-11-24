package game.moves.pawns

import game.BoardState
import game.pieces.{Piece, PromotionFactory, Queen}
import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class PawnPromotionTest {

  @Test def testQueenIsDefaultPromotionFactory(): Unit = {
    val expected: PromotionFactory = Queen
    val actual = PawnPromotion.promotionFactory
    assertEquals(expected, actual)
  }

  @Test def testInvolvesPiecesOfSameSide(): Unit = {
    println("involvesPiecesOfSameSide")
    assert(!PawnPromotionImpl.involvesPiecesOfSameSide,
      "Pawn promotion should not involve another piece of same side")
  }

  private object PawnPromotionImpl extends PawnPromotion {

    override def meetsPrerequisites(boardState: BoardState, piece: Piece,
                                    secondPiece: Piece): Boolean = true

    override def isCapture: Boolean = false

    override def execute(boardState: BoardState, piece: Piece,
                         secondPiece: Piece): BoardState = boardState

  }

}
