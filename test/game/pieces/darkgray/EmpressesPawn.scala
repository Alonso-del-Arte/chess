package game.pieces.darkgray

import game.{RelativePositionRange, ShortMoveRanges}

/**
 * The Dark Gray empress's pawn is equivalent to the Black queen's pawn.
 */
object EmpressesPawn extends DarkGrayPawn {
  override val possibleMoves: Set[RelativePositionRange] =
    Set(ShortMoveRanges.moveBack)

}
