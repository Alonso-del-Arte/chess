package game.pieces.lightgray

import game.LightGray
import game.pieces.{Bishop, Rook}

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class EmpressTest {

  @Test def testAffiliation(): Unit = {
    println("affiliation")
    assertEquals(LightGray, Empress.affiliation)
  }

  @Test def testPossibleMoves(): Unit = {
    println("possibleMoves")
    val expected = Bishop.moves ++ Rook.moves
    val actual = Empress.possibleMoves
    assertEquals(expected, actual)
  }

  @Test def testCanJumpOver(): Unit = {
    println("canJumpOver")
    assert(!Empress.canJumpOver, "Empress shouldn't be able to jump over")
  }

}
