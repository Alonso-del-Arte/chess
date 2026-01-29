package game

import scala.util.Random

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions._

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

}
