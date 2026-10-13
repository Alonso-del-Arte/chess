package game.pieces.black

import game.moves.SpecialMoveSpecification
import game.pieces.Rook

object KingSideRook extends Rook with BlackPiece {
  override def specialMoves: Set[SpecialMoveSpecification] = Set()

}
