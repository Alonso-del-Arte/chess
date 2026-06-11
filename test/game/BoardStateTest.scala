package game

import game.pieces.darkgray.DarkGrayPawn

import scala.util.Random

object BoardStateTest {

  private val DARK_GRAY_PAWNS: Array[DarkGrayPawn] =
    Array(game.pieces.darkgray.TowersPawn, game.pieces.darkgray.HorsesPawn,
      game.pieces.darkgray.PointyHatGuysPawn,
      game.pieces.darkgray.EmpressesPawn, game.pieces.darkgray.EmperorsPawn)

  private val NUMBER_OF_DARK_GRAY_PAWNS: Int = DARK_GRAY_PAWNS.length

  def chooseDarkGrayPawn: DarkGrayPawn = {
    val index = Random.nextInt(NUMBER_OF_DARK_GRAY_PAWNS)
    DARK_GRAY_PAWNS(index)
  }

}

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class BoardStateTest {

  @Test def testMove(): Unit = {
    println("move")
    fail("HAVEN'T WRITTEN TEST YET")
  }

  @Test def testExchange(): Unit = {
    println("exchange")
    fail("HAVEN'T WRITTEN TEST YET")
  }

}
