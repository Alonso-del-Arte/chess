package game.pieces.darkgray

import game.{DarkGray, Player}
import game.pieces.{Bishop, Rook}

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class EmpressTest {

  @Test def testAffiliation(): Unit = {
    println("affiliation")
    assertEquals(DarkGray, Empress.affiliation)
  }

}
