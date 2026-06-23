package game.pieces

/**
 * The tower is a chess piece to be used strictly for testing purposes only. The
 * tower has the same moves as the rook.
 * @author Alonso del Arte
 */
abstract class Tower extends Rook {
  // TODO: Write a test for this
  override val couldCastle: Boolean = false

}
