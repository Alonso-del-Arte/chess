package game.pieces

import game.{Neutral, Player}

class PromotedQueen(val pawn: Pawn) extends Queen with Promoted {
  override val affiliation: Player = Neutral // THIS WILL FAIL THE FIRST TEST

  override def prior: Pawn = pawn

}
