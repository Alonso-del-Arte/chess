package game.pieces

import game.{Neutral, Player, RelativePosition, RelativePositionRange}
import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class KingTest {

  @Test def testPossibleMoves(): Unit = {
    println("possibleMoves")
    val forwards = new RelativePositionRange(new RelativePosition(0, 1),
      new RelativePosition(0, 1))
    val right = new RelativePositionRange(new RelativePosition(1, 0),
      new RelativePosition(1, 0))
    val backwards = new RelativePositionRange(new RelativePosition(0, -1),
      new RelativePosition(0, -1))
    val left = new RelativePositionRange(new RelativePosition(-1, 0),
      new RelativePosition(-1, 0))
    val toNortheast = new RelativePositionRange(new RelativePosition(1, -1),
      new RelativePosition(1, -1))
    val toNorthwest = new RelativePositionRange(new RelativePosition(1, 1),
      new RelativePosition(1, 1))
    val toSouthwest = new RelativePositionRange(new RelativePosition(-1, 1),
      new RelativePosition(-1, 1))
    val toSoutheast = new RelativePositionRange(new RelativePosition(-1, -1),
      new RelativePosition(-1, -1))
    val king = new KingImpl
    val expected = Set(forwards, right, backwards, left, toNorthwest,
      toNortheast, toSouthwest, toSoutheast)
    val actual = king.possibleMoves
    assertEquals(expected, actual)
  }

  @Test def testCanJumpOver(): Unit = {
    println("canJumpOver")
    val king = new KingImpl
    assert(!king.canJumpOver,
      "King shouldn't be able to jump over other pieces")
  }

  @Test def testCaptureSameAsMove(): Unit = {
    println("captureSameAsMove")
    val king = new KingImpl
    assert(king.captureSameAsMove, "A king captures same as moves")
  }

  @Test def testPossibleCaptures(): Unit = {
    println("possibleCaptures")
    val king = new KingImpl
    val expected = king.possibleMoves
    val actual = king.possibleCaptures
    assertEquals(expected, actual)
  }

  private class KingImpl extends King {
    override val affiliation: Player = Neutral

  }

}
