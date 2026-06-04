package game.pieces.white

import game.{ShortMoveRanges, White}

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class KingTest {

  @Test def testAffiliation(): Unit = {
    println("affiliation")
    val expected = White
    val actual = King.affiliation
    assertEquals(expected, actual)
  }

}
