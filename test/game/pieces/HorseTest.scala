package game.pieces

import game.{Black, Neutral, Player, RelativePositionRange, White}

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class HorseTest {

  private class HorseImpl extends Horse {
    override val affiliation: Player = Neutral

  }

}
