package game.pieces.darkgray

import game.moves.{BlackEnPassant, BlackPawnInitialTwoForward,
  SpecialMoveSpecification}

/**
 * The Dark Gray empress's pawn is equivalent to the Black queen's pawn.
 */
object EmpressesPawn extends DarkGrayPawn {
  override def specialMoves: Set[SpecialMoveSpecification] = Set(BlackEnPassant,
    BlackPawnInitialTwoForward)

}
