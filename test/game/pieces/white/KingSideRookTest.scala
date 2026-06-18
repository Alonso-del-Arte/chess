package game.pieces.white

import game.{RelativePosition, RelativePositionRange, White}
import game.pieces.Rook

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions._

class KingSideRookTest {

  @Test def testAffiliation(): Unit = {
    println("affiliation")
    assertEquals(White, KingSideRook.affiliation)
  }

  @Test def testPossibleMoves(): Unit = {
    println("possibleMoves")
    val expected = Rook.moves
    val actual = KingSideRook.possibleMoves
    assertEquals(expected, actual)
  }

  @Test def testCanJumpOver(): Unit = {
    println("canJumpOver")
    val msg = "Rook shouldn't be able to jump over"
    assert(!KingSideRook.canJumpOver, msg)
  }

  @Test def testCaptureSameAsMove(): Unit = {
    println("captureSameAsMove")
    val msg = "Rook should capture same as move"
    assert(KingSideRook.captureSameAsMove, msg)
  }

  @Test def testPossibleCaptures(): Unit = {
    println("possibleCaptures")
    val expected = KingSideRook.possibleMoves
    val actual = KingSideRook.possibleCaptures
    assertEquals(expected, actual)
  }

  @Test def testHasSpecialMoves(): Unit = {
    println("hasSpecialMoves")
    val msg = "Rook can't initiate special move of castling"
    assert(!KingSideRook.hasSpecialMoves, msg)
  }

}
