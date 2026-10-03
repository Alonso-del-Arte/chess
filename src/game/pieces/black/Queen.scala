package game.pieces.black

import game.moves.SpecialMoveSpecification

object Queen extends game.pieces.Queen with BlackPiece {
  override def specialMoves: Set[SpecialMoveSpecification] = Set()
  
}
