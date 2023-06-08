package game.pieces.white

import game.{RelativePosition, RelativePositionRange}
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions._

class KingPawnTest {

  @Test def testPossibleMoves(): Unit = {
    val expected = Set(RelativePositionRange(new RelativePosition(0, 1)))
  }

}
