package game

class RegularPosition(x: Int, y: Int) extends Position(x, y) {

  override def toString: String = "" + (x + 96).toChar + (y + 48).toChar

  def translate(offset: RelativePosition): Position =
    new RegularPosition(this.x + offset.offsetX, this.y + offset.offsetY)

}
