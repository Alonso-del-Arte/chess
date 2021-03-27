package analysis

import scala.util.Random

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions._

class CentipawnsTest {

  @Test def testToStringOneCentipawn(): Unit = {
    val oneCP = new Centipawns(1)
    val expected = "1 centipawn"
    val actual = oneCP.toString
    assertEquals(expected, actual)
  }

  @Test def testToString(): Unit = {
    println("toString")
    val number = Random.nextInt(1000) + 2
    val centipawns = new Centipawns(number)
    val expected = s"${number}centipawns"
    val actual = centipawns.toString.replace(" ", "")
    assertEquals(expected, actual)
  }

  @Test def testReferentialEquality(): Unit = {
    val centipawns = new Centipawns(Random.nextInt(1000))
    assertEquals(centipawns, centipawns)
  }

  @Test def testApply(): Unit = {
    println("apply")
    fail("Haven't written test yet")
  }

}
