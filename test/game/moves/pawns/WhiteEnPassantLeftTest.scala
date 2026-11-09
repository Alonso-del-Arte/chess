package game.moves.pawns

import game.BoardState
import game.pieces.Piece

import org.junit.jupiter.api.Test

class WhiteEnPassantLeftTest {

  @Test def testIsCapture(): Unit = {
    println("isCapture")
    assert(WhiteEnPassantLeft.isCapture, "En passant should be capture")
  }

}
