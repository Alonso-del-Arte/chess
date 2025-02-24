package game.pieces

import game.{Black, DarkGray, LightGray, Player, White}

import scala.util.Random

object PieceChooser {
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
    List(game.pieces.lightgray.EmperorsPawn,
      game.pieces.lightgray.EmpressesPawn,
      game.pieces.lightgray.PointyHatGuysPawn, game.pieces.lightgray.HorsesPawn,
      game.pieces.lightgray.TowersPawn)
  private val allPawns: List[Pawn] = whitePawns ++ blackPawns ++
    darkGrayPawns ++ lightGrayPawns
  private val totalNumberOfPawns: Int = this.allPawns.size
  private val mapSidesToPawns: Map[Player, List[Pawn]] =
    Map(White -> whitePawns, Black -> blackPawns, DarkGray -> darkGrayPawns,
      LightGray -> lightGrayPawns)
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
  private val totalNumberOfOfficerPieces: Int = this.allOfficerPieces.size
  private val mapSidesToOfficerPieces: Map[Player, List[Piece]] =
    Map(White -> whiteOfficerPieces, Black -> blackOfficerPieces,
      DarkGray -> darkGrayOfficerPieces, LightGray -> lightGrayOfficerPieces)
  private val allPieces: List[Piece] = allPawns ++ allOfficerPieces
  private val mapSidesToPieces: Map[Player, List[Piece]] =
    Map(White -> (whitePawns ++ whiteOfficerPieces),
      Black -> (blackPawns ++ blackOfficerPieces),
      DarkGray -> (darkGrayPawns ++ darkGrayOfficerPieces),
      LightGray -> (lightGrayPawns ++ lightGrayOfficerPieces))

  def choosePawn: Pawn = {
    this.allPawns(Random.nextInt(this.totalNumberOfPawns))
  }

  def choosePawn(side: Player): Pawn = {
    val list = this.mapSidesToPawns(side)
    list(Random.nextInt(list.size))
  }

  def chooseOfficerPiece: Piece = {
    this.allOfficerPieces(Random.nextInt(this.totalNumberOfOfficerPieces))
  }

  def chooseOfficerPiece(side: Player): Piece = {
    val list = this.mapSidesToOfficerPieces(side)
    list(Random.nextInt(list.size))
  }

  def choosePiece: Piece = {
    this.allPieces(Random.nextInt(this.allPieces.size))
  }

  def choosePiece(side: Player): Piece = {
    val list = this.mapSidesToPieces(side)
    list(Random.nextInt(list.size))
  }

}
