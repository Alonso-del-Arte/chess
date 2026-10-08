package game.pieces.black

import game.moves.SpecialMoveSpecification
import game.pieces.Bishop

object QueenSideBishop extends Bishop with BlackPiece {
  override def specialMoves: Set[SpecialMoveSpecification] = Set()
  
}
