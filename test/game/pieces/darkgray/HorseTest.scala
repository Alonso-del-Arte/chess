package game.pieces.darkgray

import game.{DarkGray, Neutral, Player, RegularPosition, RelativePosition}

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class HorseTest {

  @Test def testAffiliation(): Unit = {
    println("affiliation")
    val expected = DarkGray
    val actual = Horse.affiliation
    assertEquals(expected, actual)
  }

}
