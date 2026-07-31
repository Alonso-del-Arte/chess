package game.pieces

import game.RelativePositionRange

/**
 * The horse is a chess piece to be used strictly for testing purposes only. The
 * horse has the same moves as the knight.
 * @author Alonso del Arte
 */
abstract class Horse extends Piece {
  override val possibleMoves: Set[RelativePositionRange] = Knight.moves
  // TODO: Write tests for this
  override val canJumpOver: Boolean = false
  // TODO: Write tests for this
  override val captureSameAsMove: Boolean = false
  // TODO: Write tests for this
  override val possibleCaptures: Set[RelativePositionRange] = Rook.moves
  // TODO: Write tests for this
  override val hasSpecialMoves: Boolean = true

}
