package game.moves

import game.{BoardState, PositionImpl, RelativePositionRange}
import game.pieces.{Piece, PieceChooser}

import org.junit.jupiter.api.Test

import scala.util.Random

class CastlingTest {

  // TODO: Test meetsPrerequisites()

  @Test def testIsCapture(): Unit = {
    println("isCapture")
    assert(!CastlingImpl.isCapture, "Casting should not be capture")
  }

  @Test def testInvolvesPiecesOfSameSide(): Unit = {
    println("involvesPiecesOfSameSide")
    assert(CastlingImpl.involvesPiecesOfSameSide,
      "Castling should involve another piece of the same side")
  }

  // TODO: Test execute()

  private object CastlingImpl extends Castling {

    //

  }

}
