package game.moves

import game.{BoardState, PositionImpl, RelativePositionRange}
import game.pieces.{Piece, PieceChooser}

import org.junit.jupiter.api.Test

import scala.util.Random

class EnPassantTest {

  @Test def testIsCapture(): Unit = {
    println("isCapture")
    assert(EnPassantImpl.isCapture, "En passant should be capture")
  }

  @Test def testInvolvesPiecesOfSameSide(): Unit = {
    println("involvesPiecesOfSameSide")
    assert(!EnPassantImpl.involvesPiecesOfSameSide,
      "En passant should not involve other pieces of same side")
  }

  private object EnPassantImpl extends EnPassant {
    override def meetsPrerequisites(boardState: BoardState, piece: Piece,
                                    secondPiece: Piece): Boolean = true

    override def execute(boardState: BoardState, piece: Piece,
                         secondPiece: Piece): BoardState =
      game.InitialBoardState

  }

}
