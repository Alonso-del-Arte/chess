package game.pieces.black

import game.{Black, RelativePositionRange}

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions._

class BlackPieceTest {

  @Test def testAffiliation(): Unit = {
    println("affiliation")
    val piece = new BlackPieceImpl
    val actual = piece.affiliation
    assertEquals(Black, actual)
  }

  import game.pieces.Piece

  private class BlackPieceImpl extends Piece with BlackPiece {
    override val possibleMoves: Set[RelativePositionRange] = Set()

  }

}
