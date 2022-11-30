package game.pieces

import game.{Black, Neutral, Player, RelativePositionRange, White}

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class PointyHatGuyTest {

  @Test def testCanJumpOver(): Unit = {
    println("canJumpOver")
    val pointyHatGuy = new PointyHatGuyImpl
    assert(!pointyHatGuy.canJumpOver,
      "Pointy hat guy shouldn't be able to jump over other pieces")
  }

  @Test def testCaptureSameAsMove(): Unit = {
    println("captureSameAsMove")
    val pointyHatGuy = new PointyHatGuyImpl
    assert(pointyHatGuy.captureSameAsMove,
      "A pointy hat guy captures same as moves")
  }

  private class PointyHatGuyImpl extends PointyHatGuy {
    override val affiliation: Player = Neutral

  }

}
