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

  val moveLeft: RelativePositionRange =
    new RelativePositionRange(new RelativePosition(-1, 0),
      new RelativePosition(-7, 0))

  val moves: Set[RelativePositionRange] = Set(moveForward, moveRight, moveBack,
    moveLeft)

}

abstract class Rook extends Piece {
  override val possibleMoves: Set[RelativePositionRange] = Rook.moves
  override val canJumpOver: Boolean = false
  override val captureSameAsMove: Boolean = true
  val couldCastle: Boolean = true

}
