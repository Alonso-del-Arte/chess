package game.pieces.white

import game.moves.SpecialMoveSpecification
import game.pieces.Rook

object QueenSideRook extends Rook with WhitePiece {
  override def specialMoves: Set[SpecialMoveSpecification] = Set()

}
