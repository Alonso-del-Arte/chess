package game

import scala.util.Random

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions._

class PositionImplTest {

  @Test def testTranslate(): Unit = {
    println("translate")
    val x = Random.nextInt(8) + 1
    val y = Random.nextInt(8) + 1
    val instance = new PositionImpl(x, y)
    val offsetX = Random.nextInt(8) - 4
    val offsetY = Random.nextInt(8) - 4
    val offset = new RelativePosition(offsetX, offsetY)
    val expected = new PositionImpl(x + offsetX, y + offsetY)
    val actual = instance.translate(offset)
    val message = s"Translating $instance by $offset"
    assertEquals(expected, actual, message)
  }

}
