package game.pieces.white

import game.{RelativePosition, RelativePositionRange, White}

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class QueenTest {

  @Test def testAffiliation(): Unit = {
    println("affiliation")
    assertEquals(White, Queen.affiliation)
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
    val toNortheast = new RelativePositionRange(new RelativePosition(1, -1),
      new RelativePosition(7, -7))
    val toNorthwest = new RelativePositionRange(new RelativePosition(1, 1),
      new RelativePosition(7, 7))
    val toSouthwest = new RelativePositionRange(new RelativePosition(-1, 1),
      new RelativePosition(-7, 7))
    val toSoutheast = new RelativePositionRange(new RelativePosition(-1, -1),
      new RelativePosition(-7, -7))
    val expected = Set(forwards, right, backwards, left, toNorthwest,
      toNortheast, toSouthwest, toSoutheast)
    val actual = Queen.possibleMoves
    assertEquals(expected, actual)
  }

  @Test def testCanJumpOver(): Unit = {
    println("canJumpOver")
    val msg = "Queen shouldn't be able to jump over"
    assert(!Queen.canJumpOver, msg)
  }

  @Test def testCaptureSameAsMove(): Unit = {
    println("captureSameAsMove")
    val msg = "Queen should capture same as move"
    assert(Queen.captureSameAsMove, msg)
  }

  @Test def testPossibleCaptures(): Unit = {
    println("possibleCaptures")
    val expected = Queen.possibleMoves
    val actual = Queen.possibleCaptures
    assertEquals(expected, actual)
  }

}
