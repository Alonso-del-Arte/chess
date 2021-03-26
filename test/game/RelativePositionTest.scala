package game

import scala.util.Random

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions._

class RelativePositionTest {

  @Test def testToString(): Unit = {
    println("toString")
    val x = Random.nextInt(16) - 8
    val y = Random.nextInt(16) - 8
    val position = new RelativePosition(x, y)
    val expected = s"($x,$y)"
    val actual = position.toString.replace(" ", "")
    assertEquals(expected, actual)
  }

}
