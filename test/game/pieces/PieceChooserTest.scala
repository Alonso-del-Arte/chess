package game.pieces

import game.{Black, DarkGray, LightGray, Player, White}

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class PieceChooserTest {
  private val whitePawns: Set[Pawn] = Set(game.pieces.white.QueenSideRookPawn,
    game.pieces.white.QueenSideKnightPawn,
    game.pieces.white.QueenSideBishopPawn, game.pieces.white.QueenPawn,
    game.pieces.white.KingPawn, game.pieces.white.KingSideBishopPawn,
    game.pieces.white.KingSideKnightPawn, game.pieces.white.KingSideRookPawn)
  private val blackPawns: Set[Pawn] = Set(game.pieces.black.QueenSideRookPawn,
    game.pieces.black.QueenSideKnightPawn,
    game.pieces.black.QueenSideBishopPawn, game.pieces.black.QueenPawn,
    game.pieces.black.KingPawn, game.pieces.black.KingSideBishopPawn,
    game.pieces.black.KingSideKnightPawn, game.pieces.black.KingSideRookPawn)
  private val darkGrayPawns: Set[Pawn] = Set(game.pieces.darkgray.EmperorsPawn,
    game.pieces.darkgray.EmpressesPawn, game.pieces.darkgray.PointyHatGuysPawn,
    game.pieces.darkgray.HorsesPawn, game.pieces.darkgray.TowersPawn)
  private val lightGrayPawns: Set[Pawn] =
    Set(game.pieces.lightgray.EmperorsPawn, game.pieces.lightgray.EmpressesPawn,
      game.pieces.lightgray.PointyHatGuysPawn, game.pieces.lightgray.HorsesPawn,
      game.pieces.lightgray.TowersPawn)
  private val allPawns: Set[Pawn] = whitePawns ++ blackPawns ++ darkGrayPawns ++
    lightGrayPawns
  private val mapSidesToPawns: Map[Player, Set[Pawn]] = Map(White -> whitePawns,
    Black -> blackPawns, DarkGray -> darkGrayPawns, LightGray -> lightGrayPawns)
  private val whiteOfficerPieces: Set[Piece] =
    Set(game.pieces.white.QueenSideRook, game.pieces.white.QueenSideKnight,
      game.pieces.white.QueenSideBishop, game.pieces.white.Queen,
      game.pieces.white.King, game.pieces.white.KingSideBishop,
      game.pieces.white.KingSideKnight, game.pieces.white.KingSideRook)
  private val blackOfficerPieces: Set[Piece] =
    Set(game.pieces.black.QueenSideRook, game.pieces.black.QueenSideKnight,
      game.pieces.black.QueenSideBishop, game.pieces.black.Queen,
      game.pieces.black.King, game.pieces.black.KingSideBishop,
      game.pieces.black.KingSideKnight, game.pieces.black.KingSideRook)
  private val darkGrayOfficerPieces: Set[Piece] =
    Set(game.pieces.darkgray.Emperor, game.pieces.darkgray.Empress,
      game.pieces.darkgray.PointyHatGuy, game.pieces.darkgray.Horse,
      game.pieces.darkgray.Tower)
  private val lightGrayOfficerPieces: Set[Piece] =
    Set(game.pieces.lightgray.Emperor, game.pieces.lightgray.Empress,
      game.pieces.lightgray.PointyHatGuy, game.pieces.lightgray.Horse,
      game.pieces.lightgray.Tower)
  private val allOfficerPieces: Set[Piece] = whiteOfficerPieces ++
    blackOfficerPieces ++ darkGrayOfficerPieces ++ lightGrayOfficerPieces
  private val mapSidesToOfficerPieces: Map[Player, Set[Piece]] =
    Map(White -> whiteOfficerPieces, Black -> blackOfficerPieces,
      DarkGray -> darkGrayOfficerPieces, LightGray -> lightGrayOfficerPieces)

  @Test def testChoosePawnOfGivenSide(): Unit = {
    val multiplier = 12
    this.mapSidesToPawns.foreach(pair => {
      val iterCount = pair._2.size * multiplier
      val expected = pair._2
      val actual = {
        for (_ <- 1 to iterCount) yield PieceChooser.choosePawn(pair._1)
      }.toSet
      assertEquals(expected, actual)
    })
  }

  @Test def testChoosePawn(): Unit = {
    println("choosePawn")
    val iterCount = this.allPawns.size * 12
    val actual = {
      for (_ <- 1 to iterCount) yield PieceChooser.choosePawn
    }.toSet
    assertEquals(this.allPawns, actual)
  }

  @Test def testChooseOfficerPieceOfGivenSide(): Unit = {
    val multiplier = 12
    this.mapSidesToOfficerPieces.foreach(pair => {
      val iterCount = pair._2.size * multiplier
      val expected = pair._2
      val actual = {
        for (_ <- 1 to iterCount) yield PieceChooser.chooseOfficerPiece(pair._1)
      }.toSet
      assertEquals(expected, actual)
    })
  }

  @Test def testChooseOfficerPiece(): Unit = {
    println("chooseOfficerPiece")
    val iterCount = this.allOfficerPieces.size * 12
    val actual = {
      for (_ <- 1 to iterCount) yield PieceChooser.chooseOfficerPiece
    }.toSet
    assertEquals(this.allOfficerPieces, actual)
  }

}
