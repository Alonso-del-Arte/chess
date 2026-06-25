package game.pieces.lightgray

import game.LightGray
import game.pieces.Rook

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class TowerTest {

  @Test def testAffiliation(): Unit = {
    println("affiliation")
    assertEquals(LightGray, Tower.affiliation)
  }

}
