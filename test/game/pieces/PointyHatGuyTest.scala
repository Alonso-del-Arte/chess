package game.pieces

import game.{Black, Neutral, Player, RelativePositionRange, White}

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class PointyHatGuyTest {

  private class PointyHatGuyImpl extends PointyHatGuy {
    override val affiliation: Player = Neutral

  }

}
