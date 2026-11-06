package game.pieces.lightgray

import game.moves.{LightGrayCastling, SpecialMoveSpecification}

object Emperor extends game.pieces.Emperor with LightGrayPiece {
  override val specialMoves: Set[SpecialMoveSpecification] =
    Set(LightGrayCastling)

}
