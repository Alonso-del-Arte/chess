package game.pieces.white

import game.{Player, RelativePositionRange, White}
import game.pieces.{Bishop, Knight, Rook}

object QueenSideKnight extends Knight with WhitePiece {
  override val affiliation: Player = White
  // TODO: Write tests for this
  override val possibleMoves: Set[RelativePositionRange] = Bishop.moves
  // TODO: Write tests for this
  override val canJumpOver: Boolean = false
  // TODO: Write tests for this
  override val captureSameAsMove: Boolean = false
  // TODO: Write tests for this
  override val possibleCaptures: Set[RelativePositionRange] = Rook.moves
  // TODO: Write tests for this
  override val hasSpecialMoves: Boolean = true

}
