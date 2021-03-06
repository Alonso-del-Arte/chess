package analysis.valuations

import analysis.Centipawns
import game.pieces._

import scala.util.Random

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions._

object ConstantCentipawnValuationTest {

  val EXPECTED_SAMPLE_VALUATIONS: Map[Class[_ <: Piece], Centipawns] =
    Map(classOf[Pawn] -> Centipawns(125), classOf[Tower] -> Centipawns(500),
      classOf[Horse] -> Centipawns(300), classOf[PointyHatGuy] ->
        Centipawns(400), classOf[Empress] -> Centipawns(900), classOf[Emperor]
        -> Centipawns(50))

  private val pawnWeighted = ((1.0 + Random.nextDouble) * 100).toInt
  private val rookWeighted = ((1.0 + Random.nextDouble) * 400).toInt
  private val knightWeighted = ((1.0 + Random.nextDouble) * 300).toInt
  private val bishopWeighted = ((1.0 + Random.nextDouble) * 300).toInt
  private val queenWeighted = ((1.0 + Random.nextDouble) * 1000).toInt

  val RANDOMLY_WEIGHTED_VALUATIONS: Map[Class[_ <: Piece], Centipawns] =
    Map(classOf[Pawn] -> Centipawns(pawnWeighted), classOf[Rook] ->
      Centipawns(rookWeighted), classOf[Knight] -> Centipawns(knightWeighted),
      classOf[Bishop] -> Centipawns(bishopWeighted), classOf[Queen] ->
        Centipawns(queenWeighted), classOf[King] -> Centipawns(0))

}

class ConstantCentipawnValuationTest {

  @Test def testValueOf(): Unit = {
    println("valueOf")
    val expected = ConstantCentipawnValuationTest
      .EXPECTED_SAMPLE_VALUATIONS(classOf[Pawn])
    assertEquals(expected, SampleValuation.valueOf(darkgray.EmperorsPawn))
    assertEquals(expected, SampleValuation.valueOf(darkgray.EmpressesPawn))
    assertEquals(expected, SampleValuation.valueOf(darkgray.PointyHatGuysPawn))
    assertEquals(expected, SampleValuation.valueOf(darkgray.HorsesPawn))
    assertEquals(expected, SampleValuation.valueOf(darkgray.TowersPawn))
    assertEquals(expected, SampleValuation.valueOf(lightgray.EmperorsPawn))
    assertEquals(expected, SampleValuation.valueOf(lightgray.EmpressesPawn))
    assertEquals(expected, SampleValuation.valueOf(lightgray.PointyHatGuysPawn))
    assertEquals(expected, SampleValuation.valueOf(lightgray.HorsesPawn))
    assertEquals(expected, SampleValuation.valueOf(lightgray.TowersPawn))
  }

  @Test def testValueOfTowers(): Unit = {
    val expected = ConstantCentipawnValuationTest
      .EXPECTED_SAMPLE_VALUATIONS(classOf[Tower])
    assertEquals(expected, SampleValuation.valueOf(darkgray.Tower))
    assertEquals(expected, SampleValuation.valueOf(lightgray.Tower))
  }

  @Test def testValueOfHorses(): Unit = {
    val expected = ConstantCentipawnValuationTest
      .EXPECTED_SAMPLE_VALUATIONS(classOf[Horse])
    assertEquals(expected, SampleValuation.valueOf(darkgray.Horse))
    assertEquals(expected, SampleValuation.valueOf(lightgray.Horse))
  }

  @Test def testValueOfPointyHatGuys(): Unit = {
    val expected = ConstantCentipawnValuationTest
      .EXPECTED_SAMPLE_VALUATIONS(classOf[PointyHatGuy])
    assertEquals(expected, SampleValuation.valueOf(darkgray.PointyHatGuy))
    assertEquals(expected, SampleValuation.valueOf(lightgray.PointyHatGuy))
  }

  @Test def testValueOfEmpresses(): Unit = {
    val expected = ConstantCentipawnValuationTest
      .EXPECTED_SAMPLE_VALUATIONS(classOf[Empress])
    assertEquals(expected, SampleValuation.valueOf(darkgray.Empress))
    assertEquals(expected, SampleValuation.valueOf(lightgray.Empress))
  }

  @Test def testValueOfEmperors(): Unit = {
    val expected = ConstantCentipawnValuationTest
      .EXPECTED_SAMPLE_VALUATIONS(classOf[Emperor])
    assertEquals(expected, SampleValuation.valueOf(darkgray.Emperor))
    assertEquals(expected, SampleValuation.valueOf(lightgray.Emperor))
  }

  @Test def testValueOfPromotedQueens(): Unit = {
    val promotedQueenWhite = new PromotedQueen(white.QueenPawn)
    val promotedQueenBlack = new PromotedQueen(black.KingPawn)
    assertEquals(SomewhatRandomValuation.valueOf(white.Queen),
      SomewhatRandomValuation.valueOf(promotedQueenWhite))
    assertEquals(SomewhatRandomValuation.valueOf(black.Queen),
      SomewhatRandomValuation.valueOf(promotedQueenBlack))
  }

  @Test def testValueOfPromotedBishops(): Unit = {
    val promotedBishopWhite = new PromotedBishop(white.QueenSideBishopPawn)
    val promotedBishopBlack = new PromotedBishop(black.KingSideBishopPawn)
    assertEquals(SomewhatRandomValuation.valueOf(white.QueenSideBishop),
      SomewhatRandomValuation.valueOf(promotedBishopWhite))
    assertEquals(SomewhatRandomValuation.valueOf(black.KingSideBishop),
      SomewhatRandomValuation.valueOf(promotedBishopBlack))
  }

  @Test def testValueOfPromotedKnights(): Unit = {
    val promotedKnightWhite = new PromotedKnight(white.QueenSideKnightPawn)
    val promotedKnightBlack = new PromotedKnight(black.KingSideKnightPawn)
    assertEquals(SomewhatRandomValuation.valueOf(white.QueenSideKnight),
      SomewhatRandomValuation.valueOf(promotedKnightWhite))
    assertEquals(SomewhatRandomValuation.valueOf(black.KingSideKnight),
      SomewhatRandomValuation.valueOf(promotedKnightBlack))
  }

  @Test def testValueOfPromotedRooks(): Unit = {
    val promotedRookWhite = new PromotedRook(white.QueenSideRookPawn)
    val promotedRookBlack = new PromotedRook(black.KingSideRookPawn)
    assertEquals(SomewhatRandomValuation.valueOf(white.QueenSideRook),
      SomewhatRandomValuation.valueOf(promotedRookWhite))
    assertEquals(SomewhatRandomValuation.valueOf(black.KingSideRook),
      SomewhatRandomValuation.valueOf(promotedRookBlack))
  }

}
