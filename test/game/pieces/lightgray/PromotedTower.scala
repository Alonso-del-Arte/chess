package game.pieces.lightgray

import game.{Neutral, Player, RelativePositionRange}
import game.pieces.{NeutralPawn, Pawn, Promoted, Tower}

class PromotedTower(val pawn: Pawn) extends Tower with LightGrayPiece
  with Promoted {
  // TODO: Write a test for this
  override val affiliation: Player = Neutral
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

