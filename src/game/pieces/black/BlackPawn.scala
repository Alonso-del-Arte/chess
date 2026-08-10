package game.pieces.black

import game.{Black, Player, RelativePosition, RelativePositionRange}
import game.pieces.Pawn

/**
 * A Black pawn starts out on file 7, and may initially move to either file 6 or
 * file 5. After that, a pawn may only move to the next lower numbered file,
 * whether straight ahead in a non-capturing move or diagonally in a capture.
 * There is also the special move en passant, the only time a capturing piece is
 * allowed to end up on a square other than where the captured piece was (see
 * the game rules for full details). Upon reaching file 1, a Black pawn must be
 * promoted, usually to a queen, though under certain circumstances promotion to
 * a knight, bishop or rook might be preferable.
 */
// TODO: Figure out how to represent en passant
// TODO: Refactor initial two spaces forward as a special move
// TODO: Work out how to represent promotions
abstract class BlackPawn extends Pawn with BlackPiece {
  override val possibleMoves: Set[RelativePositionRange]
    = Set(new RelativePositionRange(new RelativePosition(0, -1),
      new RelativePosition(0, -2)))
  override val possibleCaptures: Set[RelativePositionRange]
    = Set(RelativePositionRange(new RelativePosition(-1, -1)),
      RelativePositionRange(new RelativePosition(1, -1)))
  override val hasSpecialMoves: Boolean = true

}
