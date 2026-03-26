package game

import java.awt.Color

abstract class Board(val maxX: Int, val maxY: Int, val minX: Int = 1,
                     val minY: Int = 1) {

  def contains(position: Position): Boolean =
    (position.x >= minX) && (position.x <= maxX) &&
      (position.y >= minY) && (position.y <= maxY)

  /**
   * Gives the color of a given position on the board. By default we assume the
   * board is square in shape and divided into smaller squares, and the squares
   * are colored in a black and white checkerboard pattern. A default
   * implementation is provided according to this assumption.
   * @param position The position to get the color of. For example, on a regular
   *                 board, d4, represented internally as (4, 4). This default
   *                 implementation does not check whether or not the position
   *                 is on the board.
   * @return The color of the position. In the example, this would be
   *         `Color.BLACK`. In this default implementation, `Color.WHITE` is the
   *         only other possible return value.
   */
  def getColor(position: Position): Color = {
    if ((position.x + position.y) % 2 == 0) {
      Color.BLACK
    } else {
      Color.WHITE
    }
  }

}
