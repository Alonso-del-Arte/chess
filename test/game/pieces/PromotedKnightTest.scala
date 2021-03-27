package game.pieces

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions._

class PromotedKnightTest {

  @Test def testAffiliation(): Unit = {
    println("affiliation")
    val promotedKnightWhite =
      new PromotedKnight(game.pieces.white.KingSideKnightPawn)
    val promotedKnightBlack =
      new PromotedKnight(game.pieces.black.QueenSideKnightPawn)
    assertEquals(game.pieces.white.KingSideKnightPawn.affiliation,
      promotedKnightWhite.affiliation)
    assertEquals(game.pieces.black.QueenSideKnightPawn.affiliation,
      promotedKnightBlack.affiliation)
  }

}
