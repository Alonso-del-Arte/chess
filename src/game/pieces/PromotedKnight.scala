package game.pieces

import game.{Player, RelativePosition, RelativePositionRange}

class PromotedKnight(val pawn: Pawn) extends Knight with Promoted {
  override val affiliation: Player = this.pawn.affiliation
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

  override def prior: Pawn = this.pawn

}
