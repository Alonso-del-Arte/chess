package game.pieces

import game.{Black, Neutral, Player, RelativePositionRange, White}

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class QueenTest {

  @Test def testCanJumpOver(): Unit = {
    println("canJumpOver")
    val queen = new QueenImpl
    assert(!queen.canJumpOver,
      "Queen shouldn't be able to jump over other pieces")
  }

  private class QueenImpl extends Queen {
    override val affiliation: Player = Neutral

  }

}
