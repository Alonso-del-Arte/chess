package game.pieces.darkgray

import game.pieces.Rook
import game.{Player, RelativePositionRange}

object Tower extends game.pieces.Tower with DarkGrayPiece {
  override val couldCastle: Boolean = true

}
