package game.pieces.white

import game.{Player, RelativePosition, RelativePositionRange, White}
import game.pieces.Bishop

object QueenSideBishop extends Bishop with WhitePiece {
  override val affiliation: Player = White
  private val toNortheast =
    new RelativePositionRange(new RelativePosition(1, -1),
      new RelativePosition(7, -7))
  private val toNorthwest =
    new RelativePositionRange(new RelativePosition(1, 1),
      new RelativePosition(7, 7))
  private val toSouthwest =
    new RelativePositionRange(new RelativePosition(-1, 1),
      new RelativePosition(-7, 7))
  private val toSoutheast =
    new RelativePositionRange(new RelativePosition(-1, -1),
      new RelativePosition(-7, -7))
  override val possibleMoves: Set[RelativePositionRange] =
    Set(toNortheast, toNorthwest, toSouthwest, toSoutheast)
  override val canJumpOver: Boolean = false
  override val captureSameAsMove: Boolean = true
  override val possibleCaptures: Set[RelativePositionRange] = this.possibleMoves

}
