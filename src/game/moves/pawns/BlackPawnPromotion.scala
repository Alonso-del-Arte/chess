package game.moves.pawns

import game.BoardState
import game.pieces.Piece

object BlackPawnPromotion extends PawnPromotion {

  // TODO: Write tests for this
  override def meetsPrerequisites(boardState: BoardState, piece: Piece,
                                  secondPiece: Piece = null): Boolean = true

  // TODO: Write tests for this
  override def isCapture: Boolean = true

  // TODO: Write tests for this
  override def involvesPiecesOfSameSide: Boolean = false

  // TODO: Write tests for this
  override def execute(boardState: BoardState, piece: Piece,
                       secondPiece: Piece = null): BoardState = boardState

}
