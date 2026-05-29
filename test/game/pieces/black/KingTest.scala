package game.pieces.black

import game.{Black, RelativePosition, RelativePositionRange}

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class KingTest {

  @Test def testAffiliation(): Unit = {
    println("affiliation")
    val expected = Black
    val actual = King.affiliation
    assertEquals(expected, actual)
  }

}
