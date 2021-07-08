package game

object RelativePositionRange {

  def determineStep(start: RelativePosition,
                    finish: RelativePosition): RelativePosition = {
    new RelativePosition(-1, 0)
  }

}

class RelativePositionRange(val start: RelativePosition,
                            val finish: RelativePosition) {

}
