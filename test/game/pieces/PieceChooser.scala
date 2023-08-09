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
  private val whiteOfficerPieces: List[Piece] =
    List(game.pieces.white.QueenSideRook, game.pieces.white.QueenSideKnight,
      game.pieces.white.QueenSideBishop, game.pieces.white.Queen,
      game.pieces.white.King, game.pieces.white.KingSideBishop,
      game.pieces.white.KingSideKnight, game.pieces.white.KingSideRook)
  private val blackOfficerPieces: List[Piece] =
    List(game.pieces.black.QueenSideRook, game.pieces.black.QueenSideKnight,
      game.pieces.black.QueenSideBishop, game.pieces.black.Queen,
      game.pieces.black.King, game.pieces.black.KingSideBishop,
      game.pieces.black.KingSideKnight, game.pieces.black.KingSideRook)
  private val darkGrayOfficerPieces: List[Piece] =
    List(game.pieces.darkgray.Emperor, game.pieces.darkgray.Empress,
      game.pieces.darkgray.PointyHatGuy, game.pieces.darkgray.Horse,
      game.pieces.darkgray.Tower)
  private val lightGrayOfficerPieces: List[Piece] =
    List(game.pieces.lightgray.Emperor, game.pieces.lightgray.Empress,
      game.pieces.lightgray.PointyHatGuy, game.pieces.lightgray.Horse,
      game.pieces.lightgray.Tower)
  private val allOfficerPieces: List[Piece] = whiteOfficerPieces ++
    blackOfficerPieces ++ darkGrayOfficerPieces ++ lightGrayOfficerPieces
  private val mapSidesToOfficerPieces: Map[Player, List[Piece]] =
    Map(White -> whiteOfficerPieces, Black -> blackOfficerPieces,
      DarkGray -> darkGrayOfficerPieces, LightGray -> lightGrayOfficerPieces)

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

  def chooseOfficerPiece(side: Player): Piece = {
    val list = this.mapSidesToOfficerPieces(side)
    list(Random.nextInt(list.size))
  }

  // TODO: Write tests for this
  def choosePiece: Piece = this.choosePawn

  // TODO: Write tests for this
  def choosePiece(side: Player): Piece = this.choosePawn

}
