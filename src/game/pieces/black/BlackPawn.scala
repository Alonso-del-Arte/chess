package game.pieces.black

import game.{Black, Player, RelativePosition, RelativePositionRange}
import game.pieces.Pawn

abstract class BlackPawn extends Pawn with BlackPiece {
  override val affiliation: Player = Black
  override val possibleMoves: Set[RelativePositionRange]
    = Set(new RelativePositionRange(new RelativePosition(0, -1),
      new RelativePosition(0, -2)))
  override val possibleCaptures: Set[RelativePositionRange]
    = Set(RelativePositionRange(new RelativePosition(-1, -1)),
      RelativePositionRange(new RelativePosition(1, -1)))

}
