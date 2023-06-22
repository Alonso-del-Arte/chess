package game.pieces

import game.{RelativePosition, RelativePositionRange}

abstract class King extends Piece {
  override val possibleMoves: Set[RelativePositionRange] = Set()
  override val canJumpOver: Boolean = true
  override val captureSameAsMove: Boolean = false
  override val possibleCaptures: Set[RelativePositionRange] =
    Set(new RelativePositionRange(new RelativePosition(0, 0),
      new RelativePosition(55, 55)))

}
