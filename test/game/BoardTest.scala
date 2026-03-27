package game

import java.awt.Color

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions._

import scala.util.Random

class BoardTest {

  @Test def testContains(): Unit = {
    println("contains")
    val maxX = Random.nextInt(24) + 16
    val maxY = Random.nextInt(24) + 16
    val board = new BoardImpl(maxX, maxY)
    val x = Random.nextInt(maxX) + 1
    val y = Random.nextInt(maxY) + 1
    val position = new PositionImpl(x, y)
    val msg = s"$maxX by $maxY board should contain $position"
    assert(board.contains(position), msg)
  }

  @Test def testDoesNotContainTooFarDown(): Unit = {
    val maxX = Random.nextInt(24) + 16
    val maxY = Random.nextInt(24) + 16
    val board = new BoardImpl(maxX, maxY)
    val x = Random.nextInt(maxX) + 1
    val y = -Random.nextInt(maxY)
    val position = new PositionImpl(x, y)
    val msg = s"$maxX by $maxY board should not contain $position"
    assert(!board.contains(position), msg)
  }

  @Test def testDoesNotContainTooFarLeft(): Unit = {
    val maxX = Random.nextInt(24) + 16
    val maxY = Random.nextInt(24) + 16
    val board = new BoardImpl(maxX, maxY)
    val x = -Random.nextInt(maxX)
    val y = Random.nextInt(maxY) + 1
    val position = new PositionImpl(x, y)
    val msg = s"$maxX by $maxY board should not contain $position"
    assert(!board.contains(position), msg)
  }

  @Test def testDoesNotContainTooFarUp(): Unit = {
    val maxX = Random.nextInt(24) + 16
    val maxY = Random.nextInt(24) + 16
    val board = new BoardImpl(maxX, maxY)
    val x = Random.nextInt(maxX) + 1
    val y = maxY + Random.nextInt(maxY) + 1
    val position = new PositionImpl(x, y)
    val msg = s"$maxX by $maxY board should not contain $position"
    assert(!board.contains(position), msg)
  }

  @Test def testDoesNotContainTooFarRight(): Unit = {
    val maxX = Random.nextInt(24) + 16
    val maxY = Random.nextInt(24) + 16
    val board = new BoardImpl(maxX, maxY)
    val x = maxX + Random.nextInt(maxX) + 1
    val y = Random.nextInt(maxY) + 1
    val position = new PositionImpl(x, y)
    val msg = s"$maxX by $maxY board should not contain $position"
    assert(!board.contains(position), msg)
  }

  @Test def testGetColor(): Unit = {
    println("getColor")
    val maxX = Random.nextInt(24) + 16
    val maxY = Random.nextInt(24) + 16
    val board = new BoardImpl(maxX, maxY)
    for (x <- 1 to maxX) {
      for (y <- 1 to maxY) {
        val position = new PositionImpl(x, y)
        val expected = if ((x + y) % 2 == 0) Color.BLACK else Color.WHITE
        val actual = board.getColor(position)
        val msg = s"$position should be $expected"
        assertEquals(expected, actual, msg)
      }
    }
  }

}
