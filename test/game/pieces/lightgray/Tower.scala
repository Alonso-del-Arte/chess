package game.pieces.lightgray

object Tower extends game.pieces.Tower with LightGrayPiece {
  override val hasSpecialMoves: Boolean = false
  // TODO: Write a test for this
  override val couldCastle: Boolean = false

}
