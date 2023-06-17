package game.pieces.black

import game.{Black, RelativePosition, RelativePositionRange}
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions._

class KingPawnTest {

  @Test def testAffiliation(): Unit = {
    println("affiliation")
    assertEquals(Black, KingPawn.affiliation)
  }

  @Test def testPossibleMoves(): Unit = {
    println("possibleMoves")
    val start = new RelativePosition(0, -1)
    val finish = new RelativePosition(0, -2)
    val expected = Set(new RelativePositionRange(start, finish))
    val actual = KingPawn.possibleMoves
    assertEquals(expected, actual)
  }

  @Test def testCanJumpOver(): Unit = {
    println("canJumpOver")
    val msg = "Pawn shouldn't be able to jump over"
    assert(!KingPawn.canJumpOver, msg)
  }

  @Test def testCaptureSameAsMove(): Unit = {
    println("captureSameAsMove")
    val msg = "Pawn shouldn't capture same as move"
    assert(!KingPawn.captureSameAsMove, msg)
  }

  @Test def testPossibleCaptures(): Unit = {
    println("possibleCaptures")
    val captureLeft = new RelativePosition(-1, -1)
    val captureRight = new RelativePosition(1, -1)
    val expected = Set(RelativePositionRange(captureLeft),
      RelativePositionRange(captureRight))
    val actual = KingPawn.possibleCaptures
    assertEquals(expected, actual)
  }

}
