package game.pieces.black

import game.{Black, Player, RelativePositionRange}
import game.pieces.{Bishop, Knight, Rook}

object QueenSideKnight extends Knight with BlackPiece {
  override val affiliation: Player = Black
  override val possibleMoves: Set[RelativePositionRange] = Knight.moves
  // TODO: Write tests for this
  override val canJumpOver: Boolean = false
  // TODO: Write tests for this
  override val captureSameAsMove: Boolean = false
  // TODO: Write tests for this
  override val possibleCaptures: Set[RelativePositionRange] = Rook.moves
  // TODO: Write tests for this
  override val hasSpecialMoves: Boolean = true

}
