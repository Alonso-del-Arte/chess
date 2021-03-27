package analysis.valuations

import analysis.Centipawns
import game.pieces.Piece

abstract class FluctuatingCentipawnValuation(initialValues: Map[Class[_ <: Piece],
  Centipawns]) extends CentipawnValuation(initialValues) {

}
