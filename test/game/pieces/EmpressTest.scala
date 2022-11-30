package game.pieces

import game.{Black, Neutral, Player, RelativePositionRange, White}

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class EmpressTest {

  private class EmpressImpl extends Empress {
    override val affiliation: Player = Neutral

  }

}
