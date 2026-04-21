package game.pieces

import game.{Black, White}

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions._

class PromotedKnightTest {

  @Test def testAffiliation(): Unit = {
    println("affiliation")
    val promotedKnightWhite = new PromotedKnight(PieceChooser.choosePawn(White))
    val promotedKnightBlack = new PromotedKnight(PieceChooser.choosePawn(Black))
    assertEquals(White, promotedKnightWhite.affiliation)
    assertEquals(Black, promotedKnightBlack.affiliation)
  }

}
