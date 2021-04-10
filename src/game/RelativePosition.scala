package game

class RelativePosition(val offsetX: Int, val offsetY: Int) {

  override def toString: String = s"(${this.offsetX}, ${this.offsetY})"

  override def equals(obj: Any): Boolean = obj match {
    case other: RelativePosition => (this.offsetX == other.offsetX) &&
      (this.offsetY == other.offsetY)
    case _ => false
  }

  override def hashCode: Int = (this.offsetX << 16) + this.offsetY

  def abs: Int = this.offsetX * this.offsetX + this.offsetY * this.offsetY

}
