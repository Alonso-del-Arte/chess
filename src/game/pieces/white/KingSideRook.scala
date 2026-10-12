package game.pieces.white

import game.moves.SpecialMoveSpecification
import game.pieces.Rook

object KingSideRook extends Rook with WhitePiece {
  override def specialMoves: Set[SpecialMoveSpecification] = Set()

}
