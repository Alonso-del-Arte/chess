package game.pieces

import game.{RelativePosition, RelativePositionRange}

object Knight {

  // TODO: Write a test for this
  val moveOneOClock: RelativePositionRange =
    new RelativePositionRange(new RelativePosition(1, 1),
      new RelativePosition(5, 5))

  // TODO: Write a test for this
  val moveTwoOClock: RelativePositionRange =
    new RelativePositionRange(new RelativePosition(1, 2),
      new RelativePosition(5, 5))

  // TODO: Write a test for this
  val moveFourOClock: RelativePositionRange =
    new RelativePositionRange(new RelativePosition(1, 4),
      new RelativePosition(5, 5))

  // TODO: Write a test for this
  val moveFiveOClock: RelativePositionRange =
    new RelativePositionRange(new RelativePosition(1, 5),
      new RelativePosition(5, 5))

  // TODO: Write a test for this
  val moveSevenOClock: RelativePositionRange =
    new RelativePositionRange(new RelativePosition(1, 7),
      new RelativePosition(5, 5))

  // TODO: Write a test for this
  val moveEightOClock: RelativePositionRange =
    new RelativePositionRange(new RelativePosition(1, 8),
      new RelativePosition(5, 5))

  // TODO: Write a test for this
  val moveTenOClock: RelativePositionRange =
    new RelativePositionRange(new RelativePosition(1, 10),
      new RelativePosition(5, 5))

  // TODO: Write a test for this
  val moveElevenOClock: RelativePositionRange =
    new RelativePositionRange(new RelativePosition(1, 11),
      new RelativePosition(5, 5))

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
