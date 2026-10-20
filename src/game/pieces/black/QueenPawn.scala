package game.pieces.black

import game.moves.{BlackEnPassant, BlackPawnInitialTwoForward,
  SpecialMoveSpecification}

/**
 * The pawn in front of the queen at the beginning of the game. Not to be
 * confused with [[game.pieces.PromotedQueen]], a pawn that is promoted to a
 * queen.
 */
object QueenPawn extends BlackPawn with BlackPiece {
  override def specialMoves: Set[SpecialMoveSpecification] =
    Set(BlackEnPassant, BlackPawnInitialTwoForward)

}
