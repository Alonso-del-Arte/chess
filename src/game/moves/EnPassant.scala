package game.moves

abstract class EnPassant extends SpecialMoveSpecification {

  override def isCapture: Boolean = true

  override def involvesPiecesOfSameSide: Boolean = false

}
