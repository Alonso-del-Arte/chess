package game.pieces.lightgray

import game.LightGray
import game.pieces.{Bishop, PieceChooser}

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class PromotedPointyHatGuyTest {

  @Test def testAffiliation(): Unit = {
    println("affiliation")
    val expected = LightGray
    val pawn = PieceChooser.choosePawn(expected)
    val pointyHatGuy = new PromotedPointyHatGuy(pawn)
    val actual = pointyHatGuy.affiliation
    assertEquals(expected, actual)
  }

}
