package game.pieces.lightgray

import game.moves.SpecialMoveSpecification

object Tower extends game.pieces.Tower with LightGrayPiece {
  override def specialMoves: Set[SpecialMoveSpecification] = Set()

}
