package game.pieces.darkgray

import game.{RelativePositionRange, ShortMoveRanges}

/**
 * The Dark Gray pointy hat guy's pawn is equivalent to the Black kingside
 * bishop's pawn, starts out on f7.
 */
object PointyHatGuysPawn extends DarkGrayPawn {
  override val possibleMoves: Set[RelativePositionRange] =
    Set(ShortMoveRanges.moveBack)

}
