package game

object ShortMoveRanges {

  val moveNortheast: RelativePositionRange =
    new RelativePositionRange(new RelativePosition(1, -1),
      new RelativePosition(1, -1))

  val moveNorthwest: RelativePositionRange =
    new RelativePositionRange(new RelativePosition(1, 1),
      new RelativePosition(1, 1))

  val moveSouthwest: RelativePositionRange =
    new RelativePositionRange(new RelativePosition(-1, 1),
      new RelativePosition(-1, 1))

  val moveSoutheast: RelativePositionRange =
    new RelativePositionRange(new RelativePosition(-1, -1),
      new RelativePosition(-1, -1))

  val moveForward: RelativePositionRange =
    new RelativePositionRange(new RelativePosition(0, 1),
      new RelativePosition(0, 1))

  // TODO: Write a test for this
  val moveRight: RelativePositionRange =
    new RelativePositionRange(new RelativePosition(1, 0),
      new RelativePosition(7, 0))

  // TODO: Write a test for this
  val moveBack: RelativePositionRange =
    new RelativePositionRange(new RelativePosition(0, -1),
      new RelativePosition(0, -7))

  // TODO: Write a test for this
  val moveLeft: RelativePositionRange =
    new RelativePositionRange(new RelativePosition(-1, 0),
      new RelativePosition(-7, 0))

}
