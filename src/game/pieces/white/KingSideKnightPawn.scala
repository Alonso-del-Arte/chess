package game.pieces.white

import game.{RelativePosition, RelativePositionRange}

/**
 * White's kingside knight's pawn starts out on g2. If this pawn doesn't move
 * and White castles, this pawn protects the king from attacks from the Black
 * queen or either of the Black rooks.
 */
object KingSideKnightPawn extends WhitePawn {
  override val possibleMoves: Set[RelativePositionRange]
  = Set(new RelativePositionRange(new RelativePosition(0, 1),
    new RelativePosition(0, 1)))

}
