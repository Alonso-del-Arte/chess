package game.pieces

import game.{RelativePosition, RelativePositionRange}

object Knight {

  val moveOneOClock: RelativePositionRange =
    new RelativePositionRange(new RelativePosition(1, 2),
      new RelativePosition(1, 2))

  val moveTwoOClock: RelativePositionRange =
    new RelativePositionRange(new RelativePosition(2, 1),
      new RelativePosition(2, 1))

  val moveFourOClock: RelativePositionRange =
    new RelativePositionRange(new RelativePosition(2, -1),
      new RelativePosition(2, -1))

  val moveFiveOClock: RelativePositionRange =
    new RelativePositionRange(new RelativePosition(1, -2),
      new RelativePosition(1, -2))

  val moveSevenOClock: RelativePositionRange =
    new RelativePositionRange(new RelativePosition(-1, -2),
      new RelativePosition(-1, -2))

  val moveEightOClock: RelativePositionRange =
    new RelativePositionRange(new RelativePosition(-2, -1),
      new RelativePosition(-2, -1))

  val moveTenOClock: RelativePositionRange =
    new RelativePositionRange(new RelativePosition(-2, 1),
      new RelativePosition(-2, 1))

  val moveElevenOClock: RelativePositionRange =
    new RelativePositionRange(new RelativePosition(-1, 2),
      new RelativePosition(-1, 2))

  // TODO: Write a test for this
  val moves: Set[RelativePositionRange] = Set(moveTenOClock)

}

abstract class Knight extends Piece {
  // TODO: Write tests for this
  override val possibleMoves: Set[RelativePositionRange] = Bishop.moves
  // TODO: Write tests for this
  override val canJumpOver: Boolean = false
  // TODO: Write tests for this
  override val captureSameAsMove: Boolean = false
  // TODO: Write tests for this
  override val possibleCaptures: Set[RelativePositionRange] = Rook.moves
  // TODO: Write tests for this
  override val hasSpecialMoves: Boolean = true

}
