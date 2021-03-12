package fileops

import java.io.File

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions._

class PGNFileFilterTest {

  @Test def testAccept(): Unit = {
    println("accept")
    val pathname = "game.pgn"
    val file = new File(pathname)
    val filter = new PGNFileFilter
    val msg = s"Filter should accept ${pathname}"
    assert(filter.accept(file), msg)
  }

  @Test def testReject(): Unit = {
    val pathname = "image.png"
    val file = new File(pathname)
    val filter = new PGNFileFilter
    val msg = s"Filter should reject ${pathname}"
    assert(!filter.accept(file), msg)
  }

}
