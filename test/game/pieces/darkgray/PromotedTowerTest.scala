package game.pieces.darkgray

import game.DarkGray
import game.pieces.PieceChooser

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class PromotedTowerTest {

  @Test def testAffiliation(): Unit = {
    println("affiliation")
    val expected = DarkGray
    val pawn = PieceChooser.choosePawn(expected)
    val tower = new PromotedTower(pawn)
    val actual = tower.affiliation
    assertEquals(expected, actual)
  }

}
