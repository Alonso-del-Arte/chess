package game.pieces.white

import game.White
import game.pieces.Knight

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class KingSideKnightTest {

  @Test def testAffiliation(): Unit = {
    println("affiliation")
    val expected = White
    val actual = KingSideKnight.affiliation
    assertEquals(expected, actual)
  }

}
