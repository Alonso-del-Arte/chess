package notation

import game.{BoardState, RegularBoard, RegularPosition}

object ForsythEdwardsNotation {

  def parseFEN(s: String): ForsythEdwardsNotation = {
    val boardState = new BoardState(RegularBoard, game.Black,
      Map(new RegularPosition(1, 1) -> game.pieces.white.QueenSideRook,
      new RegularPosition(2, 1) -> game.pieces.white.QueenSideKnight))
    new ForsythEdwardsNotation(boardState)
  }

}

class ForsythEdwardsNotation(val state: BoardState) {

}
