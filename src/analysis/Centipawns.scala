package analysis

object Centipawns {

  // STUB TO FAIL THE FIRST TEST
  def apply(n: Int): Centipawns = new Centipawns(0)

}

class Centipawns(val quantity: Int) {

  override def toString: String = if (this.quantity == 1) {
    "1 centipawn"
  } else {
    s"${this.quantity} centipawns"
  }

  // STUB TO FAIL THE FIRST TEST
  override def equals(obj: Any): Boolean = false

  // STUB TO FAIL THE FIRST TEST
  override def hashCode(): Int = 0

}
