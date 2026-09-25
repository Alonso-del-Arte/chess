package game.moves

import game.{BoardState, RelativePositionRange}
import game.pieces.Piece

object Castling extends SpecialMoveSpecification {

  // TODO: Write tests for this
  override def meetsPrerequisites(boardState: BoardState): Boolean = true

  override def isCapture: Boolean = false

  override def involvesPiecesOfSameSide: Boolean = true

  // TODO: Write tests for this
  override def execute(boardState: BoardState): BoardState = boardState

}
