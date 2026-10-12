package game.pieces.lightgray

import game.moves.SpecialMoveSpecification

object Horse extends game.pieces.Horse with LightGrayPiece {
  override def specialMoves: Set[SpecialMoveSpecification] = Set()

}
