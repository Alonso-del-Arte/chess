package game.pieces

import game.{DarkGray, LightGray, ShortMoveRanges}

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class PromotedEmperorTest {

  @Test def testAffiliation(): Unit = {
    println("affiliation")
    val promotedEmperorDark =
      new PromotedEmperor(PieceChooser.choosePawn(DarkGray))
    val promotedEmperorLight =
      new PromotedEmperor(PieceChooser.choosePawn(LightGray))
    assertEquals(DarkGray, promotedEmperorDark.affiliation,
      s"Affiliation of $promotedEmperorDark should be $DarkGray")
    assertEquals(LightGray, promotedEmperorLight.affiliation,
      s"Affiliation of $promotedEmperorLight should be $LightGray")
  }

  @Test def testPossibleMoves(): Unit = {
    println("possibleMoves")
    val pawn = PieceChooser.choosePawn
    val emperor = new PromotedEmperor(pawn)
    val expected = Set(ShortMoveRanges.moveForward, ShortMoveRanges.moveRight,
        ShortMoveRanges.moveBack, ShortMoveRanges.moveLeft,
        ShortMoveRanges.moveNortheast, ShortMoveRanges.moveNorthwest,
        ShortMoveRanges.moveSouthwest, ShortMoveRanges.moveSoutheast)
    val actual = emperor.possibleMoves
    assertEquals(expected, actual)
  }

  @Test def testCanJumpOver(): Unit = {
    println("captureSameAsMove")
    val pawn = PieceChooser.choosePawn
    val emperor = new PromotedEmperor(pawn)
    assert(!emperor.canJumpOver, "An emperor shouldn't be able to jump over")
  }

  @Test def testCaptureSameAsMove(): Unit = {
    println("captureSameAsMove")
    val pawn = PieceChooser.choosePawn
    val emperor = new PromotedEmperor(pawn)
    assert(emperor.captureSameAsMove, "An emperor captures same as he moves")
  }

  @Test def testPossibleCaptures(): Unit = {
    println("possibleCaptures")
    val pawn = PieceChooser.choosePawn
    val emperor = new PromotedEmperor(pawn)
    val expected = emperor.possibleMoves
    val actual = emperor.possibleCaptures
    assertEquals(expected, actual)
  }

  @Test def testHasSpecialMoves(): Unit = {
    println("hasSpecialMoves")
    val pawn = PieceChooser.choosePawn
    val emperor = new PromotedEmperor(pawn)
    assert(emperor.hasSpecialMoves, "Emperor has special move of castling")
  }

  @Test def testPrior(): Unit = {
    println("prior")
    val expected = PieceChooser.choosePawn
    val emperor = new PromotedEmperor(expected)
    val actual = emperor.prior
    assertEquals(expected, actual)
  }

}
