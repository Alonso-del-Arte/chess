package game.pieces

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions._

class PromotedQueenTest {

  @Test def testAffiliation(): Unit = {
    println("affiliation")
    val promotedQueenWhite = new PromotedQueen(game.pieces.white.KingPawn)
    val promotedQueenBlack = new PromotedQueen(game.pieces.black.QueenPawn)
    assertEquals(game.pieces.white.KingPawn.affiliation,
      promotedQueenWhite.affiliation)
    assertEquals(game.pieces.black.QueenPawn.affiliation,
      promotedQueenBlack.affiliation)
  }

}
