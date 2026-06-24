package game.pieces

import game.{Neutral, Player}

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class TowerTest {

  @Test def testPossibleMoves(): Unit = {
    println("possibleMoves")
    val tower = new TowerImpl
    val expected = Rook.moves
    val actual = tower.possibleMoves
    assertEquals(expected, actual)
  }

  @Test def testCanJumpOver(): Unit = {
    println("canJumpOver")
    val tower = new TowerImpl
    assert(!tower.canJumpOver,
      "Tower shouldn't be able to jump over other pieces")
  }

  @Test def testCaptureSameAsMove(): Unit = {
    println("captureSameAsMove")
    val tower = new TowerImpl
    assert(tower.captureSameAsMove, "A tower captures same as moves")
  }

  @Test def testPossibleCaptures(): Unit = {
    println("possibleCaptures")
    val tower = new TowerImpl
    val expected = tower.possibleMoves
    val actual = tower.possibleCaptures
    assertEquals(expected, actual)
  }

  @Test def testHasSpecialMoves(): Unit = {
    println("hasSpecialMoves")
    val tower = new TowerImpl
    val msg = "Tower can't initiate special move of castling"
    assert(!tower.hasSpecialMoves, msg)
  }

  @Test def testCouldCastle(): Unit = {
    println("couldCastle")
    val tower = new TowerImpl
    assert(tower.couldCastle, "Tower should be potential castling participant")
  }

  private class TowerImpl extends Tower {
    override val affiliation: Player = Neutral

  }

}
