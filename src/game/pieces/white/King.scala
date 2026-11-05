package game.pieces.white

import game.moves.{KingsideCastling, QueensideCastling,
  SpecialMoveSpecification}

object King extends game.pieces.King with WhitePiece {
  override val specialMoves: Set[SpecialMoveSpecification] =
    Set(KingsideCastling, QueensideCastling)

}
