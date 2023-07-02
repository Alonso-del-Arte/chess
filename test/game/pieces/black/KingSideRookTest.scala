package game.pieces.black

import game.{Black, RelativePosition, RelativePositionRange}

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class KingSideRookTest {

  @Test def testAffiliation(): Unit = {
    println("affiliation")
    assertEquals(Black, KingSideRook.affiliation)
  }

  @Test def testPossibleMoves(): Unit = {
    println("possibleMoves")
    val forwards = new RelativePositionRange(new RelativePosition(0, 1),
      new RelativePosition(0, 7))
    val right = new RelativePositionRange(new RelativePosition(1, 0),
      new RelativePosition(7, 0))
    val backwards = new RelativePositionRange(new RelativePosition(0, -1),
      new RelativePosition(0, -7))
    val left = new RelativePositionRange(new RelativePosition(-1, 0),
      new RelativePosition(-7, 0))
    val expected = Set(forwards, right, backwards, left)
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
    val forwards = new RelativePositionRange(new RelativePosition(0, 1),
      new RelativePosition(0, 7))
    val right = new RelativePositionRange(new RelativePosition(1, 0),
      new RelativePosition(7, 0))
    val backwards = new RelativePositionRange(new RelativePosition(0, -1),
      new RelativePosition(0, -7))
    val left = new RelativePositionRange(new RelativePosition(-1, 0),
      new RelativePosition(-7, 0))
    val expected = Set(forwards, right, backwards, left)
    val actual = KingSideRook.possibleCaptures
    assertEquals(expected, actual)
  }

}
