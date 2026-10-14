package game.moves

import game.{BoardState, RelativePositionRange}
import game.pieces.Piece

abstract class EnPassant extends SpecialMoveSpecification {

  // TODO: Write a test for this
  override def isCapture: Boolean = false

  // TODO: Write a test for this
  override def involvesPiecesOfSameSide: Boolean = true

}
