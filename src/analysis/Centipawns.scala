package analysis

object Centipawns {

  def apply(n: Int): Centipawns = new Centipawns(n)

}

class Centipawns(val quantity: Int) {

  override def toString: String = if (this.quantity == 1) {
    "1 centipawn"
  } else {
    s"${this.quantity} centipawns"
  }

  override def equals(obj: Any): Boolean = obj match {
    case centipawns: Centipawns => this.quantity == centipawns.quantity
    case _ => false
  }

  override def hashCode: Int = this.quantity

}
