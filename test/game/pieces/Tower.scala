package game.pieces

import game.RelativePositionRange

/**
 * The tower is a chess piece to be used strictly for testing purposes only. The
 * tower has the same moves as the rook.
 * @author Alonso del Arte
 */
abstract class Tower extends Piece {
  override val possibleMoves: Set[RelativePositionRange] = Set()
  override val canJumpOver: Boolean = true

}
