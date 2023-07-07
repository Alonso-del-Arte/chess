package game.pieces

import game.{RelativePosition, RelativePositionRange}

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions._

class PromotedQueenTest {

  @Test def testAffiliation(): Unit = {
    println("affiliation")
    val promotedQueenWhite = new PromotedQueen(game.pieces.white.KingPawn)
    val promotedQueenBlack = new PromotedQueen(game.pieces.black.QueenPawn)
    assertEquals(game.pieces.white.KingPawn.affiliation,
      promotedQueenWhite.affiliation)
    assertEquals(game.pieces.black.QueenPawn.affiliation,
      promotedQueenBlack.affiliation)
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
    val toNortheast = new RelativePositionRange(new RelativePosition(1, -1),
      new RelativePosition(7, -7))
    val toNorthwest = new RelativePositionRange(new RelativePosition(1, 1),
      new RelativePosition(7, 7))
    val toSouthwest = new RelativePositionRange(new RelativePosition(-1, 1),
      new RelativePosition(-7, 7))
    val toSoutheast = new RelativePositionRange(new RelativePosition(-1, -1),
      new RelativePosition(-7, -7))
    val queen = new PromotedQueen(game.pieces.black.QueenSideBishopPawn)
    val expected = Set(forwards, right, backwards, left, toNorthwest,
      toNortheast, toSouthwest, toSoutheast)
    val actual = queen.possibleMoves
    assertEquals(expected, actual)
  }

  @Test def testCanJumpOver(): Unit = {
    println("canJumpOver")
    val queen = new PromotedQueen(game.pieces.white.QueenSideBishopPawn)
    val msg = "Queen shouldn't be able to jump over"
    assert(!queen.canJumpOver, msg)
  }

  @Test def testCaptureSameAsMove(): Unit = {
    println("captureSameAsMove")
    val queen = new PromotedQueen(game.pieces.black.KingSideKnightPawn)
    val msg = "Queen should capture same as move"
    assert(queen.captureSameAsMove, msg)
  }

  @Test def testPossibleCaptures(): Unit = {
    println("possibleCaptures")
    val queen = new PromotedQueen(game.pieces.white.KingSideKnightPawn)
    val expected = queen.possibleMoves
    val actual = queen.possibleCaptures
    assertEquals(expected, actual)
  }

}
