package game.pieces.darkgray

import game.DarkGray
import game.pieces.{Bishop, PieceChooser}

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class PromotedPointyHatGuyTest {

  @Test def testAffiliation(): Unit = {
    println("affiliation")
    val expected = DarkGray
    val pawn = PieceChooser.choosePawn(expected)
    val pointyHatGuy = new PromotedPointyHatGuy(pawn)
    val actual = pointyHatGuy.affiliation
    assertEquals(expected, actual)
  }

  @Test def testPossibleMoves(): Unit = {
    println("possibleMoves")
    val pawn = PieceChooser.choosePawn(DarkGray)
    val pointyHatGuy = new PromotedPointyHatGuy(pawn)
    val expected = Bishop.moves
    val actual = pointyHatGuy.possibleMoves
    assertEquals(expected, actual)
  }

}
