package game.moves

import game.BoardState
import game.pieces.Piece

object LightGrayCastling extends Castling {

  // TODO: Write tests for this
  override def meetsPrerequisites(boardState: BoardState, piece: Piece,
                                  secondPiece: Piece = null): Boolean = true

  override def isCapture: Boolean = false

  override def involvesPiecesOfSameSide: Boolean = true

  // TODO: Write tests for this
  override def execute(boardState: BoardState, piece: Piece,
                       secondPiece: Piece = null): BoardState = boardState

}
