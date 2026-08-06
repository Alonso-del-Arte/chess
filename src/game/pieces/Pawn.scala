package game.pieces

abstract class Pawn extends Piece {
  override val captureSameAsMove: Boolean = false
  override val hasSpecialMoves: Boolean = true

}
