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

}
