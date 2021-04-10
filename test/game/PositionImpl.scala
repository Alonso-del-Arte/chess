package game

class PositionImpl(x: Int, y: Int) extends Position(x, y) {

  override def translate(offset: RelativePosition): Position = {
    new PositionImpl(this.x + offset.offsetX, this.y + offset.offsetY)
  }

}
