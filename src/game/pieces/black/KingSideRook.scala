package game.pieces.black

import game.{Black, Player, RelativePosition, RelativePositionRange}
import game.pieces.Rook

object KingSideRook extends Rook with BlackPiece {
  override val affiliation: Player = Black
  private val forwards = new RelativePositionRange(new RelativePosition(0, 1),
    new RelativePosition(0, 7))
  private val right = new RelativePositionRange(new RelativePosition(1, 0),
    new RelativePosition(7, 0))
  private val backwards = new RelativePositionRange(new RelativePosition(0, -1),
    new RelativePosition(0, -7))
  private val left = new RelativePositionRange(new RelativePosition(-1, 0),
    new RelativePosition(-7, 0))
  override val possibleMoves: Set[RelativePositionRange] =
    Set(forwards, right, backwards, left)
  override val canJumpOver: Boolean = false
  override val captureSameAsMove: Boolean = true
  override val possibleCaptures: Set[RelativePositionRange] =
    Set(forwards, right, backwards, left)

}
