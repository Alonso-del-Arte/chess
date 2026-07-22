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

  @Test def testPossibleCaptures(): Unit = {
    println("possibleCaptures")
    val emperor = new EmperorImpl
    val expected = emperor.possibleMoves
    val actual = emperor.possibleCaptures
    assertEquals(expected, actual)
  }

  @Test def testHasSpecialMoves(): Unit = {
    println("hasSpecialMoves")
    val emperor = new EmperorImpl
    assert(emperor.hasSpecialMoves, "Emperor has special move of castling")
  }

  private class EmperorImpl extends Emperor {
    override val affiliation: Player = Neutral

  }

}
