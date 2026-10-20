package game.pieces.darkgray

import game.moves.{BlackEnPassant, BlackPawnInitialTwoForward, SpecialMoveSpecification}

/**
 * The Dark Gray emperor's pawn is equivalent to the Black king's pawn.
 */
object EmperorsPawn extends DarkGrayPawn {
  override def specialMoves: Set[SpecialMoveSpecification] = Set(BlackEnPassant,
    BlackPawnInitialTwoForward)

}
