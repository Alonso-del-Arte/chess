package game.moves

import game.{BoardState, RelativePositionRange}
import game.pieces.Piece

abstract class EnPassant extends SpecialMoveSpecification {

  override def isCapture: Boolean = true

  // TODO: Write a test for this
  override def involvesPiecesOfSameSide: Boolean = true

}
