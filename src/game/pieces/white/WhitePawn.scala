package game.pieces.white

import game.{Player, RelativePosition, RelativePositionRange, White}
import game.pieces.Pawn

abstract class WhitePawn extends Pawn with WhitePiece {
  override val affiliation: Player = White
  override val possibleMoves: Set[RelativePositionRange]
  = Set(new RelativePositionRange(new RelativePosition(0, 1),
    new RelativePosition(0, 2)))
  override val canJumpOver: Boolean = false
  override val captureSameAsMove: Boolean = false
  override val possibleCaptures: Set[RelativePositionRange]
  = Set(RelativePositionRange(new RelativePosition(-1, 1)),
    RelativePositionRange(new RelativePosition(1, 1)))

}
