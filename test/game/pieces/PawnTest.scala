package game.pieces

import game.{Neutral, Player}

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class PawnTest {

  private class PawnImpl extends Pawn {
    override val affiliation: Player = Neutral

  }

}
