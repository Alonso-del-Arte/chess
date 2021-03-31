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
    assertEquals(expected, SampleValuation
      .valueOf(game.pieces.darkgray.EmperorsPawn))
    assertEquals(expected, SampleValuation
      .valueOf(game.pieces.darkgray.EmpressesPawn))
    assertEquals(expected, SampleValuation
      .valueOf(game.pieces.darkgray.PointyHatGuysPawn))
    assertEquals(expected, SampleValuation
      .valueOf(game.pieces.darkgray.HorsesPawn))
    assertEquals(expected, SampleValuation
      .valueOf(game.pieces.darkgray.TowersPawn))
    assertEquals(expected, SampleValuation
      .valueOf(game.pieces.lightgray.EmperorsPawn))
    assertEquals(expected, SampleValuation
      .valueOf(game.pieces.lightgray.EmpressesPawn))
    assertEquals(expected, SampleValuation
      .valueOf(game.pieces.lightgray.PointyHatGuysPawn))
    assertEquals(expected, SampleValuation
      .valueOf(game.pieces.lightgray.HorsesPawn))
    assertEquals(expected, SampleValuation
      .valueOf(game.pieces.lightgray.TowersPawn))
  }

  @Test def testValueOfTowers(): Unit = {
    val expected = ConstantCentipawnValuationTest
      .EXPECTED_SAMPLE_VALUATIONS(classOf[Tower])
    assertEquals(expected, SampleValuation.valueOf(game.pieces.darkgray.Tower))
    assertEquals(expected, SampleValuation.valueOf(game.pieces.lightgray.Tower))
  }

  @Test def testValueOfHorses(): Unit = {
    val expected = ConstantCentipawnValuationTest
      .EXPECTED_SAMPLE_VALUATIONS(classOf[Horse])
    assertEquals(expected, SampleValuation.valueOf(game.pieces.darkgray.Horse))
    assertEquals(expected, SampleValuation.valueOf(game.pieces.lightgray.Horse))
  }

  @Test def testValueOfPointyHatGuys(): Unit = {
    val expected = ConstantCentipawnValuationTest
      .EXPECTED_SAMPLE_VALUATIONS(classOf[PointyHatGuy])
    assertEquals(expected,
      SampleValuation.valueOf(game.pieces.darkgray.PointyHatGuy))
    assertEquals(expected,
      SampleValuation.valueOf(game.pieces.lightgray.PointyHatGuy))
  }

  @Test def testValueOfEmpresses(): Unit = {
    val expected = ConstantCentipawnValuationTest
      .EXPECTED_SAMPLE_VALUATIONS(classOf[Empress])
    assertEquals(expected,
      SampleValuation.valueOf(game.pieces.darkgray.Empress))
    assertEquals(expected,
      SampleValuation.valueOf(game.pieces.lightgray.Empress))
  }

  @Test def testValueOfEmperors(): Unit = {
    val expected = ConstantCentipawnValuationTest
      .EXPECTED_SAMPLE_VALUATIONS(classOf[Emperor])
    assertEquals(expected,
      SampleValuation.valueOf(game.pieces.darkgray.Emperor))
    assertEquals(expected,
      SampleValuation.valueOf(game.pieces.lightgray.Emperor))
  }

  @Test def testValueOfPromotedQueens(): Unit = {
    val promotedQueenWhite = new PromotedQueen(game.pieces.white.QueenPawn)
    val promotedQueenBlack = new PromotedQueen(game.pieces.black.KingPawn)
    assertEquals(SomewhatRandomValuation.valueOf(game.pieces.white.Queen),
      SomewhatRandomValuation.valueOf(promotedQueenWhite))
    assertEquals(SomewhatRandomValuation.valueOf(game.pieces.black.Queen),
      SomewhatRandomValuation.valueOf(promotedQueenBlack))
  }

  @Test def testValueOfPromotedBishops(): Unit = {
    val promotedBishopWhite =
      new PromotedBishop(game.pieces.white.QueenSideBishopPawn)
    val promotedBishopBlack =
      new PromotedBishop(game.pieces.black.KingSideBishopPawn)
    assertEquals(SomewhatRandomValuation.valueOf(game.pieces.white
      .QueenSideBishop), SomewhatRandomValuation.valueOf(promotedBishopWhite))
    assertEquals(SomewhatRandomValuation.valueOf(game.pieces.black
      .KingSideBishop), SomewhatRandomValuation.valueOf(promotedBishopBlack))
  }

  @Test def testValueOfPromotedKnights(): Unit = {
    val promotedKnightWhite =
      new PromotedKnight(game.pieces.white.QueenSideKnightPawn)
    val promotedKnightBlack =
      new PromotedKnight(game.pieces.black.KingSideKnightPawn)
    assertEquals(SomewhatRandomValuation.valueOf(game.pieces.white
      .QueenSideKnight), SomewhatRandomValuation.valueOf(promotedKnightWhite))
    assertEquals(SomewhatRandomValuation.valueOf(game.pieces.black
      .KingSideKnight), SomewhatRandomValuation.valueOf(promotedKnightBlack))
  }

  @Test def testValueOfPromotedRooks(): Unit = {
    val promotedRookWhite =
      new PromotedRook(game.pieces.white.QueenSideRookPawn)
    val promotedRookBlack =
      new PromotedRook(game.pieces.black.KingSideRookPawn)
    assertEquals(SomewhatRandomValuation.valueOf(game.pieces.white
      .QueenSideRook), SomewhatRandomValuation.valueOf(promotedRookWhite))
    assertEquals(SomewhatRandomValuation.valueOf(game.pieces.black
      .KingSideRook), SomewhatRandomValuation.valueOf(promotedRookBlack))
  }

}
