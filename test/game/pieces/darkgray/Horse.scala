package game.pieces.darkgray

import game.moves.{BlackPawnInitialTwoForward, SpecialMoveSpecification}

object Horse extends game.pieces.Horse with DarkGrayPiece {
  override def specialMoves: Set[SpecialMoveSpecification] = Set(BlackPawnInitialTwoForward)
  
}
