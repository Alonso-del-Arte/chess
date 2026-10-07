package game.pieces.lightgray

import game.LightGray
import game.pieces.{Bishop, Rook}

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class EmpressTest {

  @Test def testAffiliation(): Unit = {
    println("affiliation")
    assertEquals(LightGray, Empress.affiliation)
  }

}
