package game

import game.pieces.PieceChooser

import org.junit.jupiter.api.Test

import scala.util.Random

class MoveSpecificationTest {

  @Test def testDefaultMeetsPrerequisitesIsEmptyOption(): Unit = {
    val piece = PieceChooser.choosePiece
    val start = new PositionImpl(Random.nextInt(8) + 1, Random.nextInt(8) + 1)
    val offset = new RelativePosition(Random.nextInt(8), Random.nextInt(8))
    val destination = start.translate(offset)
    val instance = new MoveSpecification(piece, start, destination)
    val actual = instance.prerequisites
    val msg = "Default prerequisites should be empty Option"
    assert(actual.isEmpty, msg)
  }

}
