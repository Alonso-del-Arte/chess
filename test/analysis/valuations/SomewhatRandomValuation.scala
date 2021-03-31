package analysis.valuations
import analysis.Centipawns
import game.pieces.Piece

object SomewhatRandomValuation
  extends ConstantCentipawnValuation(ConstantCentipawnValuationTest
    .RANDOMLY_WEIGHTED_VALUATIONS) {
  private var callCounter = 0

  /**
   * Tells how many times the valueOf function has been called. This is a
   * feature that should probably never be included on the Source Packages side
   * of this program.
   * @return The number of times valueOf has been called for this valuation
   *         object. Should be 0 at classloading, 1 after the first call, 2
   *         after the second call, etc.
   */
  def callCount: Int = this.callCounter

  override def valueOf(piece: Piece): Centipawns = {
    this.callCounter += 1
    super.valueOf(piece)
  }

}
