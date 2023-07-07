package game.pieces

import game.{Neutral, Player, RelativePosition, RelativePositionRange}

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class QueenTest {

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
    val queen = new QueenImpl
    val expected = Set(forwards, right, backwards, left, toNorthwest,
      toNortheast, toSouthwest, toSoutheast)
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

  private class QueenImpl extends Queen {
    override val affiliation: Player = Neutral

  }

}
