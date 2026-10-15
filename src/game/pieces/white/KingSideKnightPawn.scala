package game.pieces.white

import game.moves.{SpecialMoveSpecification, WhiteEnPassant,
  WhitePawnInitialTwoForward}

/**
 * White's kingside knight's pawn starts out on g2. If this pawn doesn't move
 * and White castles, this pawn protects the king from attacks from the Black
 * queen or either of the Black rooks.
 */
object KingSideKnightPawn extends WhitePawn {
  override def specialMoves: Set[SpecialMoveSpecification] =
    Set(WhiteEnPassant, WhitePawnInitialTwoForward)

}
