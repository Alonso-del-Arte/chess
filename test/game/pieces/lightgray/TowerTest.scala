package game.pieces.lightgray

import game.LightGray
import game.pieces.Rook

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class TowerTest {

  @Test def testAffiliation(): Unit = {
    println("affiliation")
    assertEquals(LightGray, Tower.affiliation)
  }

  @Test def testPossibleMoves(): Unit = {
    println("possibleMoves")
    val expected = Rook.moves
    val actual = Tower.possibleMoves
    assertEquals(expected, actual)
  }

  @Test def testCanJumpOver(): Unit = {
    println("canJumpOver")
    val msg = "Tower shouldn't be able to jump over"
    assert(!Tower.canJumpOver, msg)
  }

  @Test def testCaptureSameAsMove(): Unit = {
    println("captureSameAsMove")
    val msg = "Tower should capture same as move"
    assert(Tower.captureSameAsMove, msg)
  }

}
