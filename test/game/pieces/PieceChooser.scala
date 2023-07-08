package game.pieces

import game.{Player, RelativePositionRange}

object PieceChooser {

  // TODO: Write tests for this
  def choosePawn: Pawn = new Pawn {
    override val affiliation: Player = new Player {}
    override val possibleMoves: Set[RelativePositionRange] = Set()

  }

  // TODO: Write tests for this
  def choosePawn(side: Player): Pawn = this.choosePawn

  // TODO: Write tests for this
  def chooseOfficerPiece: Piece = this.choosePawn

  // TODO: Write tests for this
  def chooseOfficerPiece(side: Player): Piece = this.choosePawn

  // TODO: Write tests for this
  def choosePiece: Piece = this.choosePawn

  // TODO: Write tests for this
  def choosePiece(side: Player): Piece = this.choosePawn

}
