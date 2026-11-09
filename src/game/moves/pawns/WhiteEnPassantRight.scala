package game.moves.pawns

import game.BoardState
import game.pieces.Piece

object WhiteEnPassantRight extends EnPassant {

  override def isCapture: Boolean = true

  override def involvesPiecesOfSameSide: Boolean = false

  // TODO: Write tests for this
  override def meetsPrerequisites(boardState: BoardState, piece: Piece,
                                  secondPiece: Piece): Boolean = false

  // TODO: Write tests for this
  override def execute(boardState: BoardState, piece: Piece,
                       secondPiece: Piece): BoardState = boardState

}
