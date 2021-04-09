package game

class RelativePosition(val offsetX: Int, val offsetY: Int) {

  override def toString: String = s"(${this.offsetX}, ${this.offsetY})"

  // STUB TO FAIL THE FIRST TEST
  override def equals(obj: Any): Boolean = false

  // STUB TO FAIL THE FIRST TEST
  override def hashCode: Int = 0

  // STUB TO FAIL THE FIRST TEST
  def abs: Int = -1

  // STUB TO FAIL THE FIRST TEST

}
