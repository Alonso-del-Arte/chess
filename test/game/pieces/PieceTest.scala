package game.pieces

import game.{Black, Neutral, Player, RelativePosition, RelativePositionRange,
  White}

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

import scala.util.Random

object PieceTest {

  def inventMoves: Set[RelativePositionRange] = {
    val total = Random.nextInt(4) + 1
    var set: Set[RelativePositionRange] = Set()
    while (set.size < total) {
      val startA = Random.nextInt(8) - 4
      val endA = startA + 8
      val startB = Random.nextInt(8) - 4
      val endB = startB + 8
      val start = new RelativePosition(startA, endA)
      val end = new RelativePosition(startB, endB)
      val range = new RelativePositionRange(start, end)
      set += range
    }
    set
  }

}

class PieceTest {

  @Test def testAffiliation(): Unit = {
    println("affiliation")
    assertEquals(White, game.pieces.white.QueenSideRook.affiliation)
    assertEquals(White, game.pieces.white.QueenSideKnight.affiliation)
    assertEquals(White, game.pieces.white.QueenSideBishop.affiliation)
    assertEquals(White, game.pieces.white.Queen.affiliation)
    assertEquals(White, game.pieces.white.King.affiliation)
    assertEquals(White, game.pieces.white.KingSideBishop.affiliation)
    assertEquals(White, game.pieces.white.KingSideKnight.affiliation)
    assertEquals(White, game.pieces.white.KingSideRook.affiliation)
    assertEquals(White, game.pieces.white.QueenSideRookPawn.affiliation)
    assertEquals(White, game.pieces.white.QueenSideKnightPawn.affiliation)
    assertEquals(White, game.pieces.white.QueenSideBishopPawn.affiliation)
    assertEquals(White, game.pieces.white.QueenPawn.affiliation)
    assertEquals(White, game.pieces.white.KingPawn.affiliation)
    assertEquals(White, game.pieces.white.KingSideBishopPawn.affiliation)
    assertEquals(White, game.pieces.white.KingSideKnightPawn.affiliation)
    assertEquals(White, game.pieces.white.KingSideRookPawn.affiliation)
    assertEquals(Black, game.pieces.black.QueenSideRook.affiliation)
    assertEquals(Black, game.pieces.black.QueenSideKnight.affiliation)
    assertEquals(Black, game.pieces.black.QueenSideBishop.affiliation)
    assertEquals(Black, game.pieces.black.Queen.affiliation)
    assertEquals(Black, game.pieces.black.King.affiliation)
    assertEquals(Black, game.pieces.black.KingSideBishop.affiliation)
    assertEquals(Black, game.pieces.black.KingSideKnight.affiliation)
    assertEquals(Black, game.pieces.black.KingSideRook.affiliation)
    assertEquals(Black, game.pieces.black.QueenSideRookPawn.affiliation)
    assertEquals(Black, game.pieces.black.QueenSideKnightPawn.affiliation)
    assertEquals(Black, game.pieces.black.QueenSideBishopPawn.affiliation)
    assertEquals(Black, game.pieces.black.QueenPawn.affiliation)
    assertEquals(Black, game.pieces.black.KingPawn.affiliation)
    assertEquals(Black, game.pieces.black.KingSideBishopPawn.affiliation)
    assertEquals(Black, game.pieces.black.KingSideKnightPawn.affiliation)
    assertEquals(Black, game.pieces.black.KingSideRookPawn.affiliation)
  }

  @Test def testCanJumpOver(): Unit = {
    println("canJumpOver")
    val piece = new PieceImpl
    assert(!piece.canJumpOver,
      "Piece not specifically a knight can't jump over other pieces")
  }

  @Test def testCaptureSameAsMove(): Unit = {
    println("captureSameAsMove")
    val piece = new PieceImpl
    assert(piece.captureSameAsMove,
      "Piece not specifically a pawn captures same as moves")
  }

  @Test def testPossibleCapturesInferredIfCaptureSameAsMove(): Unit = {
    val expected = PieceTest.inventMoves
    val instance = new Piece {
      override val affiliation: Player = Neutral
      override val possibleMoves: Set[RelativePositionRange] = expected
    }
    val actual = instance.possibleCaptures
    assertEquals(expected, actual)
  }

  private class PieceImpl extends Piece {
    override val affiliation: Player = Neutral
    override val possibleMoves: Set[RelativePositionRange] = Set()
  }

}
