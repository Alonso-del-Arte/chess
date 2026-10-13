package game.pieces.black

import game.moves.SpecialMoveSpecification
import game.pieces.Rook

object QueenSideRook extends Rook with BlackPiece {
  override def specialMoves: Set[SpecialMoveSpecification] = Set()
  
}
