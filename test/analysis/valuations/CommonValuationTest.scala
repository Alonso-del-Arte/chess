package analysis.valuations

import analysis.Centipawns
import game.pieces._

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions._

object CommonValuationTest {

  val EXPECTED_VALUATIONS: Map[Class[_ <: Piece], Centipawns] =
    Map(classOf[Pawn] -> Centipawns(100), classOf[Rook] -> Centipawns(500),
      classOf[Knight] -> Centipawns(300), classOf[Bishop] -> Centipawns(300),
      classOf[Queen] -> Centipawns(900), classOf[King] -> Centipawns(0))

}

class CommonValuationTest {

  @Test def testPawnValues(): Unit = {
    val expected = CommonValuationTest.EXPECTED_VALUATIONS(classOf[Pawn])
    assertEquals(expected, CommonValuation.valueOf(white.QueenSideRookPawn))
    assertEquals(expected, CommonValuation.valueOf(white.QueenSideKnightPawn))
    assertEquals(expected, CommonValuation.valueOf(white.QueenSideBishopPawn))
    assertEquals(expected, CommonValuation.valueOf(white.QueenPawn))
    assertEquals(expected, CommonValuation.valueOf(white.KingPawn))
    assertEquals(expected, CommonValuation.valueOf(white.KingSideBishopPawn))
    assertEquals(expected, CommonValuation.valueOf(white.KingSideKnightPawn))
    assertEquals(expected, CommonValuation.valueOf(white.KingSideRookPawn))
  }

  @Test def testRookValues(): Unit = {
    val expected = CommonValuationTest.EXPECTED_VALUATIONS(classOf[Rook])
    val promotedRookWhite = new PromotedRook(white.KingSideRookPawn)
    val promotedRookBlack = new PromotedRook(black.QueenSideRookPawn)
    assertEquals(expected, CommonValuation.valueOf(white.QueenSideRook))
    assertEquals(expected, CommonValuation.valueOf(white.KingSideRook))
    assertEquals(expected, CommonValuation.valueOf(promotedRookWhite))
    assertEquals(expected, CommonValuation.valueOf(black.QueenSideRook))
    assertEquals(expected, CommonValuation.valueOf(black.KingSideRook))
    assertEquals(expected, CommonValuation.valueOf(promotedRookBlack))
  }

  @Test def testKnightValues(): Unit = {
    val expected = CommonValuationTest.EXPECTED_VALUATIONS(classOf[Knight])
    val promotedKnightWhite = new PromotedKnight(white.KingSideKnightPawn)
    val promotedKnightBlack = new PromotedKnight(black.QueenSideKnightPawn)
    assertEquals(expected, CommonValuation.valueOf(white.QueenSideKnight))
    assertEquals(expected, CommonValuation.valueOf(white.KingSideKnight))
    assertEquals(expected, CommonValuation.valueOf(promotedKnightWhite))
    assertEquals(expected, CommonValuation.valueOf(black.QueenSideKnight))
    assertEquals(expected, CommonValuation.valueOf(black.KingSideKnight))
    assertEquals(expected, CommonValuation.valueOf(promotedKnightBlack))
  }

  @Test def testBishopValues(): Unit = {
    val expected = CommonValuationTest.EXPECTED_VALUATIONS(classOf[Bishop])
    val promotedBishopWhite = new PromotedBishop(white.KingSideBishopPawn)
    val promotedBishopBlack = new PromotedBishop(black.QueenSideBishopPawn)
    assertEquals(expected, CommonValuation.valueOf(white.QueenSideBishop))
    assertEquals(expected, CommonValuation.valueOf(white.KingSideBishop))
    assertEquals(expected, CommonValuation.valueOf(promotedBishopWhite))
    assertEquals(expected, CommonValuation.valueOf(black.QueenSideBishop))
    assertEquals(expected, CommonValuation.valueOf(black.KingSideBishop))
    assertEquals(expected, CommonValuation.valueOf(promotedBishopBlack))
  }

  @Test def testQueenValues(): Unit = {
    val expected = CommonValuationTest.EXPECTED_VALUATIONS(classOf[Queen])
    val promotedQueenWhite = new PromotedQueen(white.QueenPawn)
    val promotedQueenBlack = new PromotedQueen(black.QueenPawn)
    assertEquals(expected, CommonValuation.valueOf(white.Queen))
    assertEquals(expected, CommonValuation.valueOf(promotedQueenWhite))
    assertEquals(expected, CommonValuation.valueOf(black.Queen))
    assertEquals(expected, CommonValuation.valueOf(promotedQueenBlack))
  }

  /**
   * A king should have a defined centipawn value, though perhaps it doesn't
   * quite matter what that is.
   */
  @Test def testKingHasDefinedValue(): Unit = {
    try {
      val whiteKingValuation = CommonValuation.valueOf(white.King)
      val blackKingValuation = CommonValuation.valueOf(black.King)
      assertEquals(whiteKingValuation, blackKingValuation)
    } catch {
      case throwable: Throwable =>
        val msg = "King valuation should not have caused " +
          throwable.getClass.getName
        fail(msg)
    }
  }

}
