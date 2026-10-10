package game.pieces.darkgray

import game.moves.{Castling, SpecialMoveSpecification}

object Horse extends game.pieces.Horse with DarkGrayPiece {
  override def specialMoves: Set[SpecialMoveSpecification] = Set()

}
