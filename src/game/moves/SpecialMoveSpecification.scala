package game.moves

import game.BoardState
import game.pieces.Piece

object SpecialMoveSpecification {

  def validate(spec: SpecialMoveSpecification, boardState: BoardState,
               piece: Piece, secondPiece: Piece): Unit = {
    // TODO: Write tests for this. The idea here is that the trait's execute()
    //  function will call this procedure to ensure the board state meets the
    //  special move prerequisites and throw an exception if it doesn't
  }

}

trait SpecialMoveSpecification {

  def meetsPrerequisites(boardState: BoardState, piece: Piece,
                         secondPiece: Piece = null): Boolean

  def isCapture: Boolean

  def involvesPiecesOfSameSide: Boolean

  def execute(boardState: BoardState, piece: Piece,
              secondPiece: Piece = null): BoardState

}
