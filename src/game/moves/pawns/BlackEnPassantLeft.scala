package game.moves.pawns

import game.BoardState
import game.pieces.Piece

object BlackEnPassantLeft extends EnPassant {

  override def isCapture: Boolean = true

  // TODO: Write tests for this
  override def involvesPiecesOfSameSide: Boolean = true

  // TODO: Write tests for this
  override def meetsPrerequisites(boardState: BoardState, piece: Piece, secondPiece: Piece): Boolean = false

  // TODO: Write tests for this
  override def execute(boardState: BoardState, piece: Piece, secondPiece: Piece): BoardState = boardState

}
