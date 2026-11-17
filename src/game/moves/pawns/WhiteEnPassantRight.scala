package game.moves.pawns

import game.BoardState
import game.pieces.Piece

/**
 * Represents a White pawn's ability to execute an en passant capture on an
 * opponent pawn (usually a Black pawn) on the file to the right. Left and right
 * are reckoned from the player's perspective, which for White means this move
 * is less likely for the kingside rook's pawn, as it would require that pawn to
 * get to f5 or e5.
 */
object WhiteEnPassantRight extends EnPassant {

  override def isCapture: Boolean = true

  override def involvesPiecesOfSameSide: Boolean = false

  // TODO: Write tests for this
  override def meetsPrerequisites(boardState: BoardState, piece: Piece,
                                  secondPiece: Piece): Boolean = false

  // TODO: Write tests for this
  override def execute(boardState: BoardState, piece: Piece,
                       secondPiece: Piece): BoardState = boardState

}
