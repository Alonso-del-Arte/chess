package game.pieces.darkgray

import game.moves.{DarkGrayCastling, SpecialMoveSpecification}

object Emperor extends game.pieces.Emperor with DarkGrayPiece {
  override val specialMoves: Set[SpecialMoveSpecification] =
    Set(DarkGrayCastling)

}
