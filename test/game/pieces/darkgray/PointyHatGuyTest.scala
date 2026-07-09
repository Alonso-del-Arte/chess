package game.pieces.darkgray

import game.DarkGray
import game.pieces.Bishop

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class PointyHatGuyTest {

  @Test def testAffiliation(): Unit = {
    println("affiliation")
    assertEquals(DarkGray, PointyHatGuy.affiliation)
  }

  @Test def testPossibleMoves(): Unit = {
    println("possibleMoves")
    val expected = Bishop.moves
    val actual = PointyHatGuy.possibleMoves
    assertEquals(expected, actual)
  }

}
