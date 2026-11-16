package game.moves.pawns

import game.BoardState
import game.pieces.Piece

/**
 * Represents en passant for White pawns.
 * @deprecated Use [[WhiteEnPassantLeft]] or [[WhiteEnPassantRight]] instead.
 */
@Deprecated(forRemoval = true)
object WhiteEnPassant extends EnPassant {

  // TODO: Write tests for this
  override def meetsPrerequisites(boardState: BoardState, piece: Piece,
                                  secondPiece: Piece): Boolean = true

  // TODO: Write tests for this
  override def execute(boardState: BoardState, piece: Piece,
                       secondPiece: Piece): BoardState = game.InitialBoardState

}
