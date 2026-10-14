package game.pieces.white

import game.moves.{SpecialMoveSpecification, WhiteEnPassant,
  WhitePawnInitialTwoForward}

object KingPawn extends WhitePawn {
  override def specialMoves: Set[SpecialMoveSpecification] =
    Set(WhiteEnPassant, WhitePawnInitialTwoForward)

}
