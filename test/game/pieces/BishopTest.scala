package game.pieces

import game.{Black, Neutral, Player, RelativePositionRange, White}

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class BishopTest {

  @Test def testCanJumpOver(): Unit = {
    println("canJumpOver")
    val bishop = new BishopImpl
    assert(!bishop.canJumpOver,
      "Bishop shouldn't be able to jump over other pieces")
  }

  private class BishopImpl extends Bishop {
    override val affiliation: Player = Neutral

  }

}
