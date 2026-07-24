package game.pieces

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class PromotedEmpressTest {

  @Test def testAffiliation(): Unit = {
    println("affiliation")
    val pawn = PieceChooser.choosePawn
    val empress = new PromotedEmpress(pawn)
    val expected = pawn.affiliation
    val actual = empress.affiliation
    val message = s"Empress promoted from $pawn should be of same side"
    assertEquals(expected, actual, message)
  }

  @Test def testPossibleMoves(): Unit = {
    println("possibleMoves")
    val pawn = PieceChooser.choosePawn
    val empress = new PromotedEmpress(pawn)
    val expected = Bishop.moves ++ Rook.moves
    val actual = empress.possibleMoves
    assertEquals(expected, actual)
  }

  @Test def testCanJumpOver(): Unit = {
    println("canJumpOver")
    val pawn = PieceChooser.choosePawn
    val empress = new PromotedEmpress(pawn)
    assert(!empress.canJumpOver, "Empress shouldn't be able to jump over")
  }

  @Test def testCaptureSameAsMove(): Unit = {
    println("captureSameAsMove")
    val pawn = PieceChooser.choosePawn
    val empress = new PromotedEmpress(pawn)
    assert(empress.captureSameAsMove,
      "Empress should capture same as she moves")
  }

}
