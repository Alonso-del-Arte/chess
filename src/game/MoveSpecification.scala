package game

import game.pieces.Piece

object MoveSpecification {

  def tempFiller(state: BoardState): Boolean = true

}

class MoveSpecification(val piece: Piece, val start: Position,
                        val destination: Position,
                        val meetsPrerequisites: Option[BoardState => Boolean]
                        = Option(MoveSpecification.tempFiller))
