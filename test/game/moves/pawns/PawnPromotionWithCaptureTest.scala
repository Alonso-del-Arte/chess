package game.moves.pawns

import game.BoardState
import game.pieces.Piece

import org.junit.jupiter.api.Test

class PawnPromotionWithCaptureTest {

  @Test def testIsCapture(): Unit = {
    println("isCapture")
    assert(PawnPromotionWithCaptureImpl.isCapture,
      "Pawn promotion with capture should be capture")
  }

  @Test def testInvolvesPiecesOfSameSide(): Unit = {
    println("involvesPiecesOfSameSide")
    assert(PawnPromotionWithCaptureImpl.involvesPiecesOfSameSide,
      "Pawn promotion should involve one other piece of same side")
  }

  private object PawnPromotionWithCaptureImpl extends PawnPromotionWithCapture {

    override def meetsPrerequisites(boardState: BoardState, piece: Piece,
                                    secondPiece: Piece): Boolean = true

    override def execute(boardState: BoardState, piece: Piece,
                         secondPiece: Piece): BoardState = boardState

  }

}
