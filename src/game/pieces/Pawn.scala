package game.pieces

abstract class Pawn extends Piece {
  override val captureSameAsMove: Boolean = false
  // TODO: Write a test for this
  override val hasSpecialMoves: Boolean = false

}
