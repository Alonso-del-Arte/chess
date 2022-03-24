package game.pieces

import game.RelativePositionRange

/**
 * The emperor is a chess piece to be used strictly for testing purposes only.
 * The emperor has the same moves as the king, but the game can proceed without
 * an emperor on one side if that side still has an empress. Also, a pawn can be
 * promoted to an emperor, in which case the opponent must also capture the
 * promoted emperor in order to win, or capture any other emperors and empresses
 * on the same side and checkmate the promoted emperor.
 * @author Alonso del Arte
 */
abstract class Emperor extends Piece {
  override val possibleMoves: Set[RelativePositionRange] = Set()

}
