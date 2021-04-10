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

  @Test def testReferentialEquality(): Unit = {
    val x = Random.nextInt(16) - 8
    val y = Random.nextInt(16) - 8
    val position = new RelativePosition(x, y)
    assertEquals(position, position)
  }

  @Test def testNotEqualsNull(): Unit = {
    val x = Random.nextInt(16) - 8
    val y = Random.nextInt(16) - 8
    val position = new RelativePosition(x, y)
    assertNotEquals(position, null)
  }

  @Test def testNotEqualsDiffClass(): Unit = {
    val x = Random.nextInt(16) - 8
    val y = Random.nextInt(16) - 8
    val relativePosition = new RelativePosition(x, y)
    val absolutePosition = new PositionImpl(x, y)
    assertNotEquals(relativePosition, absolutePosition)
  }

  @Test def testNotEqualsDiffX(): Unit = {
    val x = Random.nextInt(16) - 8
    val y = Random.nextInt(16) - 8
    val positionA = new RelativePosition(x, y)
    val positionB = new RelativePosition(x + 1, y)
    assertNotEquals(positionA, positionB)
  }

  @Test def testNotEqualsDiffY(): Unit = {
    val x = Random.nextInt(16) - 8
    val y = Random.nextInt(16) - 8
    val positionA = new RelativePosition(x, y)
    val positionB = new RelativePosition(x, y + 1)
    assertNotEquals(positionA, positionB)
  }

  @Test def testEquals(): Unit = {
    println("equals")
    val x = Random.nextInt(16) - 8
    val y = Random.nextInt(16) - 8
    val somePosition = new RelativePosition(x, y)
    val samePosition = new RelativePosition(x, y)
    assertEquals(somePosition, samePosition)
  }

  @Test def testHashCode(): Unit = {
    println("hashCode")
    var positions: Set[RelativePosition] = Set()
    var hashes: Set[Int] = Set()
    for (x <- -32 to 31) {
      for (y <- -32 to 31) {
        val position = new RelativePosition(x, y)
        positions += position
        hashes += position.hashCode
      }
    }
    val msg = "Set of positions should be the same size as set of hash codes"
    assertEquals(positions.size, hashes.size, msg)
  }

  @Test def testAbs(): Unit = {
    println("abs")
    for (x <- 0 to 15) {
      for (y <- 0 to 15) {
        val expected = x * x + y * y
        val northWest = new RelativePosition(-x, y)
        val northEast = new RelativePosition(x, y)
        val southWest = new RelativePosition(-x, -y)
        val southEast = new RelativePosition(x, -y)
        assertEquals(expected, northWest.abs)
        assertEquals(expected, northEast.abs)
        assertEquals(expected, southWest.abs)
        assertEquals(expected, southEast.abs)
      }
    }
  }

}
