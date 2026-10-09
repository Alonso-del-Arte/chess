package game.pieces.darkgray

import game.moves.SpecialMoveSpecification

object PointyHatGuy extends game.pieces.PointyHatGuy with DarkGrayPiece {
  override def specialMoves: Set[SpecialMoveSpecification] = Set()
  
}
