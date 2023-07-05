package game.pieces

import game.{Neutral, Player, RelativePosition, RelativePositionRange}

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class BishopTest {

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
    val bishop = new BishopImpl
    val expected = Set(toNorthwest, toNortheast, toSouthwest, toSoutheast)
    val actual = bishop.possibleMoves
    assertEquals(expected, actual)
  }

  @Test def testCanJumpOver(): Unit = {
    println("canJumpOver")
    val bishop = new BishopImpl
    assert(!bishop.canJumpOver,
      "Bishop shouldn't be able to jump over other pieces")
  }

  @Test def testCaptureSameAsMove(): Unit = {
    println("captureSameAsMove")
    val bishop = new BishopImpl
    assert(bishop.captureSameAsMove, "A bishop captures same as moves")
  }

  @Test def testPossibleCaptures(): Unit = {
    println("possibleCaptures")
    val bishop = new BishopImpl
    val expected = bishop.possibleMoves
    val actual = bishop.possibleCaptures
    assertEquals(expected, actual)
  }

  private class BishopImpl extends Bishop {
    override val affiliation: Player = Neutral

  }

}
