package game.pieces.darkgray

import game.{DarkGray, Player}
import game.pieces.{Bishop, Rook}

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class EmpressTest {

  @Test def testAffiliation(): Unit = {
    println("affiliation")
    assertEquals(DarkGray, Empress.affiliation)
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

  @Test def testCaptureSameAsMove(): Unit = {
    println("captureSameAsMove")
    assert(Empress.captureSameAsMove, "Empress should capture as she moves")
  }

  @Test def testPossibleCaptures(): Unit = {
    println("possibleCaptures")
    val expected = Empress.possibleMoves
    val actual = Empress.possibleCaptures
    assertEquals(expected, actual)
  }

}
