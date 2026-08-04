package game.pieces

import game.{Neutral, Player}

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class HorseTest {

  @Test def testPossibleMoves(): Unit = {
    println("possibleMoves")
    val horse = new HorseImpl
    val expected = Knight.moves
    val actual = horse.possibleMoves
    assertEquals(expected, actual)
  }

  @Test def testCanJumpOver(): Unit = {
    println("canJumpOver")
    val horse = new HorseImpl
    assert(horse.canJumpOver, "Horse should be able to jump over other pieces")
  }

  @Test def testCaptureSameAsMove(): Unit = {
    println("captureSameAsMove")
    val horse = new HorseImpl
    assert(horse.captureSameAsMove, "A horse captures same as moves")
  }

  @Test def testPossibleCaptures(): Unit = {
    println("possibleCaptures")
    val horse = new HorseImpl
    val expected = horse.possibleMoves
    val actual = horse.possibleCaptures
    assertEquals(expected, actual)
  }

  @Test def testHasSpecialMoves(): Unit = {
    println("hasSpecialMoves")
    val horse = new HorseImpl
        assert(!horse.hasSpecialMoves, "A horse doesn't have special moves")
  }

  private class HorseImpl extends Horse {
    override val affiliation: Player = Neutral

  }

}
