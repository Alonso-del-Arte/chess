package game.pieces.darkgray

import game.{DarkGray, Player, RelativePosition, RelativePositionRange}

// TODO: Determine if it's really necessary to implement DarkGrayPiece directly
object EmperorsPawn extends DarkGrayPawn with DarkGrayPiece {
  override val affiliation: Player = DarkGray
  override val possibleMoves: Set[RelativePositionRange] =
    Set(new RelativePositionRange(new RelativePosition(0, -1),
      new RelativePosition(0, -2)))
  override val canJumpOver: Boolean = false
  override val captureSameAsMove: Boolean = false
  override val possibleCaptures: Set[RelativePositionRange] =
    Set(RelativePositionRange(new RelativePosition(-1, -1)),
      RelativePositionRange(new RelativePosition(1, -1)))
  // TODO: Write a test for this
  override val hasSpecialMoves: Boolean = false

}
