package game.pieces.darkgray

import game.RelativePositionRange
import game.pieces.{NeutralPawn, Pawn, Promoted, Tower}

class PromotedTower(val pawn: Pawn) extends Tower with DarkGrayPiece
  with Promoted {
  // TODO: Write a test for this
  override val canJumpOver: Boolean = true
  // TODO: Write a test for this
  override val captureSameAsMove: Boolean = false
  // TODO: Write a test for this
  override val possibleCaptures: Set[RelativePositionRange] = Set()
  // TODO: Write a test for this
  override val couldCastle: Boolean = true
  // TODO: Write a test for this
  override def prior: Pawn = NeutralPawn

}
