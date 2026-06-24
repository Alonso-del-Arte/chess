package game.pieces.darkgray

import game.pieces.Rook
import game.{Player, RelativePositionRange}

object Tower extends game.pieces.Tower with DarkGrayPiece {
  override val possibleCaptures: Set[RelativePositionRange] = Rook.moves
  // TODO: Write a test for this
  override val hasSpecialMoves: Boolean = true
  // TODO: Write a test for this
  override val couldCastle: Boolean = false

}
