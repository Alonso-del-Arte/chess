package game.moves

import game.BoardState

trait SpecialMoveSpecification {

  def meetsPrerequisites(boardState: BoardState): Boolean

  def isCapture: Boolean

  def involvesPiecesOfSameSide: Boolean

  def execute(boardState: BoardState): BoardState

}
