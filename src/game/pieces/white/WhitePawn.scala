package game.pieces.white

import game.{RelativePosition, RelativePositionRange, ShortMoveRanges}
import game.moves.{SpecialMoveSpecification, WhiteEnPassant,
  WhitePawnInitialTwoForward}
import game.pieces.Pawn

/**
 * A White pawn starts out on file 2, and may initially move to either file 3 or
 * file 4. After that, a pawn may only move to the next higher numbered file,
 * whether straight ahead in a non-capturing move or diagonally in a capture.
 * There is also the special move en passant, the only time a capturing piece is
 * allowed to end up on a square other than where the captured piece was (see
 * the game rules for full details). Upon reaching file 8, a White pawn must be
 * promoted, usually to a queen, though under certain circumstances promotion to
 * a knight, bishop or rook might be preferable.
 */
// TODO: Work out how to represent promotions
abstract class WhitePawn extends Pawn with WhitePiece {
  override val possibleMoves: Set[RelativePositionRange]
    = Set(ShortMoveRanges.moveForward)
  override val possibleCaptures: Set[RelativePositionRange]
    = Set(RelativePositionRange(new RelativePosition(-1, 1)),
      RelativePositionRange(new RelativePosition(1, 1)))
  override val hasSpecialMoves: Boolean = true
  override def specialMoves: Set[SpecialMoveSpecification] =
    Set(WhiteEnPassant, WhitePawnInitialTwoForward)

}
