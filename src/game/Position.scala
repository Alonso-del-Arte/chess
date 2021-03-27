package game

class Position(val x: Int, val y: Int) {

  override def toString: String =
    "" + (this.x + 96).toChar + (this.y + 48).toChar

  // STUB TO FAIL THE FIRST TEST
  def translate(offset: RelativePosition): Position = this

}
