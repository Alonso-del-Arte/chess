package game.moves

import game.{BoardState, InitialBoardState}
import game.pieces.Piece

object WhitePawnInitialTwoForward extends PawnInitialTwoForward {

  override def meetsPrerequisites(boardState: BoardState, piece: Piece,
                                  secondPiece: Piece): Boolean = true

  override def isCapture: Boolean = true

  override def involvesPiecesOfSameSide: Boolean = true

  override def execute(boardState: BoardState, piece: Piece,
                       secondPiece: Piece): BoardState = InitialBoardState

}
