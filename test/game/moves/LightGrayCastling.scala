package game.moves

import game.BoardState
import game.pieces.Piece

object LightGrayCastling extends Castling {

  // TODO: Write tests for this
  override def meetsPrerequisites(boardState: BoardState, piece: Piece,
                                  secondPiece: Piece = null): Boolean = true

  // TODO: Write tests for this
  override def isCapture: Boolean = true

  // TODO: Write tests for this
  override def involvesPiecesOfSameSide: Boolean = false

  // TODO: Write tests for this
  // Reminder: this is queenside castling
  override def execute(boardState: BoardState, piece: Piece,
                       secondPiece: Piece = null): BoardState = boardState

}
