package ui.graphical

import game.{Black, RegularPosition, White}

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

/**
 * Tests of the RegularBoardInspector class.
 * @author Alonso del Arte
 */
class RegularBoardInspectorTest {

  @Test def testGetCoordsForWhite(): Unit = {
    RegularBoardInspector.side = White
    for (rank <- 0 to 7) {
      val x = rank * RegularBoardInspector.individualSidePixelLength
      for (file <- 0 to 7) {
        val y = (7 - file) * RegularBoardInspector.individualSidePixelLength
        val position = new RegularPosition(rank + 1, file + 1)
        val expected = (x, y)
        val actual = RegularBoardInspector.getCoords(position)
        assertEquals(expected, actual)
      }
    }
  }

  @Test def testGetCoordsForBlack(): Unit = {
    RegularBoardInspector.side = Black
    for (rank <- 0 to 7) {
      val x = (7 - rank) * RegularBoardInspector.individualSidePixelLength
      for (file <- 0 to 7) {
        val y = file * RegularBoardInspector.individualSidePixelLength
        val position = new RegularPosition(rank + 1, file + 1)
        val expected = (x, y)
        val actual = RegularBoardInspector.getCoords(position)
        assertEquals(expected, actual)
      }
    }
  }

}
