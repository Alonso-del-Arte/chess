package game.pieces.darkgray

import game.DarkGray

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions._

class TowersPawnTest {

  @Test def testAffiliation(): Unit = {
    println("affiliation")
    assertEquals(DarkGray, TowersPawn.affiliation)
  }

}
