package game.pieces

import game.{Neutral, Player, RelativePosition, RelativePositionRange}

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class RookTest {

  @Test def testMoveForward(): Unit = {
    val expected = new RelativePositionRange(new RelativePosition(0, 1),
      new RelativePosition(0, 7))
    val actual = Rook.moveForward
    assertEquals(expected, actual)
  }

  @Test def testMoveRight(): Unit = {
    val expected = new RelativePositionRange(new RelativePosition(1, 0),
      new RelativePosition(7, 0))
    val actual = Rook.moveRight
    assertEquals(expected, actual)
  }

  @Test def testMoveBack(): Unit = {
    val expected = new RelativePositionRange(new RelativePosition(0, -1),
      new RelativePosition(0, -7))
    val actual = Rook.moveBack
    assertEquals(expected, actual)
  }

  @Test def testMoveLeft(): Unit = {
    val expected = new RelativePositionRange(new RelativePosition(-1, 0),
      new RelativePosition(-7, 0))
    val actual = Rook.moveLeft
    assertEquals(expected, actual)
  }

  @Test def testMoves(): Unit = {
    val expected = Set(Rook.moveForward, Rook.moveRight, Rook.moveBack,
      Rook.moveLeft)
    val actual = Rook.moves
    assertEquals(expected, actual)
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
    val rook = new RookImpl
    val expected = Set(forwards, right, backwards, left)
    val actual = rook.possibleMoves
    assertEquals(expected, actual)
  }

  @Test def testCanJumpOver(): Unit = {
    println("canJumpOver")
    val rook = new RookImpl
    assert(!rook.canJumpOver,
      "Rook shouldn't be able to jump over other pieces")
  }

  @Test def testCaptureSameAsMove(): Unit = {
    println("captureSameAsMove")
    val rook = new RookImpl
    assert(rook.captureSameAsMove, "A rook captures same as moves")
  }

  @Test def testPossibleCaptures(): Unit = {
    println("possibleCaptures")
    val rook = new RookImpl
    val expected = rook.possibleMoves
    val actual = rook.possibleCaptures
    assertEquals(expected, actual)
  }

  private class RookImpl extends Rook {
    override val affiliation: Player = Neutral

  }

}
