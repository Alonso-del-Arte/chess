package game

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions._

class InitialBoardStateTest {

  @Test def testBoard(): Unit = {
    println("board")
    assertEquals(RegularBoard, InitialBoardState.board)
  }

  @Test def testNextToPlay(): Unit = {
    println("nextToPlay")
    assertEquals(White, InitialBoardState.nextToPlay)
  }

  @Test def testPositionedPieces(): Unit = {
    println("positionedPieces")
    val expected = Map(RegularPosition("a8") -> game.pieces.black.QueenSideRook,
      RegularPosition("b8") -> game.pieces.black.QueenSideKnight,
      RegularPosition("c8") -> game.pieces.black.QueenSideBishop,
      RegularPosition("d8") -> game.pieces.black.Queen,
      RegularPosition("e8") -> game.pieces.black.King,
      RegularPosition("f8") -> game.pieces.black.KingSideBishop,
      RegularPosition("g8") -> game.pieces.black.KingSideKnight,
      RegularPosition("h8") -> game.pieces.black.KingSideRook,
      RegularPosition("a7") -> game.pieces.black.QueenSideRookPawn,
      RegularPosition("b7") -> game.pieces.black.QueenSideKnightPawn,
      RegularPosition("c7") -> game.pieces.black.QueenSideBishopPawn,
      RegularPosition("d7") -> game.pieces.black.QueenPawn,
      RegularPosition("e7") -> game.pieces.black.KingPawn,
      RegularPosition("f7") -> game.pieces.black.KingSideBishopPawn,
      RegularPosition("g7") -> game.pieces.black.KingSideKnightPawn,
      RegularPosition("h7") -> game.pieces.black.KingSideRookPawn,
      RegularPosition("a2") -> game.pieces.white.QueenSideRookPawn,
      RegularPosition("b2") -> game.pieces.white.QueenSideKnightPawn,
      RegularPosition("c2") -> game.pieces.white.QueenSideBishopPawn,
      RegularPosition("d2") -> game.pieces.white.QueenPawn,
      RegularPosition("e2") -> game.pieces.white.KingPawn,
      RegularPosition("f2") -> game.pieces.white.KingSideBishopPawn,
      RegularPosition("g2") -> game.pieces.white.KingSideKnightPawn,
      RegularPosition("h2") -> game.pieces.white.KingSideRookPawn,
      RegularPosition("a1") -> game.pieces.white.QueenSideRook,
      RegularPosition("b1") -> game.pieces.white.QueenSideKnight,
      RegularPosition("c1") -> game.pieces.white.QueenSideBishop,
      RegularPosition("d1") -> game.pieces.white.Queen,
      RegularPosition("e1") -> game.pieces.white.King,
      RegularPosition("f1") -> game.pieces.white.KingSideBishop,
      RegularPosition("g1") -> game.pieces.white.KingSideKnight,
      RegularPosition("h1") -> game.pieces.white.KingSideRook)
    val actual = InitialBoardState.positionedPieces
    assertEquals(expected, actual)
  }

  @Test def testCapturedPieces(): Unit = {
    println("capturedPieces")
    val msg = "Initial board state should have no captured pieces"
    assert(InitialBoardState.capturedPieces.isEmpty, msg)
  }

}
