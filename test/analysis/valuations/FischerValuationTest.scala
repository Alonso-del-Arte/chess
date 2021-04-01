package analysis.valuations

import analysis.Centipawns
import game.pieces._

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions._

object FischerValuationTest {

  val EXPECTED_VALUATIONS: Map[Class[_ <: Piece], Centipawns] =
    Map(classOf[Pawn] -> Centipawns(100), classOf[Rook] -> Centipawns(500),
      classOf[Knight] -> Centipawns(300), classOf[Bishop] -> Centipawns(325),
      classOf[Queen] -> Centipawns(900), classOf[King] -> Centipawns(0))

}

class FischerValuationTest {

  @Test def testPawnValues(): Unit = {
    val expected = FischerValuationTest.EXPECTED_VALUATIONS(classOf[Pawn])
    assertEquals(expected, FischerValuation.valueOf(white.QueenSideRookPawn))
    assertEquals(expected, FischerValuation.valueOf(white.QueenSideKnightPawn))
    assertEquals(expected, FischerValuation.valueOf(white.QueenSideBishopPawn))
    assertEquals(expected, FischerValuation.valueOf(white.Queen))
    assertEquals(expected, FischerValuation.valueOf(white.King))
    assertEquals(expected, FischerValuation.valueOf(white.KingSideBishopPawn))
    assertEquals(expected, FischerValuation.valueOf(white.KingSideKnightPawn))
    assertEquals(expected, FischerValuation.valueOf(white.KingSideRookPawn))
  }

  @Test def testRookValues(): Unit = {
    val expected = FischerValuationTest.EXPECTED_VALUATIONS(classOf[Rook])
    val promotedRookWhite = new PromotedRook(white.KingSideRookPawn)
    val promotedRookBlack = new PromotedRook(black.QueenSideRookPawn)
    assertEquals(expected, FischerValuation.valueOf(white.QueenSideRook))
    assertEquals(expected, FischerValuation.valueOf(white.KingSideRook))
    assertEquals(expected, FischerValuation.valueOf(promotedRookWhite))
    assertEquals(expected, FischerValuation.valueOf(black.QueenSideRook))
    assertEquals(expected, FischerValuation.valueOf(black.KingSideRook))
    assertEquals(expected, FischerValuation.valueOf(promotedRookBlack))
  }

  @Test def testKnightValues(): Unit = {
    val expected = FischerValuationTest.EXPECTED_VALUATIONS(classOf[Knight])
    val promotedKnightWhite = new PromotedKnight(white.KingSideKnightPawn)
    val promotedKnightBlack = new PromotedKnight(black.QueenSideKnightPawn)
    assertEquals(expected, FischerValuation.valueOf(white.QueenSideKnight))
    assertEquals(expected, FischerValuation.valueOf(white.KingSideKnight))
    assertEquals(expected, FischerValuation.valueOf(promotedKnightWhite))
    assertEquals(expected, FischerValuation.valueOf(black.QueenSideKnight))
    assertEquals(expected, FischerValuation.valueOf(black.KingSideKnight))
    assertEquals(expected, FischerValuation.valueOf(promotedKnightBlack))
  }

  @Test def testBishopValues(): Unit = {
    val expected = FischerValuationTest.EXPECTED_VALUATIONS(classOf[Bishop])
    val promotedBishopWhite = new PromotedBishop(white.KingSideBishopPawn)
    val promotedBishopBlack = new PromotedBishop(black.QueenSideBishopPawn)
    assertEquals(expected, FischerValuation.valueOf(white.QueenSideBishop))
    assertEquals(expected, FischerValuation.valueOf(white.KingSideBishop))
    assertEquals(expected, FischerValuation.valueOf(promotedBishopWhite))
    assertEquals(expected, FischerValuation.valueOf(black.QueenSideBishop))
    assertEquals(expected, FischerValuation.valueOf(black.KingSideBishop))
    assertEquals(expected, FischerValuation.valueOf(promotedBishopBlack))
  }

  @Test def testQueenValues(): Unit = {
    val expected = FischerValuationTest.EXPECTED_VALUATIONS(classOf[Queen])
    val promotedQueenWhite = new PromotedQueen(white.QueenPawn)
    val promotedQueenBlack = new PromotedQueen(black.QueenPawn)
    assertEquals(expected, FischerValuation.valueOf(white.Queen))
    assertEquals(expected, FischerValuation.valueOf(promotedQueenWhite))
    assertEquals(expected, FischerValuation.valueOf(black.Queen))
    assertEquals(expected, FischerValuation.valueOf(promotedQueenBlack))
  }

  /**
   * A king should have a defined centipawn value, though perhaps it doesn't
   * quite matter what that is.
   */
  @Test def testKingHasDefinedValue(): Unit = {
    try {
      val whiteKingValuation = FischerValuation.valueOf(white.King)
      val blackKingValuation = FischerValuation.valueOf(black.King)
      assertEquals(whiteKingValuation, blackKingValuation)
    } catch {
      case throwable: Throwable =>
        val msg = "King valuation should not have caused " +
          throwable.getClass.getName
        fail(msg)
    }
  }

}
