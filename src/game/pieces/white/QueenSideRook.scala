package game.pieces.white

import game.{Player, RelativePosition, RelativePositionRange, White}
import game.pieces.Rook

object QueenSideRook extends Rook with WhitePiece {
  override val affiliation: Player = White
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
