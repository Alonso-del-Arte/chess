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

  private class RookImpl extends Rook {
    override val affiliation: Player = Neutral

  }

}
