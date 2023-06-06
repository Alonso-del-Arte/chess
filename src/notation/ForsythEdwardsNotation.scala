package notation

import game.{BoardState, InitialBoardState, RegularBoard, RegularPosition}

object ForsythEdwardsNotation {

  // TODO: Write tests for other board states
  def parseFEN(s: String): ForsythEdwardsNotation =
    new ForsythEdwardsNotation(InitialBoardState)

}

class ForsythEdwardsNotation(val state: BoardState) {

}
