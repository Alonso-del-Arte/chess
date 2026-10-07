package game.pieces.darkgray

import game.{DarkGray, Player, RelativePositionRange}
import game.moves.SpecialMoveSpecification
import game.pieces.{Bishop, Rook}

object Empress extends game.pieces.Empress with DarkGrayPiece {
  override val affiliation: Player = DarkGray
  override val possibleMoves: Set[RelativePositionRange] =
    Bishop.moves ++ Rook.moves
  override val canJumpOver: Boolean = false
  override val captureSameAsMove: Boolean = true
  override val possibleCaptures: Set[RelativePositionRange] =
    Bishop.moves ++ Rook.moves
  override val hasSpecialMoves: Boolean = false
  override def specialMoves: Set[SpecialMoveSpecification] = Set()

}
