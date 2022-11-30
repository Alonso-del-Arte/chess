package game.pieces

import game.{Black, Neutral, Player, RelativePositionRange, White}

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class EmperorTest {

  private class EmperorImpl extends Emperor {
    override val affiliation: Player = Neutral

  }

}
