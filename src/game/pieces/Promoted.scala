package game.pieces

/**
 * Characteristic of a piece promoted from a pawn.
 */
trait Promoted {

  /**
   * Retrieves the pawn this piece was promoted from.
   * @return The pawn this piece was promoted from. For example, White queenside
   *         rook's pawn.
   */
  def prior: Pawn

}
