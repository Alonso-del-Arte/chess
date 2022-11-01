package game.pieces

import game.{Neutral, Player}

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class KnightTest {

  private class KnightImpl extends Knight {
    override val affiliation: Player = Neutral
  }

}
