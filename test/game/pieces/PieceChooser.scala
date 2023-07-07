package game.pieces

import game.{Neutral, Player, RelativePositionRange}

object PieceChooser {

  // TODO: Write tests for this
  def choosePawn: Pawn = new Pawn {
    override val affiliation: Player = new Player {}
    override val possibleMoves: Set[RelativePositionRange] = Set()

  }

  // TODO: Write tests for this
  def choosePawn(side: Player): Pawn = this.choosePawn

}
