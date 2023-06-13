package game.pieces.white

import game.{RelativePosition, RelativePositionRange, White}
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions._

class QueenSideRookPawnTest {

  @Test def testAffiliation(): Unit = {
    println("affiliation")
    assertEquals(White, QueenSideRookPawn.affiliation)
  }

  @Test def testPossibleMoves(): Unit = {
    println("possibleMoves")
    val start = new RelativePosition(0, 1)
    val finish = new RelativePosition(0, 2)
    val expected = Set(new RelativePositionRange(start, finish))
    val actual = QueenSideRookPawn.possibleMoves
    assertEquals(expected, actual)
  }

  @Test def testCanJumpOver(): Unit = {
    println("canJumpOver")
    val msg = "Pawn shouldn't be able to jump over"
    assert(!QueenSideRookPawn.canJumpOver, msg)
  }

  @Test def testCaptureSameAsMove(): Unit = {
    println("captureSameAsMove")
    val msg = "Pawn shouldn't capture same as move"
    assert(!QueenSideRookPawn.captureSameAsMove, msg)
  }

  @Test def testPossibleCaptures(): Unit = {
    println("possibleCaptures")
    val captureLeft = new RelativePosition(-1, 1)
    val captureRight = new RelativePosition(1, 1)
    val expected = Set(RelativePositionRange(captureLeft),
      RelativePositionRange(captureRight))
    val actual = QueenSideRookPawn.possibleCaptures
    assertEquals(expected, actual)
  }

}
