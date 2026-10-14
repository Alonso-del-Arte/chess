package game.moves

import game.{BoardState, RelativePositionRange}
import game.pieces.Piece

abstract class EnPassant extends SpecialMoveSpecification {

  override def isCapture: Boolean = true

  override def involvesPiecesOfSameSide: Boolean = false

}
