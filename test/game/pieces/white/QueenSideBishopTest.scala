package game.pieces.white

import game.White
import game.pieces.Bishop

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class QueenSideBishopTest {

  @Test def testAffiliation(): Unit = {
    println("affiliation")
    assertEquals(White, QueenSideBishop.affiliation)
  }

  @Test def testPossibleMoves(): Unit = {
    println("possibleMoves")
    val expected = Bishop.moves
    val actual = QueenSideBishop.possibleMoves
    assertEquals(expected, actual)
  }

  @Test def testCanJumpOver(): Unit = {
    println("canJumpOver")
    val msg = "Bishop shouldn't be able to jump over"
    assert(!QueenSideBishop.canJumpOver, msg)
  }

  @Test def testCaptureSameAsMove(): Unit = {
    println("captureSameAsMove")
    val msg = "Bishop should capture same as move"
    assert(QueenSideBishop.captureSameAsMove, msg)
  }

  @Test def testPossibleCaptures(): Unit = {
    println("possibleCaptures")
    val expected = QueenSideBishop.possibleMoves
    val actual = QueenSideBishop.possibleCaptures
    assertEquals(expected, actual)
  }

}
