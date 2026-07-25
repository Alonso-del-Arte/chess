package game.pieces

import game.{Neutral, Player, RegularPosition, RelativePosition}

object KnightTest {

  val centerSquares: Set[RegularPosition] =
    Set(RegularPosition("d4"), RegularPosition("e4"), RegularPosition("d5"),
      RegularPosition("e5"))

}

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class KnightTest {

  @Test def testMoveOneOClock(): Unit = {
    val offset = new RelativePosition(1, 2)
    for (start <- KnightTest.centerSquares) {
      val expected = start.translate(offset)
      val actualA = start.translate(Knight.moveOneOClock.start)
      val actualB = start.translate(Knight.moveOneOClock.finish)
      val message = s"Knight on $start to 1 o'clock should end up on $expected"
      assertEquals(expected, actualA, message)
      assertEquals(expected, actualB, message)
    }
  }

  @Test def testMoveTwoOClock(): Unit = {
    val offset = new RelativePosition(2, 1)
    for (start <- KnightTest.centerSquares) {
      val expected = start.translate(offset)
      val actualA = start.translate(Knight.moveTwoOClock.start)
      val actualB = start.translate(Knight.moveTwoOClock.finish)
      val message = s"Knight on $start to 2 o'clock should end up on $expected"
      assertEquals(expected, actualA, message)
      assertEquals(expected, actualB, message)
    }
  }

  @Test def testMoveFourOClock(): Unit = {
    val offset = new RelativePosition(2, -1)
    for (start <- KnightTest.centerSquares) {
      val expected = start.translate(offset)
      val actualA = start.translate(Knight.moveFourOClock.start)
      val actualB = start.translate(Knight.moveFourOClock.finish)
      val message = s"Knight on $start to 4 o'clock should end up on $expected"
      assertEquals(expected, actualA, message)
      assertEquals(expected, actualB, message)
    }
  }

  @Test def testMoveFiveOClock(): Unit = {
    val offset = new RelativePosition(1, -2)
    for (start <- KnightTest.centerSquares) {
      val expected = start.translate(offset)
      val actualA = start.translate(Knight.moveFiveOClock.start)
      val actualB = start.translate(Knight.moveFiveOClock.finish)
      val message = s"Knight on $start to 5 o'clock should end up on $expected"
      assertEquals(expected, actualA, message)
      assertEquals(expected, actualB, message)
    }
  }

  @Test def testMoveSevenOClock(): Unit = {
    val offset = new RelativePosition(-1, -2)
    for (start <- KnightTest.centerSquares) {
      val expected = start.translate(offset)
      val actualA = start.translate(Knight.moveSevenOClock.start)
      val actualB = start.translate(Knight.moveSevenOClock.finish)
      val message = s"Knight on $start to 7 o'clock should end up on $expected"
      assertEquals(expected, actualA, message)
      assertEquals(expected, actualB, message)
    }
  }

  @Test def testMoveEightOClock(): Unit = {
    val offset = new RelativePosition(-2, -1)
    for (start <- KnightTest.centerSquares) {
      val expected = start.translate(offset)
      val actualA = start.translate(Knight.moveEightOClock.start)
      val actualB = start.translate(Knight.moveEightOClock.finish)
      val message = s"Knight on $start to 8 o'clock should end up on $expected"
      assertEquals(expected, actualA, message)
      assertEquals(expected, actualB, message)
    }
  }

  @Test def testMoveTenOClock(): Unit = {
    val offset = new RelativePosition(-2, 1)
    for (start <- KnightTest.centerSquares) {
      val expected = start.translate(offset)
      val actualA = start.translate(Knight.moveTenOClock.start)
      val actualB = start.translate(Knight.moveTenOClock.finish)
      val message = s"Knight on $start to 10 o'clock should end up on $expected"
      assertEquals(expected, actualA, message)
      assertEquals(expected, actualB, message)
    }
  }

  @Test def testMoveElevenOClock(): Unit = {
    val offset = new RelativePosition(-1, 2)
    for (start <- KnightTest.centerSquares) {
      val expected = start.translate(offset)
      val actualA = start.translate(Knight.moveElevenOClock.start)
      val actualB = start.translate(Knight.moveElevenOClock.finish)
      val message = s"Knight on $start to 11 o'clock should end up on $expected"
      assertEquals(expected, actualA, message)
      assertEquals(expected, actualB, message)
    }
  }

  @Test def testMoves(): Unit = {
    println("moves")
    val expected = Set(Knight.moveOneOClock, Knight.moveTwoOClock,
      Knight.moveFourOClock, Knight.moveFiveOClock, Knight.moveSevenOClock,
      Knight.moveEightOClock, Knight.moveTenOClock, Knight.moveElevenOClock)
    val actual = Knight.moves
    assertEquals(expected, actual)
  }

  @Test def testCanJumpOver(): Unit = {
    println("canJumpOver")
    val knight = new KnightImpl
    assert(knight.canJumpOver,
      "Knights should be able to jump over other pieces")
  }

  @Test def testCaptureSameAsMove(): Unit = {
    println("captureSameAsMove")
    val knight = new KnightImpl
    assert(knight.captureSameAsMove, "A knight captures same as moves")
  }

  @Test def testHasSpecialMoves(): Unit = {
    println("hasSpecialMoves")
    val knight = new KnightImpl
    assert(!knight.hasSpecialMoves, "A knight doesn't have special moves")
  }

  private class KnightImpl extends Knight {
    override val affiliation: Player = Neutral
  }

}
