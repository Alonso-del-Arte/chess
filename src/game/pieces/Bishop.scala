package game.pieces

import game.{Black, Player, RelativePosition, RelativePositionRange}

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

  // TODO: Write tests for this
  override def promote(pawn: Pawn): Promoted = new PromotedQueen(new Pawn {
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

import game.moves.SpecialMoveSpecification

abstract class Bishop extends Piece with PromotionChoice {
  override val possibleMoves: Set[RelativePositionRange] = Bishop.moves
  override def specialMoves: Set[SpecialMoveSpecification] = Set()

}
