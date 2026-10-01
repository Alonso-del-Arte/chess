package game.pieces.white

import game.moves.SpecialMoveSpecification

object Queen extends game.pieces.Queen with WhitePiece {
  override def specialMoves: Set[SpecialMoveSpecification] = Set()

}
