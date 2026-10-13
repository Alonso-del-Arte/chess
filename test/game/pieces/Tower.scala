package game.pieces

import game.moves.SpecialMoveSpecification

/**
 * The tower is a chess piece to be used strictly for testing purposes only. The
 * tower has the same moves as the rook.
 * @author Alonso del Arte
 */
abstract class Tower extends Rook {
  override def specialMoves: Set[SpecialMoveSpecification] = Set()

}
