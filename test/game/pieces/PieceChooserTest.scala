package game.pieces

import game.{Black, DarkGray, LightGray, Player, White}

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class PieceChooserTest {
  private val sides: Set[Player] = Set(White, Black, DarkGray, LightGray)
  private val whitePawns: Set[Pawn] = Set(game.pieces.white.QueenSideRookPawn,
    game.pieces.white.QueenSideKnightPawn, game.pieces.white.QueenSideBishopPawn,
    game.pieces.white.QueenPawn, game.pieces.white.KingPawn,
    game.pieces.white.KingSideBishopPawn, game.pieces.white.KingSideKnightPawn,
    game.pieces.white.KingSideRookPawn)
  private val blackPawns: Set[Pawn] = Set(game.pieces.black.QueenSideRookPawn,
    game.pieces.black.QueenSideKnightPawn, game.pieces.black.QueenSideBishopPawn,
    game.pieces.black.QueenPawn, game.pieces.black.KingPawn,
    game.pieces.black.KingSideBishopPawn, game.pieces.black.KingSideKnightPawn,
    game.pieces.black.KingSideRookPawn)
  private val darkGrayPawns: Set[Pawn] = Set(game.pieces.darkgray.EmperorsPawn,
    game.pieces.darkgray.EmpressesPawn, game.pieces.darkgray.PointyHatGuysPawn,
    game.pieces.darkgray.HorsesPawn, game.pieces.darkgray.TowersPawn)
  private val lightGrayPawns: Set[Pawn] =
    Set(game.pieces.lightgray.EmperorsPawn, game.pieces.lightgray.EmpressesPawn,
      game.pieces.lightgray.PointyHatGuysPawn, game.pieces.lightgray.HorsesPawn,
      game.pieces.lightgray.TowersPawn)
  private val mapSidesToPawns: Map[Player, Set[Pawn]] = Map(White -> whitePawns,
    Black -> blackPawns, DarkGray -> darkGrayPawns, LightGray -> lightGrayPawns)

  @Test def testChoosePawnOfGivenSide(): Unit = {
    val multiplier = 12
    mapSidesToPawns.foreach(pair => {
      val iterCount = pair._2.size * multiplier
      val expected = pair._2
      val actual = {
        for (_ <- 1 to iterCount) yield PieceChooser.choosePawn(pair._1)
      }.toSet
      assertEquals(expected, actual)
    })
  }

}
