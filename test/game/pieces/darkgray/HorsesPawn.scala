package game.pieces.darkgray

import game.moves.{BlackEnPassant, BlackPawnInitialTwoForward,
  SpecialMoveSpecification}

/**
 * The Dark Gray horse's pawn is equivalent to the Black kingside knight's pawn,
 * and starts out on g7.
 */
object HorsesPawn extends DarkGrayPawn {
  override def specialMoves: Set[SpecialMoveSpecification] = Set(BlackEnPassant,
    BlackPawnInitialTwoForward)

}
