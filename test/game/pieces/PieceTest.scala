package game.pieces

import game.{Black, White}

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

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

}
