package game.pieces.white

import game.White
import game.pieces.Knight

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class KingSideKnightTest {

  @Test def testAffiliation(): Unit = {
    println("affiliation")
    val expected = White
    val actual = KingSideKnight.affiliation
    assertEquals(expected, actual)
  }

  @Test def testPossibleMoves(): Unit = {
    println("possibleMoves")
    val expected = Knight.moves
    val actual = KingSideKnight.possibleMoves
    assertEquals(expected, actual)
  }

  @Test def testCanJumpOver(): Unit = {
    println("canJumpOver")
    assert(KingSideKnight.canJumpOver, "Knight should be able to jump over")
  }

}
