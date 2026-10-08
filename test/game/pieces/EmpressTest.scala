package game.pieces

import game.{Neutral, Player}

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class EmpressTest {

  @Test def testPossibleMoves(): Unit = {
    println("possibleMoves")
    val empress = new EmpressImpl
    val expected = Bishop.moves ++ Rook.moves
    val actual = empress.possibleMoves
    assertEquals(expected, actual)
  }

  @Test def testCanJumpOver(): Unit = {
    println("canJumpOver")
    val empress = new EmpressImpl
    assert(!empress.canJumpOver,
      "Empress shouldn't be able to jump over other pieces")
  }

  @Test def testCaptureSameAsMove(): Unit = {
    println("captureSameAsMove")
    val empress = new EmpressImpl
    assert(empress.captureSameAsMove, "An empress captures same as moves")
  }

  @Test def testPossibleCaptures(): Unit = {
    println("possibleCaptures")
    val empress = new EmpressImpl
    val expected = empress.possibleMoves
    val actual = empress.possibleCaptures
    assertEquals(expected, actual)
  }

  @Test def testHasSpecialMoves(): Unit = {
    println("hasSpecialMoves")
    val empress = new EmpressImpl
    assert(!empress.hasSpecialMoves, "Empress doesn't have special moves")
  }

  @Test def testSpecialMoves(): Unit = {
    println("specialMoves")
    val empress = new EmpressImpl
    val actual = empress.specialMoves
    assert(actual.isEmpty, "Empress's set of special moves should be empty")
  }

  private class EmpressImpl extends Empress {
    override val affiliation: Player = Neutral

  }

}
