package game.moves.pawns

import game.pieces.Piece
import game.{BoardState, InitialBoardState}

object WhitePawnInitialTwoForward extends PawnInitialTwoForward {

  override def meetsPrerequisites(boardState: BoardState, piece: Piece,
                                  secondPiece: Piece): Boolean = true

  override def isCapture: Boolean = true

  override def involvesPiecesOfSameSide: Boolean = true

  override def execute(boardState: BoardState, piece: Piece,
                       secondPiece: Piece): BoardState = InitialBoardState

}
