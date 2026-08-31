package game.pieces.darkgray

import game.{DarkGray, RelativePosition, RelativePositionRange}

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions._

class EmpressesPawnTest {

  @Test def testAffiliation(): Unit = {
    println("affiliation")
    assertEquals(DarkGray, EmpressesPawn.affiliation)
  }

}
