package analysis.valuations

import analysis.Centipawns
import game.pieces.{Bishop, King, Knight, Pawn, Queen, Rook}

object FischerValuation extends ConstantCentipawnValuation(Map(classOf[Pawn] ->
  Centipawns(100), classOf[Rook] -> Centipawns(500), classOf[Knight] ->
  Centipawns(300), classOf[Bishop] -> Centipawns(325), classOf[Queen] ->
  Centipawns(900), classOf[King] -> Centipawns(0)))