package game.pieces.lightgray

import game.LightGray
import game.pieces.{PieceChooser, Rook}

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class PromotedTowerTest {

  @Test def testAffiliation(): Unit = {
    println("affiliation")
    val expected = LightGray
    val pawn = PieceChooser.choosePawn(expected)
    val tower = new PromotedTower(pawn)
    val actual = tower.affiliation
    assertEquals(expected, actual)
  }

  @Test def testPossibleMoves(): Unit = {
    println("possibleMoves")
    val pawn = PieceChooser.choosePawn(LightGray)
    val tower = new PromotedTower(pawn)
    val expected = Rook.moves
    val actual = tower.possibleMoves
    assertEquals(expected, actual)
  }

  @Test def testCanJumpOver(): Unit = {
    println("canJumpOver")
    val pawn = PieceChooser.choosePawn(LightGray)
    val tower = new PromotedTower(pawn)
    assert(!tower.canJumpOver, "Tower shouldn't be able to jump over")
  }

  @Test def testCaptureSameAsMove(): Unit = {
    println("captureSameAsMove")
    val pawn = PieceChooser.choosePawn(LightGray)
    val tower = new PromotedTower(pawn)
    assert(tower.captureSameAsMove, "Tower should capture same as move")
  }

  @Test def testPossibleCaptures(): Unit = {
    println("possibleCaptures")
    val pawn = PieceChooser.choosePawn(LightGray)
    val tower = new PromotedTower(pawn)
    val expected = tower.possibleMoves
    val actual = tower.possibleCaptures
    assertEquals(expected, actual)
  }

  @Test def testCouldCastle(): Unit = {
    println("couldCastle")
    val pawn = PieceChooser.choosePawn(LightGray)
    val tower = new PromotedTower(pawn)
    assert(!tower.couldCastle, "Promoted tower shouldn't be able to castle")
  }

  @Test def testPrior(): Unit = {
    println("prior")
    val expected = PieceChooser.choosePawn(LightGray)
    val tower = new PromotedTower(expected)
    val actual = tower.prior
    assertEquals(expected, actual)
  }

}
