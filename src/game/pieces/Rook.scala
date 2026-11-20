package game.pieces

import game.{RelativePosition, RelativePositionRange}

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

  override def promote(pawn: Pawn): Promoted = new PromotedRook(pawn)

}

import game.moves.SpecialMoveSpecification

abstract class Rook extends Piece with PromotionChoice {
  override val possibleMoves: Set[RelativePositionRange] = Rook.moves
  override val canJumpOver: Boolean = false
  override val captureSameAsMove: Boolean = true
  override def specialMoves: Set[SpecialMoveSpecification] = Set()
  val couldCastle: Boolean = true

}
