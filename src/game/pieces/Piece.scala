package game.pieces

import game.{Player, RelativePositionRange}

/**
 * Represents a chess piece.
 */
abstract class Piece {

  /**
   * The piece's affiliation. For regular chess, this will be either [[White]]
   * or [[Black]].
   */
  val affiliation: Player

  /**
   * The moves this piece may make.
   */
  val possibleMoves: Set[RelativePositionRange]

  /**
   * Whether this piece can jump over other pieces. For regular chess, this will
   * only be true for [[Knight]], false for all other pieces.
   */
  val canJumpOver: Boolean = false

  /**
   * Whether this piece captures the same as the piece moves. For regular chess,
   * this is true for all pieces except [[Pawn]].
   */
  val captureSameAsMove: Boolean = true

  /**
   * Whether this piece has special moves subject to certain conditions. For
   * regular chess, this is true only for [[King]] in regard to castling and
   * [[Pawn]] in regard to en passant.
   */
  val hasSpecialMoves: Boolean = false

  /**
   * The captures this piece may make. In most cases will be the same as
   * [[possibleMoves]].
   * @return The possible captures.
   */
  def possibleCaptures: Set[RelativePositionRange] =
    if (this.captureSameAsMove) this.possibleMoves else Set()

}
