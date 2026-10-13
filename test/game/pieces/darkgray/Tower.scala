package game.pieces.darkgray

import game.moves.SpecialMoveSpecification

object Tower extends game.pieces.Tower with DarkGrayPiece {
  override def specialMoves: Set[SpecialMoveSpecification] = Set()

}
