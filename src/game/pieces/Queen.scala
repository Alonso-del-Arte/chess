package game.pieces

import game.RelativePositionRange
import game.moves.SpecialMoveSpecification

object Queen extends PromotionFactory {

  override def promote(pawn: Pawn): Promoted = new PromotedQueen(pawn)

}

abstract class Queen extends Piece with PromotionChoice {
  override val possibleMoves: Set[RelativePositionRange] =
    Bishop.moves ++ Rook.moves
  override def specialMoves: Set[SpecialMoveSpecification] = Set()

}
