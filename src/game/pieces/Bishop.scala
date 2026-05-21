package game.pieces

import game.{RelativePosition, RelativePositionRange}

object Bishop {

  val moveNortheast: RelativePositionRange =
    new RelativePositionRange(new RelativePosition(1, -1),
      new RelativePosition(7, -7))

  val moveNorthwest: RelativePositionRange =
    new RelativePositionRange(new RelativePosition(1, 1),
      new RelativePosition(7, 7))

  val moveSouthwest: RelativePositionRange =
    new RelativePositionRange(new RelativePosition(-1, 1),
      new RelativePosition(-7, 7))

  val moveSoutheast: RelativePositionRange =
    new RelativePositionRange(new RelativePosition(-1, -1),
      new RelativePosition(-7, -7))

  val moves: Set[RelativePositionRange] = Set(moveNorthwest, moveNortheast,
    moveSoutheast, moveSouthwest)

}

abstract class Bishop extends Piece {
  override val possibleMoves: Set[RelativePositionRange] = Bishop.moves
  override val canJumpOver: Boolean = false
  override val captureSameAsMove: Boolean = true
  override val hasSpecialMoves: Boolean = false

}
