package game.pieces.lightgray

import game.moves.{SpecialMoveSpecification, WhitePawnInitialTwoForward}

object Horse extends game.pieces.Horse with LightGrayPiece {
  override def specialMoves: Set[SpecialMoveSpecification] =
    Set(WhitePawnInitialTwoForward)

}
