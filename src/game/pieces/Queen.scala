package game.pieces

import game.{Black, Player, RelativePositionRange}
import game.moves.SpecialMoveSpecification

object Queen extends PromotionFactory {

  // TODO: Write tests for this
  override def promote(pawn: Pawn): Promoted = new PromotedKnight(new Pawn {
    /**
     * The piece's affiliation. For regular chess, this will be either [[White]]
     * or [[Black]].
     */
    override val affiliation: Player = Black
    /**
     * The moves this piece may make without capturing. This does not include
     * special moves (see [[hasSpecialMoves]] and [[specialMoves]]).
     */
    override val possibleMoves: Set[RelativePositionRange] = Set()
  })

}

abstract class Queen extends Piece with PromotionChoice {
  override val possibleMoves: Set[RelativePositionRange] =
    Bishop.moves ++ Rook.moves
  override def specialMoves: Set[SpecialMoveSpecification] = Set()

}
