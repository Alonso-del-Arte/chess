package game.pieces

import game.{RelativePosition, RelativePositionRange}

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class PromotedBishopTest {

  @Test def testAffiliation(): Unit = {
    println("affiliation")
    val promotedBishopWhite =
      new PromotedBishop(game.pieces.white.KingSideBishopPawn)
    val promotedBishopBlack =
      new PromotedBishop(game.pieces.black.QueenSideBishopPawn)
    assertEquals(game.pieces.white.KingSideBishopPawn.affiliation,
      promotedBishopWhite.affiliation)
    assertEquals(game.pieces.black.QueenSideBishopPawn.affiliation,
      promotedBishopBlack.affiliation)
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
    val bishop = new PromotedBishop(game.pieces.lightgray.HorsesPawn)
    val expected = Set(toNorthwest, toNortheast, toSouthwest, toSoutheast)
    val actual = bishop.possibleMoves
    assertEquals(expected, actual)
  }

  @Test def testCanJumpOver(): Unit = {
    println("canJumpOver")
    val bishop = new PromotedBishop(game.pieces.darkgray.TowersPawn)
    val msg = "Bishop shouldn't be able to jump over"
    assert(!bishop.canJumpOver, msg)
  }

  @Test def testCaptureSameAsMove(): Unit = {
    println("captureSameAsMove")
    val bishop = new PromotedBishop(game.pieces.lightgray.PointyHatGuysPawn)
    val msg = "Bishop should capture same as move"
    assert(bishop.captureSameAsMove, msg)
  }

  @Test def testPossibleCaptures(): Unit = {
    println("possibleCaptures")
    val toNortheast = new RelativePositionRange(new RelativePosition(1, -1),
      new RelativePosition(7, -7))
    val toNorthwest = new RelativePositionRange(new RelativePosition(1, 1),
      new RelativePosition(7, 7))
    val toSouthwest = new RelativePositionRange(new RelativePosition(-1, 1),
      new RelativePosition(-7, 7))
    val toSoutheast = new RelativePositionRange(new RelativePosition(-1, -1),
      new RelativePosition(-7, -7))
    val bishop = new PromotedBishop(game.pieces.lightgray.EmpressesPawn)
    val expected = Set(toNorthwest, toNortheast, toSouthwest, toSoutheast)
    val actual = bishop.possibleCaptures
    assertEquals(expected, actual)
  }

}
