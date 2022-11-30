package game.pieces

import game.{Black, Neutral, Player, RelativePositionRange, White}

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class HorseTest {

  @Test def testCanJumpOver(): Unit = {
    println("canJumpOver")
    val horse = new HorseImpl
    assert(horse.canJumpOver, "Horse should be able to jump over other pieces")
  }

  @Test def testCaptureSameAsMove(): Unit = {
    println("captureSameAsMove")
    val horse = new HorseImpl
    assert(horse.captureSameAsMove, "A horse captures same as moves")
  }

  private class HorseImpl extends Horse {
    override val affiliation: Player = Neutral

  }

}
