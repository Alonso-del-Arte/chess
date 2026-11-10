package game.moves.pawns

import game.BoardState
import game.pieces.Piece

import org.junit.jupiter.api.Test

class BlackEnPassantLeftTest {

  @Test def testIsCapture(): Unit = {
    println("isCapture")
    assert(BlackEnPassantLeft.isCapture, "En passant should be capture")
  }

  @Test def testInvolvesPiecesOfSameSide(): Unit = {
    println("involvesPiecesOfSameSide")
    assert(!BlackEnPassantLeft.involvesPiecesOfSameSide,
      "En passant should not involve other pieces of same side")
  }

}
