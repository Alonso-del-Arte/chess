package game.pieces

import game.{RelativePosition, RelativePositionRange}

object Bishop {

  val moveNortheast: RelativePositionRange =
    new RelativePositionRange(new RelativePosition(1, -1),
      new RelativePosition(7, -7))

  val moveNorthwest: RelativePositionRange =
    new RelativePositionRange(new RelativePosition(1, 1),
      new RelativePosition(7, 7))

  val moveSouthwest: RelativePositionRange =
    new RelativePositionRange(new RelativePosition(-1, 1),
      new RelativePosition(-7, 7))

  // TODO: Write test for this
  val moveSoutheast: RelativePositionRange =
    new RelativePositionRange(new RelativePosition(0, 0),
      new RelativePosition(0, 0))

  // TODO: Write test for this
  val moves: Set[RelativePositionRange] = Set()

}

abstract class Bishop extends Piece {
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
