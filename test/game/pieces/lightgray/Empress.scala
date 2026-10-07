package game.pieces.lightgray

import game.moves.SpecialMoveSpecification

object Empress extends game.pieces.Empress with LightGrayPiece {
  override def specialMoves: Set[SpecialMoveSpecification] = Set()

}
