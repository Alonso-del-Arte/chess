package game.pieces.black

import game.{Black, Player, RelativePosition, RelativePositionRange}

object King extends game.pieces.King with BlackPiece {
  // TODO: Write a test for this
  override val possibleMoves: Set[RelativePositionRange] = Set()
  override val captureSameAsMove: Boolean = true
  // TODO: Write a test for this
  override def possibleCaptures: Set[RelativePositionRange] =
    Set(new RelativePositionRange(new RelativePosition(0, 1),
      new RelativePosition(5, 9)))

}
