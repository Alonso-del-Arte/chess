package game.pieces

import game.RelativePositionRange

abstract class Pawn extends Piece {
  // TODO: Remove the following once WhitePawn and BlackPawn are available
  override val possibleMoves: Set[RelativePositionRange] = Set()
  override val canJumpOver: Boolean = false

}
