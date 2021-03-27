package game

class RelativePosition(val offsetX: Int, val offsetY: Int) {

  override def toString: String = s"(${this.offsetX}, ${this.offsetY})"

}
