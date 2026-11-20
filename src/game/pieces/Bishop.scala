package game.pieces

import game.{RelativePosition, RelativePositionRange}

object Bishop extends PromotionFactory {

  val moveNortheast: RelativePositionRange =
    new RelativePositionRange(new RelativePosition(1, -1),
      new RelativePosition(7, -7))

  val moveNorthwest: RelativePositionRange =
    new RelativePositionRange(new RelativePosition(1, 1),
      new RelativePosition(7, 7))

  val moveSouthwest: RelativePositionRange =
    new RelativePositionRange(new RelativePosition(-1, 1),
      new RelativePosition(-7, 7))

  val moveSoutheast: RelativePositionRange =
    new RelativePositionRange(new RelativePosition(-1, -1),
      new RelativePosition(-7, -7))

  val moves: Set[RelativePositionRange] = Set(moveNorthwest, moveNortheast,
    moveSoutheast, moveSouthwest)

  override def promote(pawn: Pawn): Promoted = new PromotedBishop(pawn)

}

import game.moves.SpecialMoveSpecification

abstract class Bishop extends Piece with PromotionChoice {
  override val possibleMoves: Set[RelativePositionRange] = Bishop.moves
  override def specialMoves: Set[SpecialMoveSpecification] = Set()

}
