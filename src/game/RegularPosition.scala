package game

class RegularPosition(x: Int, y: Int) extends Position(x, y) {

  override def toString: String = "" + (x + 96).toChar + (y + 48).toChar

  // STUB TO FAIL THE FIRST TEST
  def translate(offset: RelativePosition): Position = this

}
