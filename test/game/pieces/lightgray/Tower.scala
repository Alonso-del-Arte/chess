package game.pieces.lightgray

object Tower extends game.pieces.Tower with LightGrayPiece {
  override val couldCastle: Boolean = true

}
