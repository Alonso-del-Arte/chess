package game.pieces

import game.{Black, Neutral, Player, RelativePositionRange, White}

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class TowerTest {

  @Test def testCanJumpOver(): Unit = {
    println("canJumpOver")
    val tower = new TowerImpl
    assert(!tower.canJumpOver,
      "Tower shouldn't be able to jump over other pieces")
  }

  @Test def testCaptureSameAsMove(): Unit = {
    println("captureSameAsMove")
    val tower = new TowerImpl
    assert(tower.captureSameAsMove, "A tower captures same as moves")
  }

  private class TowerImpl extends Tower {
    override val affiliation: Player = Neutral

  }

}
