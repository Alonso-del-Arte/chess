package game.pieces.black

import game.moves.{Castling, SpecialMoveSpecification}

object King extends game.pieces.King with BlackPiece {

  override def specialMoves: Set[SpecialMoveSpecification] = Set(Castling)
  
}
