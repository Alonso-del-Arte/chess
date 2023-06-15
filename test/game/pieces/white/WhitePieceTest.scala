package game.pieces.white

import game.{RelativePosition, RelativePositionRange, White}
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions._

class WhitePieceTest {

  @Test def testAffiliation(): Unit = {
    println("affiliation")
    assertEquals(White, WhitePieceImpl.affiliation)
  }

  private object WhitePieceImpl extends WhitePiece {
    override val possibleMoves: Set[RelativePositionRange]
      = Set(RelativePositionRange(new RelativePosition(0, 0)))
  }

}
