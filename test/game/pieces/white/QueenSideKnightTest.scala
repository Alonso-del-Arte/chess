package game.pieces.white

import game.{RegularPosition, RelativePosition, White}

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class QueenSideKnightTest {

  @Test def testAffiliation(): Unit = {
    println("affiliation")
    val expected = White
    val actual = QueenSideKnight.affiliation
    assertEquals(expected, actual)
  }

}
