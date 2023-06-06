package notation

import game.{BoardState, InitialBoardState}

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions._

class ForsythEdwardsNotationTest {

  @Test
  def testParseFENInitialBoardState(): Unit = {
    val s = "rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w KQkq - 0 1"
    val expected = InitialBoardState
    val actual = ForsythEdwardsNotation.parseFEN(s).state
    assertEquals(expected, actual)
  }

}
