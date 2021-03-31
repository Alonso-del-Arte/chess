package analysis.valuations

import analysis.Centipawns
import game.pieces.Piece

/**
 * A valuation is constant if it's always the same regardless of the progress of
 * the game. For example, a pawn could be valued at 100 centipawns, regardless
 * of whether it's a vital part of the player's current strategy or if it's
 * currently stymied by an opponent pawn.
 * @param initialValues The initial valuations, which will remain the same from
 *                      opening to middlegame to endgame.
 */
abstract class ConstantCentipawnValuation(initialValues: Map[Class[_ <: Piece], Centipawns])
  extends CentipawnValuation(initialValues) {
  private val keySet = this.initialValues.keySet

  override def valueOf(piece: Piece): Centipawns = {
    val results = this.keySet.filter(_.isAssignableFrom(piece.getClass))
    results.size match {
      case 0 => val excMsg = s"No matches for ${piece.toString}"
        throw new RuntimeException(excMsg) // THIS WILL FAIL SOME TEST FOR EXCEPTION TYPE
      case 1 => this.initialValues(results.head)
      case _ => val excMsg =
        s"Key ${piece.toString} is ambiguous: ${results.toString}"
        throw new RuntimeException(excMsg) // THIS WILL FAIL SOME TEST FOR EXCEPTION TYPE
    }
  }

}
