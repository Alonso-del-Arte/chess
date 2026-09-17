package game.pieces.lightgray

import game.{LightGray, RelativePosition, RelativePositionRange}

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions._

class HorsesPawnTest {

  @Test def testAffiliation(): Unit = {
    println("affiliation")
    assertEquals(LightGray, HorsesPawn.affiliation)
  }

}
