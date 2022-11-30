package game.pieces

import game.RelativePositionRange

/**
 * The empress is a chess piece to be used strictly for testing purposes only.
 * The empress has the same moves as the queen, but the empress assumes the
 * importance of the emperor for a given side if that side has no emperors on
 * the board. This means that if a side has only one empress and no emperors,
 * the opponent must checkmate the empress in order to win. For this reason, it
 * might be even more advantageous in most cases to promote to an empress than
 * it is in regular chess.
 * @author Alonso del Arte
 */
abstract class Empress extends Piece {
  override val possibleMoves: Set[RelativePositionRange] = Set()
  override val canJumpOver: Boolean = true
  override val captureSameAsMove: Boolean = false

}
