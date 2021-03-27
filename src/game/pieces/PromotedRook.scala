package game.pieces

import game.{Neutral, Player}

class PromotedRook(val pawn: Pawn) extends Rook with Promoted {
  override val affiliation: Player = Neutral // THIS WILL FAIL THE FIRST TEST

  override def prior: Pawn = pawn

}
