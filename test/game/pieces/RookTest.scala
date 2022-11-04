package game.pieces

import game.{Black, Neutral, Player, RelativePositionRange, White}

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class RookTest {

  @Test def testCanJumpOver(): Unit = {
    println("canJumpOver")
    val rook = new RookImpl
    assert(!rook.canJumpOver,
      "Rook shouldn't be able to jump over other pieces")
  }

  @Test def testCaptureSameAsMove(): Unit = {
    println("captureSameAsMove")
    val rook = new RookImpl
    assert(rook.captureSameAsMove, "A rook captures same as moves")
  }

  private class RookImpl extends Rook {
    override val affiliation: Player = Neutral

  }

}
