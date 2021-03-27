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

  @Test def testNotEqualsNull(): Unit = {
    val centipawns = new Centipawns(Random.nextInt(1000))
    assertNotEquals(centipawns, null)
  }

  @Test def testNotEqualsDiffClass(): Unit = {
    val number = Random.nextInt(1000)
    val centipawns = new Centipawns(number)
    val bigInt = BigInt(number)
    assertNotEquals(centipawns, bigInt)
  }

  @Test def testNotEqualsDiffCentipawns(): Unit = {
    val number = Random.nextInt(1000)
    val someCentipawns = new Centipawns(number)
    val diffCentipawns = new Centipawns(number + 1)
    assertNotEquals(someCentipawns, diffCentipawns)
  }

  @Test def testEquals(): Unit = {
    println("equals")
    val number = Random.nextInt(1000)
    val someCentipawns = new Centipawns(number)
    val sameCentipawns = new Centipawns(number)
    assertEquals(someCentipawns, sameCentipawns)
  }

  @Test def testHashCode(): Unit = {
    println("hashCode")
    val expected = (100 to 900 by 100).toSet
    val centipawns = expected.map(new Centipawns(_))
    val actual = centipawns.map(_.hashCode)
    assertEquals(expected, actual)
  }

  @Test def testApply(): Unit = {
    println("apply")
    val number = Random.nextInt(1000) + 1
    val expected = new Centipawns(number)
    val actual = Centipawns(number)
    assertEquals(expected, actual)
  }

}
