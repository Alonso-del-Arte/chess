package game.pieces

import game.{Black, Player, RelativePosition, RelativePositionRange}

object Rook extends PromotionFactory {

  val moveForward: RelativePositionRange =
    new RelativePositionRange(new RelativePosition(0, 1),
      new RelativePosition(0, 7))

  val moveRight: RelativePositionRange =
    new RelativePositionRange(new RelativePosition(1, 0),
      new RelativePosition(7, 0))

  val moveBack: RelativePositionRange =
    new RelativePositionRange(new RelativePosition(0, -1),
      new RelativePosition(0, -7))

  val moveLeft: RelativePositionRange =
    new RelativePositionRange(new RelativePosition(-1, 0),
      new RelativePosition(-7, 0))

  val moves: Set[RelativePositionRange] = Set(moveForward, moveRight, moveBack,
    moveLeft)

  // TODO: Write tests for this
  override def promote(pawn: Pawn): Promoted = new PromotedBishop(new Pawn {
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

abstract class Rook extends Piece with PromotionChoice {
  override val possibleMoves: Set[RelativePositionRange] = Rook.moves
  override val canJumpOver: Boolean = false
  override val captureSameAsMove: Boolean = true
  override def specialMoves: Set[SpecialMoveSpecification] = Set()
  val couldCastle: Boolean = true

}
