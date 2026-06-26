package game.pieces.darkgray

import game.{DarkGray, Player, RelativePositionRange}
import game.pieces.{NeutralPawn, Pawn, Promoted, Tower}

class PromotedTower(val pawn: Pawn) extends Tower with DarkGrayPiece
  with Promoted {
  override val affiliation: Player = DarkGray
  // TODO: Write a test for this
  override val possibleMoves: Set[RelativePositionRange] = Set()
  // TODO: Write a test for this
  override val canJumpOver: Boolean = false
  // TODO: Write a test for this
  override val captureSameAsMove: Boolean = true
  // TODO: Write a test for this
  override val possibleCaptures: Set[RelativePositionRange] = Set()
  // TODO: Write a test for this
  override val couldCastle: Boolean = true
  // TODO: Write a test for this
  override def prior: Pawn = NeutralPawn

}
