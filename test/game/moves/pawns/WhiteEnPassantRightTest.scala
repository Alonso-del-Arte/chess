package game.moves.pawns

import game.BoardState
import game.pieces.Piece

import org.junit.jupiter.api.Test

class WhiteEnPassantRightTest {

  @Test def testIsCapture(): Unit = {
    println("isCapture")
    assert(WhiteEnPassantRight.isCapture, "En passant should be capture")
  }

  @Test def testInvolvesPiecesOfSameSide(): Unit = {
    println("involvesPiecesOfSameSide")
    assert(!WhiteEnPassantRight.involvesPiecesOfSameSide,
      "En passant should not involve other pieces of same side")
  }

}
