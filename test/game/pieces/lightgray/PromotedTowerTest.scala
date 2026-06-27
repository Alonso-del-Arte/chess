package game.pieces.lightgray

import game.LightGray
import game.pieces.{PieceChooser, Rook}

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class PromotedTowerTest {

  @Test def testAffiliation(): Unit = {
    println("affiliation")
    val expected = LightGray
    val pawn = PieceChooser.choosePawn(expected)
    val tower = new PromotedTower(pawn)
    val actual = tower.affiliation
    assertEquals(expected, actual)
  }

}
