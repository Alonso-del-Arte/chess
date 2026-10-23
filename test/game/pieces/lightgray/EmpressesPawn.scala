package game.pieces.lightgray

import game.moves.{Castling, SpecialMoveSpecification}

object EmpressesPawn extends LightGrayPawn {
  override def specialMoves: Set[SpecialMoveSpecification] = Set(Castling)

}
