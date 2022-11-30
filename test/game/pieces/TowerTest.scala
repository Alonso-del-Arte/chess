package game.pieces

import game.{Black, Neutral, Player, RelativePositionRange, White}

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class TowerTest {

  private class TowerImpl extends Tower {
    override val affiliation: Player = Neutral

  }

}
