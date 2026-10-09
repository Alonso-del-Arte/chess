package game.pieces.white

import game.moves.SpecialMoveSpecification
import game.pieces.Knight

object KingSideKnight extends Knight with WhitePiece {
  override def specialMoves: Set[SpecialMoveSpecification] = Set()
  
}
