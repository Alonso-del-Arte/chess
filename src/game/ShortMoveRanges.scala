package game

object ShortMoveRanges {

  // TODO: Write a test for this
  val moveNortheast: RelativePositionRange =
    new RelativePositionRange(new RelativePosition(1, -1),
      new RelativePosition(7, -7))

  // TODO: Write a test for this
  val moveNorthwest: RelativePositionRange =
    new RelativePositionRange(new RelativePosition(1, 1),
      new RelativePosition(7, 7))

  // TODO: Write a test for this
  val moveSouthwest: RelativePositionRange =
    new RelativePositionRange(new RelativePosition(-1, 1),
      new RelativePosition(-7, 7))

  // TODO: Write a test for this
  val moveSoutheast: RelativePositionRange =
    new RelativePositionRange(new RelativePosition(-1, -1),
      new RelativePosition(-7, -7))

  // TODO: Write a test for this
  val moveForward: RelativePositionRange =
    new RelativePositionRange(new RelativePosition(0, 1),
      new RelativePosition(0, 7))

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
