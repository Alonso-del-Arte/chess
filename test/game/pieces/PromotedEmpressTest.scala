package game.pieces

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class PromotedEmpressTest {

  @Test def testAffiliation(): Unit = {
    println("affiliation")
    val pawn = PieceChooser.choosePawn
    val empress = new PromotedEmpress(pawn)
    val expected = pawn.affiliation
    val actual = empress.affiliation
    val message = s"Empress promoted from $pawn should be of same side"
    assertEquals(expected, actual, message)
  }

}
