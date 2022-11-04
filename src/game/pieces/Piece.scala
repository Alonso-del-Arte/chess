package game.pieces

import game.{Player, RelativePositionRange}

abstract class Piece {
  val affiliation: Player
  val possibleMoves: Set[RelativePositionRange]
  val canJumpOver: Boolean = false
  val captureSameAsMove: Boolean = false
  val possibleCaptures: Set[RelativePositionRange] = Set()

}
