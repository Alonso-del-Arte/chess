package game.pieces.darkgray

import game.DarkGray
import game.pieces.Rook

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class TowerTest {

  @Test def testAffiliation(): Unit = {
    println("affiliation")
    assertEquals(DarkGray, Tower.affiliation)
  }

  @Test def testPossibleMoves(): Unit = {
    println("possibleMoves")
    val expected = Rook.moves
    val actual = Tower.possibleMoves
    assertEquals(expected, actual)
  }

}
