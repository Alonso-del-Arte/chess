package game.pieces.white

import game.{RelativePosition, RelativePositionRange, White}

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class KingSideBishopTest {

  @Test def testAffiliation(): Unit = {
    println("affiliation")
    assertEquals(White, KingSideBishop.affiliation)
  }

  @Test def testPossibleMoves(): Unit = {
    println("possibleMoves")
    val toNortheast = new RelativePositionRange(new RelativePosition(1, -1),
      new RelativePosition(7, -7))
    val toNorthwest = new RelativePositionRange(new RelativePosition(1, 1),
      new RelativePosition(7, 7))
    val toSouthwest = new RelativePositionRange(new RelativePosition(-1, 1),
      new RelativePosition(-7, 7))
    val toSoutheast = new RelativePositionRange(new RelativePosition(-1, -1),
      new RelativePosition(-7, -7))
    val expected = Set(toNorthwest, toNortheast, toSouthwest, toSoutheast)
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
    val toNortheast = new RelativePositionRange(new RelativePosition(1, -1),
      new RelativePosition(7, -7))
    val toNorthwest = new RelativePositionRange(new RelativePosition(1, 1),
      new RelativePosition(7, 7))
    val toSouthwest = new RelativePositionRange(new RelativePosition(-1, 1),
      new RelativePosition(-7, 7))
    val toSoutheast = new RelativePositionRange(new RelativePosition(-1, -1),
      new RelativePosition(-7, -7))
    val expected = Set(toNorthwest, toNortheast, toSouthwest, toSoutheast)
    val actual = KingSideBishop.possibleCaptures
    assertEquals(expected, actual)
  }

}
