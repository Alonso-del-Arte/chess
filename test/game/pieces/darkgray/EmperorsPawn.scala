package game.pieces.darkgray

import game.{RelativePosition, RelativePositionRange, ShortMoveRanges}

/**
 * The Dark Gray emperor's pawn is equivalent to the Black king's pawn.
 */
object EmperorsPawn extends DarkGrayPawn {
  override val possibleMoves: Set[RelativePositionRange] =
    Set(ShortMoveRanges.moveBack)

}
