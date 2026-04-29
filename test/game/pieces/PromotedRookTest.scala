package game.pieces

import game.{Black, RelativePosition, RelativePositionRange, White}

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions._

class PromotedRookTest {

  @Test def testAffiliation(): Unit = {
    println("affiliation")
    val promotedRookWhite = new PromotedRook(PieceChooser.choosePawn(White))
    val promotedRookBlack = new PromotedRook(PieceChooser.choosePawn(Black))
    assertEquals(White, promotedRookWhite.affiliation)
    assertEquals(Black, promotedRookBlack.affiliation)
  }

  @Test def testPossibleMoves(): Unit = {
    println("possibleMoves")
    val forwards = new RelativePositionRange(new RelativePosition(0, 1),
      new RelativePosition(0, 7))
    val right = new RelativePositionRange(new RelativePosition(1, 0),
      new RelativePosition(7, 0))
    val backwards = new RelativePositionRange(new RelativePosition(0, -1),
      new RelativePosition(0, -7))
    val left = new RelativePositionRange(new RelativePosition(-1, 0),
      new RelativePosition(-7, 0))
    val rook = new PromotedRook(PieceChooser.choosePawn)
    val expected = Set(forwards, right, backwards, left)
    val actual = rook.possibleMoves
    assertEquals(expected, actual)
  }

  @Test def testCanJumpOver(): Unit = {
    println("canJumpOver")
    val msg = "Rook shouldn't be able to jump over"
    val rook = new PromotedRook(game.pieces.lightgray.TowersPawn)
    assert(!rook.canJumpOver, msg)
  }

  @Test def testCaptureSameAsMove(): Unit = {
    println("captureSameAsMove")
    val msg = "Rook should capture same as move"
    val rook = new PromotedRook(game.pieces.darkgray.PointyHatGuysPawn)
    assert(rook.captureSameAsMove, msg)
  }

  @Test def testPossibleCaptures(): Unit = {
    println("possibleCaptures")
    val forwards = new RelativePositionRange(new RelativePosition(0, 1),
      new RelativePosition(0, 7))
    val right = new RelativePositionRange(new RelativePosition(1, 0),
      new RelativePosition(7, 0))
    val backwards = new RelativePositionRange(new RelativePosition(0, -1),
      new RelativePosition(0, -7))
    val left = new RelativePositionRange(new RelativePosition(-1, 0),
      new RelativePosition(-7, 0))
    val rook = new PromotedRook(game.pieces.lightgray.EmperorsPawn)
    val expected = Set(forwards, right, backwards, left)
    val actual = rook.possibleCaptures
    assertEquals(expected, actual)
  }

}
