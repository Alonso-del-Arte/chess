package game.moves.pawns

import game.BoardState
import game.pieces.Piece

/**
 * Represents en passant for Black pawns.
 * @deprecated Use [[BlackEnPassantLeft]] or [[BlackEnPassantRight]] instead.
 */
@Deprecated(forRemoval = true)
object BlackEnPassant extends EnPassant {

  // TODO: Write tests for this
  override def meetsPrerequisites(boardState: BoardState, piece: Piece,
                                  secondPiece: Piece): Boolean = true

  // TODO: Write tests for this
  override def execute(boardState: BoardState, piece: Piece,
                       secondPiece: Piece): BoardState = game.InitialBoardState


}
