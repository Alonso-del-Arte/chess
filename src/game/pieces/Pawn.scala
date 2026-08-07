package game.pieces

/**
 * A pawn is the lowest ranking piece in chess. Pawns have two special moves,
 * the most obvious one being en passant. Less obvious, the ability to move
 * forward two spaces is a special move that gets taken for granted, since it
 * occurs in perhaps a majority of all chess games played. Promotion is special,
 * but in this project will probably not be implemented in the same way as
 * special moves like en passant and castling.
 */
abstract class Pawn extends Piece {
  override val captureSameAsMove: Boolean = false
  override val hasSpecialMoves: Boolean = true

}
