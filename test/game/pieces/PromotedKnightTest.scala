package game.pieces

import game.{Black, White}

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions._

class PromotedKnightTest {

  @Test def testAffiliation(): Unit = {
    println("affiliation")
    val promotedKnightWhite = new PromotedKnight(PieceChooser.choosePawn(White))
    val promotedKnightBlack = new PromotedKnight(PieceChooser.choosePawn(Black))
    assertEquals(White, promotedKnightWhite.affiliation)
    assertEquals(Black, promotedKnightBlack.affiliation)
  }

  // TODO: Write possible moves test

  @Test def testCanJumpOver(): Unit = {
    println("canJumpOver")
    val knight = new PromotedKnight(PieceChooser.choosePawn)
    val msg = "Knight should be able to jump over"
    assert(knight.canJumpOver, msg)
  }

  @Test def testCaptureSameAsMove(): Unit = {
    println("captureSameAsMove")
    val knight = new PromotedKnight(PieceChooser.choosePawn)
    val msg = "Knight should capture same as move"
    assert(knight.captureSameAsMove, msg)
  }

  // TODO: Write possible captures test

}
