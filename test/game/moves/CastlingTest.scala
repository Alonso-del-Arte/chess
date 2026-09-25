package game.moves

import game.{BoardState, PositionImpl, RelativePositionRange}
import game.pieces.{Piece, PieceChooser}

import org.junit.jupiter.api.Test

import scala.util.Random

class CastlingTest {

  // TODO: Test meetsPrerequisites()

  @Test def testIsCapture(): Unit = {
    assert(!Castling.isCapture, "Casting should not be capture")
  }

  // TODO: Test execute()

}
