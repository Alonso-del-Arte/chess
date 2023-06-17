package game.pieces.black

import game.{Black, RelativePosition, RelativePositionRange}
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions._

class QueenPawnTest {

  @Test def testAffiliation(): Unit = {
    println("affiliation")
    assertEquals(Black, QueenPawn.affiliation)
  }

  @Test def testPossibleMoves(): Unit = {
    println("possibleMoves")
    val start = new RelativePosition(0, -1)
    val finish = new RelativePosition(0, -2)
    val expected = Set(new RelativePositionRange(start, finish))
    val actual = QueenPawn.possibleMoves
    assertEquals(expected, actual)
  }

  @Test def testCanJumpOver(): Unit = {
    println("canJumpOver")
    val msg = "Pawn shouldn't be able to jump over"
    assert(!QueenPawn.canJumpOver, msg)
  }

  @Test def testCaptureSameAsMove(): Unit = {
    println("captureSameAsMove")
    val msg = "Pawn shouldn't capture same as move"
    assert(!QueenPawn.captureSameAsMove, msg)
  }

  @Test def testPossibleCaptures(): Unit = {
    println("possibleCaptures")
    val captureLeft = new RelativePosition(-1, -1)
    val captureRight = new RelativePosition(1, -1)
    val expected = Set(RelativePositionRange(captureLeft),
      RelativePositionRange(captureRight))
    val actual = QueenPawn.possibleCaptures
    assertEquals(expected, actual)
  }

}
