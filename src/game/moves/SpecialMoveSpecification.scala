package game.moves

import game.BoardState
import game.pieces.Piece

trait SpecialMoveSpecification {

  def meetsPrerequisites(boardState: BoardState, piece: Piece,
                         secondPiece: Piece = null): Boolean

  def isCapture: Boolean

  def involvesPiecesOfSameSide: Boolean

  def execute(boardState: BoardState, piece: Piece,
              secondPiece: Piece = null): BoardState

}
