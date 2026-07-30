package game.pieces.black

import game.Black
import game.pieces.Knight

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class QueenSideKnightTest {

  @Test def testAffiliation(): Unit = {
    println("affiliation")
    val expected = Black
    val actual = QueenSideKnight.affiliation
    assertEquals(expected, actual)
  }

}
