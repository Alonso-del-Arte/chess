package game.pieces.darkgray

import game.moves.{BlackEnPassant, BlackPawnInitialTwoForward,
  SpecialMoveSpecification}

/**
 * The Dark Gray pointy hat guy's pawn is equivalent to the Black kingside
 * bishop's pawn, starts out on f7.
 */
object PointyHatGuysPawn extends DarkGrayPawn {
  override def specialMoves: Set[SpecialMoveSpecification] = Set(BlackEnPassant,
    BlackPawnInitialTwoForward)

}
