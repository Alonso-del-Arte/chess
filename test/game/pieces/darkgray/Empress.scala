package game.pieces.darkgray

import game.moves.SpecialMoveSpecification

object Empress extends game.pieces.Empress with DarkGrayPiece {
  override def specialMoves: Set[SpecialMoveSpecification] = Set()

}
