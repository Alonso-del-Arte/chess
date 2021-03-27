package game.pieces

import game.{Neutral, Player}

class PromotedBishop(val pawn: Pawn) extends Bishop with Promoted {
  override val affiliation: Player = Neutral // THIS WILL FAIL THE FIRST TEST

  override def prior: Pawn = pawn

}
