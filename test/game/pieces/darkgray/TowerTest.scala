package game.pieces.darkgray

import game.DarkGray

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class TowerTest {

  @Test def testAffiliation(): Unit = {
    println("affiliation")
    assertEquals(DarkGray, Tower.affiliation)
  }

}
