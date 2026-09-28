package game.pieces.lightgray

import game.{LightGray, ShortMoveRanges}
import game.moves.Castling

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class EmperorTest {

  @Test def testAffiliation(): Unit = {
    println("affiliation")
    assertEquals(LightGray, Emperor.affiliation)
  }

}
