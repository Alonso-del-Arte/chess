package game.pieces.white

import game.{RelativePosition, RelativePositionRange}
import game.pieces.Pawn

abstract class WhitePawn extends Pawn with WhitePiece {
  override val possibleMoves: Set[RelativePositionRange]
    = Set(new RelativePositionRange(new RelativePosition(0, 1),
      new RelativePosition(0, 2)))
  override val possibleCaptures: Set[RelativePositionRange]
    = Set(RelativePositionRange(new RelativePosition(-1, 1)),
      RelativePositionRange(new RelativePosition(1, 1)))
  override val hasSpecialMoves: Boolean = true

}
