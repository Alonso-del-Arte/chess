package game.pieces

import game.{Neutral, Player}

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class PointyHatGuyTest {

  @Test def testPossibleMoves(): Unit = {
    println("possibleMoves")
    val pointyHatGuy = new PointyHatGuyImpl
    val expected = Bishop.moves
    val actual = pointyHatGuy.possibleMoves
    assertEquals(expected, actual)
  }

  @Test def testCanJumpOver(): Unit = {
    println("canJumpOver")
    val pointyHatGuy = new PointyHatGuyImpl
    assert(!pointyHatGuy.canJumpOver,
      "Pointy hat guy shouldn't be able to jump over other pieces")
  }

  @Test def testCaptureSameAsMove(): Unit = {
    println("captureSameAsMove")
    val pointyHatGuy = new PointyHatGuyImpl
    assert(pointyHatGuy.captureSameAsMove,
      "A pointy hat guy captures same as moves")
  }

  @Test def testPossibleCaptures(): Unit = {
    println("possibleCaptures")
    val pointyHatGuy = new PointyHatGuyImpl
    val expected = pointyHatGuy.possibleMoves
    val actual = pointyHatGuy.possibleCaptures
    assertEquals(expected, actual)
  }

  @Test def testHasSpecialMoves(): Unit = {
    println("hasSpecialMoves")
    val pointyHatGuy = new PointyHatGuyImpl
    assert(!pointyHatGuy.hasSpecialMoves,
      "Pointy hat guy shouldn't have special moves")
  }

  private class PointyHatGuyImpl extends PointyHatGuy {
    override val affiliation: Player = Neutral

  }

}
