package game.pieces.white

import game.moves.{Castling, SpecialMoveSpecification}

object King extends game.pieces.King with WhitePiece {

  override val specialMoves: Set[SpecialMoveSpecification] = Set(Castling)

}
