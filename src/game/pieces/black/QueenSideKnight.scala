package game.pieces.black

import game.moves.SpecialMoveSpecification
import game.pieces.Knight

object QueenSideKnight extends Knight with BlackPiece {
  override def specialMoves: Set[SpecialMoveSpecification] = Set()
  
}
