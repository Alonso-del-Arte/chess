package game.pieces.black

import game.moves.{BlackEnPassant, BlackPawnInitialTwoForward,
  SpecialMoveSpecification}

object QueenSideBishopPawn extends BlackPawn with BlackPiece {
  override def specialMoves: Set[SpecialMoveSpecification] =
    Set(BlackEnPassant, BlackPawnInitialTwoForward)

}
