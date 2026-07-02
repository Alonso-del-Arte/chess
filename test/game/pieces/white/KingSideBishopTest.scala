package game.pieces.white

import game.White
import game.pieces.Bishop

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class KingSideBishopTest {

  @Test def testAffiliation(): Unit = {
    println("affiliation")
    assertEquals(White, KingSideBishop.affiliation)
  }

  @Test def testPossibleMoves(): Unit = {
    println("possibleMoves")
    val expected = Bishop.moves
    val actual = KingSideBishop.possibleMoves
    assertEquals(expected, actual)
  }

  @Test def testCanJumpOver(): Unit = {
    println("canJumpOver")
    val msg = "Bishop shouldn't be able to jump over"
    assert(!KingSideBishop.canJumpOver, msg)
  }

  @Test def testCaptureSameAsMove(): Unit = {
    println("captureSameAsMove")
    val msg = "Bishop should capture same as move"
    assert(KingSideBishop.captureSameAsMove, msg)
  }

  @Test def testPossibleCaptures(): Unit = {
    println("possibleCaptures")
    val expected = KingSideBishop.possibleMoves
    val actual = KingSideBishop.possibleCaptures
    assertEquals(expected, actual)
  }

  @Test def testHasSpecialMoves(): Unit = {
    println("hasSpecialMoves")
    assert(!KingSideBishop.hasSpecialMoves,
      "Bishop should have no special moves")
  }

}
