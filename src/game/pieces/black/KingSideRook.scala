package game.pieces.black

import game.{Black, Player, RelativePositionRange}
import game.pieces.Rook

object KingSideRook extends Rook with BlackPiece {
  override val hasSpecialMoves: Boolean = false

}
