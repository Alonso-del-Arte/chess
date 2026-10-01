package game.pieces.white

import game.moves.SpecialMoveSpecification
import game.pieces.Bishop

object QueenSideBishop extends Bishop with WhitePiece {
  override def specialMoves: Set[SpecialMoveSpecification] = Set()
  
}
