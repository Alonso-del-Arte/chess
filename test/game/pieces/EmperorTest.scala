package game.pieces

import game.{Black, Neutral, Player, RelativePositionRange, ShortMoveRanges,
  White}

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class EmperorTest {

  @Test def testPossibleMoves(): Unit = {
    println("possibleMoves")
    val emperor = new EmperorImpl
    val expected = Set(ShortMoveRanges.moveForward, ShortMoveRanges.moveRight,
      ShortMoveRanges.moveBack, ShortMoveRanges.moveLeft,
      ShortMoveRanges.moveNortheast, ShortMoveRanges.moveNorthwest,
      ShortMoveRanges.moveSouthwest, ShortMoveRanges.moveSoutheast)
    val actual = emperor.possibleMoves
    assertEquals(expected, actual)
  }

  @Test def testCanJumpOver(): Unit = {
    println("canJumpOver")
    val emperor = new EmperorImpl
    assert(!emperor.canJumpOver,
      "Emperor shouldn't be able to jump over other pieces")
  }

  @Test def testCaptureSameAsMove(): Unit = {
    println("captureSameAsMove")
    val emperor = new EmperorImpl
    assert(emperor.captureSameAsMove, "An emperor captures same as moves")
  }

  private class EmperorImpl extends Emperor {
    override val affiliation: Player = Neutral

  }

}
