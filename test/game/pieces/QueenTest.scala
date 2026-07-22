package game.pieces

import game.{Neutral, Player}

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class QueenTest {

  @Test def testPossibleMoves(): Unit = {
    println("possibleMoves")
    val queen = new QueenImpl
    val expected = Bishop.moves ++ Rook.moves
    val actual = queen.possibleMoves
    assertEquals(expected, actual)
  }

  @Test def testCanJumpOver(): Unit = {
    println("canJumpOver")
    val queen = new QueenImpl
    assert(!queen.canJumpOver,
      "Queen shouldn't be able to jump over other pieces")
  }

  @Test def testCaptureSameAsMove(): Unit = {
    println("captureSameAsMove")
    val queen = new QueenImpl
    assert(queen.captureSameAsMove, "A queen captures same as moves")
  }

  @Test def testPossibleCaptures(): Unit = {
    println("possibleCaptures")
    val queen = new QueenImpl
    val expected = queen.possibleMoves
    val actual = queen.possibleCaptures
    assertEquals(expected, actual)
  }

  @Test def testHasSpecialMoves(): Unit = {
    println("hasSpecialMoves")
    val queen = new QueenImpl
    assert(!queen.hasSpecialMoves, "A queen doesn't have special moves")
  }

  private class QueenImpl extends Queen {
    override val affiliation: Player = Neutral

  }

}
