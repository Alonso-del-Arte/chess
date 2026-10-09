package game.pieces.lightgray

import game.moves.SpecialMoveSpecification

object PointyHatGuy extends game.pieces.PointyHatGuy with LightGrayPiece {
  override def specialMoves: Set[SpecialMoveSpecification] = Set()
  
}
