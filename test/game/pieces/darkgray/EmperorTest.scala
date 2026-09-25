package game.pieces.darkgray

import game.{DarkGray, ShortMoveRanges}
import game.moves.Castling

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class EmperorTest {

  @Test def testSpecialMoves(): Unit = {
    println("specialMoves")
    val expected = Set(Castling)
    val actual = Emperor.specialMoves
    assertEquals(expected, actual)
  }

}
