package game.pieces

import game.{Black, DarkGray, LightGray, Player, RelativePositionRange, White}

import scala.util.Random

object PieceChooser {
  private val allSides: List[Player] = List(White, Black, DarkGray, LightGray)
  private val whitePawns: List[Pawn] = List(game.pieces.white.QueenSideRookPawn,
    game.pieces.white.QueenSideKnightPawn,
    game.pieces.white.QueenSideBishopPawn, game.pieces.white.QueenPawn,
    game.pieces.white.KingPawn, game.pieces.white.KingSideBishopPawn,
    game.pieces.white.KingSideKnightPawn, game.pieces.white.KingSideRookPawn)
  private val blackPawns: List[Pawn] = List(game.pieces.black.QueenSideRookPawn,
    game.pieces.black.QueenSideKnightPawn,
    game.pieces.black.QueenSideBishopPawn, game.pieces.black.QueenPawn,
    game.pieces.black.KingPawn, game.pieces.black.KingSideBishopPawn,
    game.pieces.black.KingSideKnightPawn, game.pieces.black.KingSideRookPawn)
  private val darkGrayPawns: List[Pawn] =
    List(game.pieces.darkgray.EmperorsPawn, game.pieces.darkgray.EmpressesPawn,
      game.pieces.darkgray.PointyHatGuysPawn, game.pieces.darkgray.HorsesPawn,
      game.pieces.darkgray.TowersPawn)
  private val lightGrayPawns: List[Pawn] =
    List(game.pieces.lightgray.EmperorsPawn, game.pieces.lightgray.EmpressesPawn,
      game.pieces.lightgray.PointyHatGuysPawn, game.pieces.lightgray.HorsesPawn,
      game.pieces.lightgray.TowersPawn)
  private val mapSidesToPawns: Map[Player, List[Pawn]] = Map(White -> whitePawns,
    Black -> blackPawns, DarkGray -> darkGrayPawns, LightGray -> lightGrayPawns)

  def choosePawn: Pawn = {
    val side = this.allSides(Random.nextInt(this.allSides.size))
    this.choosePawn(side)
  }

  def choosePawn(side: Player): Pawn = {
    val list = this.mapSidesToPawns(side)
    list(Random.nextInt(list.size))
  }

  // TODO: Write tests for this
  def chooseOfficerPiece: Piece = this.choosePawn

  // TODO: Write tests for this
  def chooseOfficerPiece(side: Player): Piece = this.choosePawn

  // TODO: Write tests for this
  def choosePiece: Piece = this.choosePawn

  // TODO: Write tests for this
  def choosePiece(side: Player): Piece = this.choosePawn

}
