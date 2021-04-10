package game

import scala.util.Random

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions._

class PositionTest {

  class ExtraPositionImpl(x: Int, y: Int) extends Position(x, y) {

    override def translate(offset: RelativePosition): Position =
      new ExtraPositionImpl(this.x + offset.offsetX, this.y + offset.offsetY)

  }

  @Test def testToString(): Unit = {
    println("toString")
    val x = Random.nextInt(4096) - 2048
    val y = Random.nextInt(4096) - 2048
    val position = new PositionImpl(x, y)
    val expected = s"($x,$y)"
    val actual = position.toString.replace(" ", "")
    assertEquals(expected, actual)
  }

  @Test def testReferentialEquality(): Unit = {
    val x = Random.nextInt(4096) - 2048
    val y = Random.nextInt(4096) - 2048
    val position = new PositionImpl(x, y)
    assertEquals(position, position)
  }

}
