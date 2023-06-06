package game.pieces

import game.{Neutral, Player, RelativePosition, RelativePositionRange}
import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class PawnTest {

  @Test def testCanJumpOver(): Unit = {
    println("canJumpOver")
    val pawn = new PawnImpl
    assert(!pawn.canJumpOver,
      "Pawn shouldn't be able to jump over other pieces")
  }

  private class PawnImpl extends Pawn {
    override val affiliation: Player = Neutral
    override val possibleMoves: Set[RelativePositionRange] =
      Set(RelativePositionRange(new RelativePosition(0, 1)))
  }

}
