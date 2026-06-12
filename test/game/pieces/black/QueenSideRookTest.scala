package game.pieces.black

import game.{Black, RelativePosition, RelativePositionRange}
import game.pieces.Rook

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class QueenSideRookTest {

  @Test def testAffiliation(): Unit = {
    println("affiliation")
    assertEquals(Black, QueenSideRook.affiliation)
  }

  @Test def testPossibleMoves(): Unit = {
    println("possibleMoves")
    val expected = Rook.moves
    val actual = QueenSideRook.possibleMoves
    assertEquals(expected, actual)
  }

  @Test def testCanJumpOver(): Unit = {
    println("canJumpOver")
    val msg = "Rook shouldn't be able to jump over"
    assert(!QueenSideRook.canJumpOver, msg)
  }

  @Test def testCaptureSameAsMove(): Unit = {
    println("captureSameAsMove")
    val msg = "Rook should capture same as move"
    assert(QueenSideRook.captureSameAsMove, msg)
  }

  @Test def testPossibleCaptures(): Unit = {
    println("possibleCaptures")
    val expected = QueenSideRook.possibleMoves
    val actual = QueenSideRook.possibleCaptures
    assertEquals(expected, actual)
  }

}
