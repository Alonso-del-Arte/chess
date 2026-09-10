package game.pieces.lightgray

import game.{DarkGray, LightGray, RelativePosition, RelativePositionRange}

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions._

class EmperorsPawnTest {

  @Test def testAffiliation(): Unit = {
    println("affiliation")
    assertEquals(LightGray, EmperorsPawn.affiliation)
  }

}
