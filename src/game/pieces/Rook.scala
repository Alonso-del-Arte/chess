package game.pieces

import game.{RelativePosition, RelativePositionRange}

object Rook {

  val moveForward: RelativePositionRange =
    new RelativePositionRange(new RelativePosition(0, 1),
      new RelativePosition(0, 7))

  val moveRight: RelativePositionRange =
    new RelativePositionRange(new RelativePosition(1, 0),
      new RelativePosition(7, 0))

  val moveBack: RelativePositionRange =
    new RelativePositionRange(new RelativePosition(0, -1),
      new RelativePosition(0, -7))

  // TODO: Write test for this
  val moveLeft: RelativePositionRange =
    new RelativePositionRange(new RelativePosition(-1, -1),
      new RelativePosition(-7, -7))

  // TODO: Write test for this
  val moves: Set[RelativePositionRange] = Set()

}

abstract class Rook extends Piece {
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
  override val possibleCaptures: Set[RelativePositionRange] = this.possibleMoves

}
