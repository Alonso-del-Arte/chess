package game.pieces

import game.{Neutral, Player}

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class KnightTest {

  @Test def testCanJumpOver(): Unit = {
    println("canJumpOver")
    val knight = new KnightImpl
    assert(knight.canJumpOver,
      "Knights should be able to jump over other pieces")
  }

  @Test def testCaptureSameAsMove(): Unit = {
    println("captureSameAsMove")
    val knight = new KnightImpl
    assert(knight.captureSameAsMove, "A knight captures same as moves")
  }

  private class KnightImpl extends Knight {
    override val affiliation: Player = Neutral
  }

}
