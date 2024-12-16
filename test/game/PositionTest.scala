package game

import scala.util.Random

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions._

class PositionTest {

  private class ExtraPositionImpl(x: Int, y: Int) extends Position(x, y) {

    override def isOffsetWithinBounds(offset: RelativePosition,
                                      board: Board): Boolean = true

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

  @Test def testNotEqualsNull(): Unit = {
    val x = Random.nextInt(4096) - 2048
    val y = Random.nextInt(4096) - 2048
    val position = new PositionImpl(x, y)
    assertNotEquals(position, null)
  }

  @Test def testNotEqualsDiffClass(): Unit = {
    val x = Random.nextInt(4096) - 2048
    val y = Random.nextInt(4096) - 2048
    val positionClassA = new PositionImpl(x, y)
    val positionClassB = new ExtraPositionImpl(x, y)
    assertNotEquals(positionClassA, positionClassB)
  }

  @Test def testNotEqualsDiffX(): Unit = {
    val x = Random.nextInt(4096) - 2048
    val y = Random.nextInt(4096) - 2048
    val positionA = new PositionImpl(x, y)
    val positionB = new PositionImpl(x + 1, y)
    assertNotEquals(positionA, positionB)
  }

  @Test def testNotEqualsDiffY(): Unit = {
    val x = Random.nextInt(4096) - 2048
    val y = Random.nextInt(4096) - 2048
    val positionA = new PositionImpl(x, y)
    val positionB = new PositionImpl(x, y + 1)
    assertNotEquals(positionA, positionB)
  }

  @Test def testEquals(): Unit = {
    println("equals")
    val x = Random.nextInt(4096) - 2048
    val y = Random.nextInt(4096) - 2048
    val somePosition = new PositionImpl(x, y)
    val samePosition = new PositionImpl(x, y)
    assertEquals(somePosition, samePosition)
  }

  @Test def testHashCode(): Unit = {
    println("hashCode")
    var positions: Set[PositionImpl] = Set()
    var hashes: Set[Int] = Set()
    for (x <- 1 to 8) {
      for (y <- 1 to 8) {
        val position = new PositionImpl(x, y)
        positions += position
        hashes += position.hashCode
      }
    }
    val msg = "Set of positions should be the same size as set of hash codes"
    assertEquals(positions.size, hashes.size, msg)
  }

  @Test def testDifferentClassDifferentHashCode(): Unit = {
    val x = Random.nextInt(4096) - 2048
    val y = Random.nextInt(4096) - 2048
    val positionClassA = new PositionImpl(x, y)
    val positionClassB = new ExtraPositionImpl(x, y)
    assertNotEquals(positionClassA.hashCode, positionClassB.hashCode)
  }

}
