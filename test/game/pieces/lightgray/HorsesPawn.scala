package game.pieces.lightgray

import game.moves.{SpecialMoveSpecification, WhiteEnPassant,
  WhitePawnInitialTwoForward}

object HorsesPawn extends LightGrayPawn {
  override def specialMoves: Set[SpecialMoveSpecification] = Set(WhiteEnPassant,
    WhitePawnInitialTwoForward)

}
