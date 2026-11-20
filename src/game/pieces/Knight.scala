package game.pieces

import game.{Black, Player, RelativePosition, RelativePositionRange}
import game.moves.SpecialMoveSpecification

object Knight extends PromotionFactory {

  val moveOneOClock: RelativePositionRange =
    new RelativePositionRange(new RelativePosition(1, 2),
      new RelativePosition(1, 2))

  val moveTwoOClock: RelativePositionRange =
    new RelativePositionRange(new RelativePosition(2, 1),
      new RelativePosition(2, 1))

  val moveFourOClock: RelativePositionRange =
    new RelativePositionRange(new RelativePosition(2, -1),
      new RelativePosition(2, -1))

  val moveFiveOClock: RelativePositionRange =
    new RelativePositionRange(new RelativePosition(1, -2),
      new RelativePosition(1, -2))

  val moveSevenOClock: RelativePositionRange =
    new RelativePositionRange(new RelativePosition(-1, -2),
      new RelativePosition(-1, -2))

  val moveEightOClock: RelativePositionRange =
    new RelativePositionRange(new RelativePosition(-2, -1),
      new RelativePosition(-2, -1))

  val moveTenOClock: RelativePositionRange =
    new RelativePositionRange(new RelativePosition(-2, 1),
      new RelativePosition(-2, 1))

  val moveElevenOClock: RelativePositionRange =
    new RelativePositionRange(new RelativePosition(-1, 2),
      new RelativePosition(-1, 2))

  val moves: Set[RelativePositionRange] = Set(moveOneOClock, moveTwoOClock,
    moveFourOClock, moveFiveOClock, moveSevenOClock, moveEightOClock,
    moveTenOClock, moveElevenOClock)

  // TODO: Write tests for this
  override def promote(pawn: Pawn): Promoted = new PromotedRook(new Pawn {
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

abstract class Knight extends Piece with PromotionChoice {
  override val possibleMoves: Set[RelativePositionRange] = Knight.moves
  override val canJumpOver: Boolean = true
  override def specialMoves: Set[SpecialMoveSpecification] = Set()

}
