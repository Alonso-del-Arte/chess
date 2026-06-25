package game.pieces.lightgray

import game.RelativePositionRange
import game.pieces.Rook

object Tower extends game.pieces.Tower with LightGrayPiece {
  override val possibleCaptures: Set[RelativePositionRange] = Rook.moves
  // TODO: Write a test for this
  override val hasSpecialMoves: Boolean = true
  // TODO: Write a test for this
  override val couldCastle: Boolean = false

}
