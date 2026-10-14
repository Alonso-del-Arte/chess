package game.moves

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions._

class BlackEnPassantTest {

  // TODO: Write tests for meetsPrerequisites

  @Test def testIsCapture(): Unit = {
    println("isCapture")
    assert(BlackEnPassant.isCapture, "En passant should be capture")
  }

  @Test def testInvolvesPiecesOfSameSide(): Unit = {
    println("involvesPiecesOfSameSide")
    assert(!BlackEnPassant.involvesPiecesOfSameSide,
      "En passant should not involve other pieces of same side")
  }

}
