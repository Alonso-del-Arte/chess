package game

object InitialBoardState extends BoardState(RegularBoard, White,
  Map(new RegularPosition(1, 1) -> game.pieces.white.QueenSideRook,
    new RegularPosition(2, 1) -> game.pieces.white.QueenSideKnight,
    new RegularPosition(3, 1) -> game.pieces.white.QueenSideBishop,
    new RegularPosition(4, 1) -> game.pieces.white.Queen,
    new RegularPosition(5, 1) -> game.pieces.white.King,
    new RegularPosition(6, 1) -> game.pieces.white.KingSideBishop,
    new RegularPosition(7, 1) -> game.pieces.white.KingSideKnight,
    new RegularPosition(8, 1) -> game.pieces.white.KingSideRook,
    new RegularPosition(1, 2) -> game.pieces.white.QueenSideRookPawn,
    new RegularPosition(2, 2) -> game.pieces.white.QueenSideKnightPawn,
    new RegularPosition(3, 2) -> game.pieces.white.QueenSideBishopPawn,
    new RegularPosition(4, 2) -> game.pieces.white.QueenPawn,
    new RegularPosition(5, 2) -> game.pieces.white.KingPawn,
    new RegularPosition(6, 2) -> game.pieces.white.KingSideBishopPawn,
    new RegularPosition(7, 2) -> game.pieces.white.KingSideKnightPawn,
    new RegularPosition(8, 2) -> game.pieces.white.KingSideRookPawn,
    new RegularPosition(1, 7) -> game.pieces.black.QueenSideRookPawn,
    new RegularPosition(2, 7) -> game.pieces.black.QueenSideKnightPawn,
    new RegularPosition(3, 7) -> game.pieces.black.QueenSideBishopPawn,
    new RegularPosition(4, 7) -> game.pieces.black.QueenPawn,
    new RegularPosition(5, 7) -> game.pieces.black.KingPawn,
    new RegularPosition(6, 7) -> game.pieces.black.KingSideBishopPawn,
    new RegularPosition(7, 7) -> game.pieces.black.KingSideKnightPawn,
    new RegularPosition(8, 7) -> game.pieces.black.KingSideRookPawn,
    new RegularPosition(1, 8) -> game.pieces.black.QueenSideRook,
    new RegularPosition(2, 8) -> game.pieces.black.QueenSideKnight,
    new RegularPosition(3, 8) -> game.pieces.black.QueenSideBishop,
    new RegularPosition(4, 8) -> game.pieces.black.Queen,
    new RegularPosition(5, 8) -> game.pieces.black.King,
    new RegularPosition(6, 8) -> game.pieces.black.KingSideBishop,
    new RegularPosition(7, 8) -> game.pieces.black.KingSideKnight,
    new RegularPosition(8, 8) -> game.pieces.black.KingSideRook)) {

  /**
   * Gives the number of plies in the game so far.
   * @return Always 0.
   */
  override def plyCount: Int = 0

  // TODO: Write tests for this
  override def moveCount: Int = -1

}
