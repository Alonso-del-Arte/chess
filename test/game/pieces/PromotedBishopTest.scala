package game.pieces

import game.{Black, RelativePosition, RelativePositionRange, White}

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class PromotedBishopTest {

  @Test def testAffiliation(): Unit = {
    println("affiliation")
    val promotedBishopWhite = new PromotedBishop(PieceChooser.choosePawn(White))
    val promotedBishopBlack = new PromotedBishop(PieceChooser.choosePawn(Black))
    assertEquals(White, promotedBishopWhite.affiliation)
    assertEquals(Black, promotedBishopBlack.affiliation)
  }

  @Test def testPossibleMoves(): Unit = {
    println("possibleMoves")
    val toNortheast = new RelativePositionRange(new RelativePosition(1, -1),
      new RelativePosition(7, -7))
    val toNorthwest = new RelativePositionRange(new RelativePosition(1, 1),
      new RelativePosition(7, 7))
    val toSouthwest = new RelativePositionRange(new RelativePosition(-1, 1),
      new RelativePosition(-7, 7))
    val toSoutheast = new RelativePositionRange(new RelativePosition(-1, -1),
      new RelativePosition(-7, -7))
    val bishop = new PromotedBishop(PieceChooser.choosePawn)
    val expected = Set(toNorthwest, toNortheast, toSouthwest, toSoutheast)
    val actual = bishop.possibleMoves
    assertEquals(expected, actual)
  }

  @Test def testCanJumpOver(): Unit = {
    println("canJumpOver")
    val bishop = new PromotedBishop(PieceChooser.choosePawn)
    val msg = "Bishop shouldn't be able to jump over"
    assert(!bishop.canJumpOver, msg)
  }

  @Test def testCaptureSameAsMove(): Unit = {
    println("captureSameAsMove")
    val bishop = new PromotedBishop(PieceChooser.choosePawn)
    val msg = "Bishop should capture same as move"
    assert(bishop.captureSameAsMove, msg)
  }

  @Test def testPossibleCaptures(): Unit = {
    println("possibleCaptures")
    val bishop = new PromotedBishop(PieceChooser.choosePawn)
    val expected = bishop.possibleMoves
    val actual = bishop.possibleCaptures
    assertEquals(expected, actual)
  }

  @Test def testPrior(): Unit = {
    println("prior")
    val expected = PieceChooser.choosePawn
    val bishop = new PromotedBishop(expected)
    val actual = bishop.prior
    assertEquals(expected, actual)
  }

}
