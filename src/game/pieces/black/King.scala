package game.pieces.black

import game.{RelativePosition, RelativePositionRange, ShortMoveRanges}

object King extends game.pieces.King with BlackPiece {
  override val captureSameAsMove: Boolean = true

}
