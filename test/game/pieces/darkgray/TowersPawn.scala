package game.pieces.darkgray

import game.moves.{BlackEnPassant, BlackPawnInitialTwoForward,
  SpecialMoveSpecification}

object TowersPawn extends DarkGrayPawn {
  override def specialMoves: Set[SpecialMoveSpecification] = Set(BlackEnPassant,
    BlackPawnInitialTwoForward)

}
