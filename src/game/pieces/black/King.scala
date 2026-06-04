package game.pieces.black

import game.{RelativePosition, RelativePositionRange, ShortMoveRanges}

object King extends game.pieces.King with BlackPiece {
  override val captureSameAsMove: Boolean = true
  // TODO: Write a test for this
  override def possibleCaptures: Set[RelativePositionRange] =
    Set(new RelativePositionRange(new RelativePosition(0, 1),
      new RelativePosition(5, 9)))

}
