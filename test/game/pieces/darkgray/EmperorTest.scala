package game.pieces.darkgray

import game.{DarkGray, ShortMoveRanges}
import game.moves.Castling

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class EmperorTest {

  @Test def testAffiliation(): Unit = {
    println("affiliation")
    assertEquals(DarkGray, Emperor.affiliation)
  }

  @Test def testPossibleMoves(): Unit = {
    println("possibleMoves")
    val expected = Set(ShortMoveRanges.moveForward, ShortMoveRanges.moveRight,
      ShortMoveRanges.moveBack, ShortMoveRanges.moveLeft,
      ShortMoveRanges.moveNortheast, ShortMoveRanges.moveNorthwest,
      ShortMoveRanges.moveSouthwest, ShortMoveRanges.moveSoutheast)
    val actual = Emperor.possibleMoves
    assertEquals(expected, actual)
  }

  @Test def testCanJumpOver(): Unit = {
    println("canJumpOver")
    assert(!Emperor.canJumpOver, "Emperor shouldn't be able to jump over")
  }

  @Test def testSpecialMoves(): Unit = {
    println("specialMoves")
    val expected = Set(Castling)
    val actual = Emperor.specialMoves
    assertEquals(expected, actual)
  }

}
