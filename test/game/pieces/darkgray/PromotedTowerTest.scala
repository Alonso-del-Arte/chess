package game.pieces.darkgray

import game.DarkGray
import game.pieces.{PieceChooser, Rook}

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class PromotedTowerTest {

  @Test def testAffiliation(): Unit = {
    println("affiliation")
    val expected = DarkGray
    val pawn = PieceChooser.choosePawn(expected)
    val tower = new PromotedTower(pawn)
    val actual = tower.affiliation
    assertEquals(expected, actual)
  }

  @Test def testPossibleMoves(): Unit = {
    println("possibleMoves")
    val pawn = PieceChooser.choosePawn(DarkGray)
    val tower = new PromotedTower(pawn)
    val expected = Rook.moves
    val actual = tower.possibleMoves
    assertEquals(expected, actual)
  }

  @Test def testCanJumpOver(): Unit = {
    println("canJumpOver")
    val pawn = PieceChooser.choosePawn(DarkGray)
    val tower = new PromotedTower(pawn)
    assert(!tower.canJumpOver, "Tower shouldn't be able to jump over")
  }

}
