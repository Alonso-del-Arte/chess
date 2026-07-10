package game.pieces.lightgray

import game.LightGray
import game.pieces.Bishop

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class PointyHatGuyTest {

  @Test def testAffiliation(): Unit = {
    println("affiliation")
    assertEquals(LightGray, PointyHatGuy.affiliation)
  }

}
