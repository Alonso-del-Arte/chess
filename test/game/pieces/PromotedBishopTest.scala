package game.pieces

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions._

class PromotedBishopTest {

  @Test def testAffiliation(): Unit = {
    println("affiliation")
    val promotedBishopWhite =
      new PromotedBishop(game.pieces.white.KingSideBishopPawn)
    val promotedBishopBlack =
      new PromotedBishop(game.pieces.black.QueenSideBishopPawn)
    assertEquals(game.pieces.white.KingSideBishopPawn.affiliation,
      promotedBishopWhite.affiliation)
    assertEquals(game.pieces.black.QueenSideBishopPawn.affiliation,
      promotedBishopBlack.affiliation)
  }

}
