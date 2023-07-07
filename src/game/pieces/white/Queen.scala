package game.pieces.white

import game.{Player, RelativePosition, RelativePositionRange, White}

object Queen extends game.pieces.Queen with WhitePiece {
  override val affiliation: Player = White
  private val forwards = new RelativePositionRange(new RelativePosition(0, 1),
    new RelativePosition(0, 7))
  private val right = new RelativePositionRange(new RelativePosition(1, 0),
    new RelativePosition(7, 0))
  private val backwards = new RelativePositionRange(new RelativePosition(0, -1),
    new RelativePosition(0, -7))
  private val left = new RelativePositionRange(new RelativePosition(-1, 0),
    new RelativePosition(-7, 0))
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
  override val possibleMoves: Set[RelativePositionRange] = Set(forwards, right,
    backwards, left, toNortheast, toNorthwest, toSouthwest, toSoutheast)
  override val canJumpOver: Boolean = false
  override val captureSameAsMove: Boolean = true
  override val possibleCaptures: Set[RelativePositionRange] = this.possibleMoves

}
