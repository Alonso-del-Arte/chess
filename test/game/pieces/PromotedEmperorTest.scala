package game.pieces

import game.{DarkGray, LightGray}

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

}
