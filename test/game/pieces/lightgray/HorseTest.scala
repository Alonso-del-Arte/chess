package game.pieces.lightgray

import game.LightGray
import game.pieces.Knight

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class HorseTest {

  @Test def testAffiliation(): Unit = {
    println("affiliation")
    val expected = LightGray
    val actual = Horse.affiliation
    assertEquals(expected, actual)
  }

  @Test def testPossibleMoves(): Unit = {
    println("possibleMoves")
    val expected = Knight.moves
    val actual = Horse.possibleMoves
    assertEquals(expected, actual)
  }

  @Test def testCanJumpOver(): Unit = {
    println("canJumpOver")
    assert(Horse.canJumpOver, "Horse should be able to jump over")
  }

}
