package game.pieces.darkgray

import game.moves.{Castling, SpecialMoveSpecification}

object Emperor extends game.pieces.Emperor with DarkGrayPiece {
  override def specialMoves: Set[SpecialMoveSpecification] = Set(Castling)

}
