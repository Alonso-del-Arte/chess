package game.pieces.lightgray

import game.{LightGray, RelativePosition, RelativePositionRange}

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions._

class LightGrayPawnTest {

  @Test def testAffiliation(): Unit = {
    println("affiliation")
    assertEquals(LightGray, LightGrayPawnImpl.affiliation)
  }

  @Test def testPossibleMoves(): Unit = {
    println("possibleMoves")
    val start = new RelativePosition(0, 1)
    val finish = new RelativePosition(0, 2)
    val expected = Set(new RelativePositionRange(start, finish))
    val actual = LightGrayPawnImpl.possibleMoves
    assertEquals(expected, actual)
  }

  private object LightGrayPawnImpl extends LightGrayPawn

}
