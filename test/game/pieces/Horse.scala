package game.pieces

import game.moves.{EnPassant, SpecialMoveSpecification}

/**
 * The horse is a chess piece to be used strictly for testing purposes only. The
 * horse has the same moves as the knight.
 * @author Alonso del Arte
 */
abstract class Horse extends Knight {
  override def specialMoves: Set[SpecialMoveSpecification] = Set()
}
