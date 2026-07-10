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

  @Test def testPossibleMoves(): Unit = {
    println("possibleMoves")
    val expected = Bishop.moves
    val actual = PointyHatGuy.possibleMoves
    assertEquals(expected, actual)
  }

  @Test def testCanJumpOver(): Unit = {
    println("canJumpOver")
    assert(!PointyHatGuy.canJumpOver,
      "Pointy hat guy shouldn't be able to jump over other pieces")
  }

}
