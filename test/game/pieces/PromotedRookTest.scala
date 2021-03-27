package game.pieces

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions._

class PromotedRookTest {

  @Test def testAffiliation(): Unit = {
    println("affiliation")
    val promotedRookWhite = new PromotedRook(game.pieces.white.KingSideRookPawn)
    val promotedRookBlack =
      new PromotedRook(game.pieces.black.QueenSideRookPawn)
    assertEquals(game.pieces.white.KingSideRookPawn.affiliation,
      promotedRookWhite.affiliation)
    assertEquals(game.pieces.black.QueenSideRookPawn.affiliation,
      promotedRookBlack.affiliation)
  }

}
