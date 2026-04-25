package game.pieces

import game.{Black, Neutral, RelativePosition, RelativePositionRange, White}

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions._

class NeutralPawnTest {

  @Test def testAffiliation(): Unit = {
    println("affiliation")
    val expected = Neutral
    val actual = NeutralPawn.affiliation
    assertEquals(expected, actual)
  }

  @Test def testPossibleMoves(): Unit = {
    println("possibleMoves")
    val expected: Set[RelativePositionRange] = Set()
    val actual = NeutralPawn.possibleMoves
    assertEquals(expected, actual)
  }

}
