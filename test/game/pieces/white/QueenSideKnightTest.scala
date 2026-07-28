package game.pieces.white

import game.{RegularPosition, RelativePosition, White}
import game.pieces.Knight

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class QueenSideKnightTest {

  @Test def testAffiliation(): Unit = {
    println("affiliation")
    val expected = White
    val actual = QueenSideKnight.affiliation
    assertEquals(expected, actual)
  }

  @Test def testPossibleMoves(): Unit = {
    println("possibleMoves")
    val expected = Knight.moves
    val actual = QueenSideKnight.possibleMoves
    assertEquals(expected, actual)
  }

  @Test def testCanJumpOver(): Unit = {
    println("canJumpOver")
    assert(QueenSideKnight.canJumpOver, "Knight should be able to jump over")
  }

  @Test def testCaptureSameAsMove(): Unit = {
    println("captureSameAsMove")
    assert(QueenSideKnight.captureSameAsMove, "Knight captures same as move")
  }

}
