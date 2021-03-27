package analysis.valuations

import analysis.Centipawns
import game.pieces.Piece

abstract class ConstantCentipawnValuation(initialValues: Map[Class[_ <: Piece],
  Centipawns]) extends CentipawnValuation(initialValues) {

  // STUB TO FAIL THE FIRST TEST
  override def valueOf(piece: Piece): Centipawns = Centipawns(-1)

}
