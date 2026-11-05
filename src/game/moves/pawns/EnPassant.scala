package game.moves.pawns

import game.moves.SpecialMoveSpecification

abstract class EnPassant extends SpecialMoveSpecification {

  override def isCapture: Boolean = true

  override def involvesPiecesOfSameSide: Boolean = false

}
