package game

object RelativePositionRange {
  private val STAY_PUT: RelativePosition = new RelativePosition(0, 0)

  def determineStep(start: RelativePosition,
                    finish: RelativePosition): RelativePosition = {
    new RelativePosition(finish.offsetX - start.offsetX,
      finish.offsetY - start.offsetY)
  }

  // TODO: Write tests for this
  def apply(startAndEnd: RelativePosition): RelativePositionRange =
    new RelativePositionRange(STAY_PUT, startAndEnd)

}

class RelativePositionRange(val start: RelativePosition,
                            val finish: RelativePosition) {

  // TODO: Write tests for this
  def apply(index: Int): RelativePosition = new RelativePosition(0, 0)

  override def equals(obj: Any): Boolean = obj match {
    case other: RelativePositionRange => (this.start == other.start) &&
      (this.finish == other.finish)
    case _ => false
  }

  // TODO: Write tests for this
  override def hashCode(): Int = 0

}
