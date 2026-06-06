package game.pieces.white

import game.{ShortMoveRanges, White}

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class KingTest {

  @Test def testAffiliation(): Unit = {
    println("affiliation")
    val expected = White
    val actual = King.affiliation
    assertEquals(expected, actual)
  }

  @Test def testPossibleMoves(): Unit = {
    println("possibleMoves")
    val expected = Set(ShortMoveRanges.moveForward, ShortMoveRanges.moveRight,
      ShortMoveRanges.moveBack, ShortMoveRanges.moveLeft,
      ShortMoveRanges.moveNortheast, ShortMoveRanges.moveNorthwest,
      ShortMoveRanges.moveSouthwest, ShortMoveRanges.moveSoutheast)
    val actual = King.possibleMoves
    assertEquals(expected, actual)
  }

  @Test def testCanJumpOver(): Unit = {
    println("canJumpOver")
    assert(!King.canJumpOver, "King shouldn't be able to jump over")
  }

  @Test def testCaptureSameAsMove(): Unit = {
    println("captureSameAsMove")
    assert(King.captureSameAsMove, "King should capture same as he moves")
  }

  @Test def testPossibleCaptures(): Unit = {
    println("possibleCaptures")
    val expected = King.possibleMoves
    val actual = King.possibleCaptures
    assertEquals(expected, actual)
  }

  @Test def testHasSpecialMoves(): Unit = {
    println("hasSpecialMoves")
    assert(King.hasSpecialMoves, "King has special moves, castling")
  }

}
