package game.pieces

import game.{Black, RelativePosition, RelativePositionRange, White}

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions._

class NeutralPawnTest {

  @Test def testPossibleMoves(): Unit = {
    val expected: Set[RelativePositionRange] = Set()
    val actual = NeutralPawn.possibleMoves
    assertEquals(expected, actual)
  }

}
