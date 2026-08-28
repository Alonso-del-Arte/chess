package game.pieces.darkgray

import game.{DarkGray, RelativePosition, RelativePositionRange}

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions._

class DarkGrayPawnTest {

  @Test def testAffiliation(): Unit = {
    println("affiliation")
    assertEquals(DarkGray, DarkGrayPawnImpl.affiliation)
  }

  @Test def testPossibleMoves(): Unit = {
    println("possibleMoves")
    val start = new RelativePosition(0, -1)
    val finish = new RelativePosition(0, -2)
    val expected = Set(new RelativePositionRange(start, finish))
    val actual = DarkGrayPawnImpl.possibleMoves
    assertEquals(expected, actual)
  }

  private object DarkGrayPawnImpl extends DarkGrayPawn

}
