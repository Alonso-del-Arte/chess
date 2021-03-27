package analysis.valuations

import analysis.Centipawns
import game.pieces.Piece

abstract class CentipawnValuation(val initialValues: Map[Class[_ <: Piece], Centipawns]) {

  def valueOf(piece: Piece): Centipawns

}
