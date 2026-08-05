package game.pieces.darkgray

import game.{DarkGray, RegularPosition, RelativePosition}
import game.pieces.Knight

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class HorseTest {

  @Test def testAffiliation(): Unit = {
    println("affiliation")
    val expected = DarkGray
    val actual = Horse.affiliation
    assertEquals(expected, actual)
  }

  @Test def testPossibleMoves(): Unit = {
    println("possibleMoves")
    val expected = Knight.moves
    val actual = Horse.possibleMoves
    assertEquals(expected, actual)
  }

}
