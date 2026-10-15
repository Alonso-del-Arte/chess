package game.pieces.white

import game.moves.{SpecialMoveSpecification, WhiteEnPassant,
  WhitePawnInitialTwoForward}

object KingSideBishopPawn extends WhitePawn {
  override def specialMoves: Set[SpecialMoveSpecification] =
    Set(WhiteEnPassant, WhitePawnInitialTwoForward)

}
