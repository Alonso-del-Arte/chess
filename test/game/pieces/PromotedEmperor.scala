package game.pieces

import game.{Player, RelativePositionRange, ShortMoveRanges}

class PromotedEmperor(val pawn: Pawn) extends King with Promoted {
  override val affiliation: Player = this.pawn.affiliation
  override val possibleCaptures: Set[RelativePositionRange] =
    Set(ShortMoveRanges.moveForward, ShortMoveRanges.moveRight,
      ShortMoveRanges.moveBack, ShortMoveRanges.moveLeft,
      ShortMoveRanges.moveNortheast, ShortMoveRanges.moveNorthwest,
      ShortMoveRanges.moveSouthwest, ShortMoveRanges.moveSoutheast)
  // TODO: Write tests for this
  override val hasSpecialMoves: Boolean = false

  // TODO: Write tests for this
  override def prior: Pawn = NeutralPawn

}
