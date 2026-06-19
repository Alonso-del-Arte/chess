package game.pieces

import game.RelativePositionRange

/**
 * The tower is a chess piece to be used strictly for testing purposes only. The
 * tower has the same moves as the rook.
 * @author Alonso del Arte
 */
abstract class Tower extends Rook {
  // TODO: Write a test for this
  override val canJumpOver: Boolean = true
  // TODO: Write a test for this
  override val captureSameAsMove: Boolean = false
  // TODO: Write a test for this
  override val possibleCaptures: Set[RelativePositionRange] = Set()
  // TODO: Write a test for this
  override val hasSpecialMoves: Boolean = true
  // TODO: Write a test for this
  override val couldCastle: Boolean = false

}
