package game.pieces

import game.RelativePositionRange
import game.moves.SpecialMoveSpecification

abstract class Queen extends Piece {
  override val possibleMoves: Set[RelativePositionRange] =
    Bishop.moves ++ Rook.moves
  override def specialMoves: Set[SpecialMoveSpecification] = Set()

}
