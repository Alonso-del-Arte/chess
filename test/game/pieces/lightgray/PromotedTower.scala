package game.pieces.lightgray

import game.RelativePositionRange
import game.pieces.{NeutralPawn, Pawn, Promoted, Rook, Tower}

class PromotedTower(val pawn: Pawn) extends Tower with LightGrayPiece
  with Promoted {
  override val couldCastle: Boolean = false
  // TODO: Write a test for this
  override def prior: Pawn = NeutralPawn

}
