package game.moves

import game.BoardState
import game.pieces.Piece

object WhiteEnPassant extends EnPassant {

  // TODO: Write tests for this
  override def meetsPrerequisites(boardState: BoardState, piece: Piece,
                                  secondPiece: Piece): Boolean = true

  // TODO: Write tests for this
  override def execute(boardState: BoardState, piece: Piece,
                       secondPiece: Piece): BoardState = game.InitialBoardState

}
