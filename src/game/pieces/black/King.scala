package game.pieces.black

import game.moves.{KingsideCastling, QueensideCastling,
  SpecialMoveSpecification}

object King extends game.pieces.King with BlackPiece {
  override val specialMoves: Set[SpecialMoveSpecification] =
    Set(KingsideCastling, QueensideCastling)

}

