package game.pieces

import game.{Black, Neutral, Player, RelativePositionRange, White}

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class KingTest {

  @Test def testCanJumpOver(): Unit = {
    println("canJumpOver")
    val king = new KingImpl
    assert(!king.canJumpOver,
      "King shouldn't be able to jump over other pieces")
  }

  @Test def testCaptureSameAsMove(): Unit = {
    println("captureSameAsMove")
    val king = new KingImpl
    assert(king.captureSameAsMove, "A king captures same as moves")
  }

  private class KingImpl extends King {
    override val affiliation: Player = Neutral

  }

}
