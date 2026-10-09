package game.pieces.white

import game.moves.SpecialMoveSpecification
import game.pieces.Knight

object QueenSideKnight extends Knight with WhitePiece {
  override def specialMoves: Set[SpecialMoveSpecification] = Set()
  
}
