package game.moves.pawns

import game.BoardState
import game.pieces.Piece

/**
 * Represents a White pawn's ability to execute an en passant capture on an
 * opponent pawn (usually a Black pawn) on the file to the left. Left and right
 * are reckoned from the player's perspective, which for White means this move
 * is less likely for the queenside rook's pawn, as it would require that pawn
 * to get to b5 or c5.
 */
object WhiteEnPassantLeft extends EnPassant {

  // TODO: Write tests for this
  override def meetsPrerequisites(boardState: BoardState, piece: Piece,
                                  secondPiece: Piece): Boolean = false

  // TODO: Write tests for this
  override def execute(boardState: BoardState, piece: Piece,
                       secondPiece: Piece): BoardState = boardState

}
