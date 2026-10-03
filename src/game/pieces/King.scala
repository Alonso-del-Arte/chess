package game.pieces

import game.{RelativePositionRange, ShortMoveRanges}
import game.moves.{Castling, SpecialMoveSpecification}

abstract class King extends Piece {
  override val possibleMoves: Set[RelativePositionRange] =
    Set(ShortMoveRanges.moveForward, ShortMoveRanges.moveRight,
      ShortMoveRanges.moveBack, ShortMoveRanges.moveLeft,
      ShortMoveRanges.moveNortheast, ShortMoveRanges.moveNorthwest,
      ShortMoveRanges.moveSouthwest, ShortMoveRanges.moveSoutheast)
  override val captureSameAsMove: Boolean = true
  override val hasSpecialMoves: Boolean = true
  override def specialMoves: Set[SpecialMoveSpecification] = Set(Castling)

}
