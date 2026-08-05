package game.pieces.lightgray

import game.LightGray
import game.pieces.Knight

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class HorseTest {

  @Test def testAffiliation(): Unit = {
    println("affiliation")
    val expected = LightGray
    val actual = Horse.affiliation
    assertEquals(expected, actual)
  }

}
