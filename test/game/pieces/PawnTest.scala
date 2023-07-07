package game.pieces

import game.{Neutral, Player, RelativePosition, RelativePositionRange}
import org.junit.jupiter.api.Test

class PawnTest {

  @Test def testCanJumpOver(): Unit = {
    println("canJumpOver")
    val pawn = new PawnImpl
    val msg = "Pawn shouldn't be able to jump over other pieces"
    assert(!pawn.canJumpOver, msg)
  }

  @Test def testCaptureSameAsMove(): Unit = {
    println("captureSameAsMove")
    val pawn = new PawnImpl
    val msg = "Pawn shouldn't capture same as move"
    assert(!pawn.captureSameAsMove, msg)
  }

  private[pieces] class PawnImpl extends Pawn {
    override val affiliation: Player = Neutral
    override val possibleMoves: Set[RelativePositionRange] =
      Set(RelativePositionRange(new RelativePosition(0, 1)))
  }

}
