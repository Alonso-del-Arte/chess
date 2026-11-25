package game.moves.pawns

import game.BoardState
import game.pieces.Piece

/**
 * Represents a Black pawn's ability to execute an en passant capture on an
 * opponent pawn (usually a White pawn) on the file to the right. Left and right
 * are reckoned from the player's perspective, which for Black means this move
 * is less likely for the queenside rook's pawn, as it would require that pawn
 * to get to b4 or c4.
 */
object BlackEnPassantRight extends EnPassant {

  // TODO: Write tests for this
  override def meetsPrerequisites(boardState: BoardState, piece: Piece, secondPiece: Piece): Boolean = false

  // TODO: Write tests for this
  override def execute(boardState: BoardState, piece: Piece, secondPiece: Piece): BoardState = boardState

}
