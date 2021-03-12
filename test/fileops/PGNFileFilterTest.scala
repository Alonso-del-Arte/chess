package fileops

import java.io.File

import org.junit.jupiter.api.Test

class PGNFileFilterTest {

  @Test def testAccept(): Unit = {
    println("accept")
    val pathname = "game.pgn"
    val file = new File(pathname)
    val filter = new PGNFileFilter
    val msg = s"Filter should accept $pathname"
    assert(filter.accept(file), msg)
  }

  @Test def testReject(): Unit = {
    val pathname = "image.png"
    val file = new File(pathname)
    val filter = new PGNFileFilter
    val msg = s"Filter should reject $pathname"
    assert(!filter.accept(file), msg)
  }

  @Test def testGetDescription(): Unit = {
    println("getDescription")
    val filter = new PGNFileFilter
    val description = filter.getDescription
    println("PGNFileFilter description is \"" + description + "\"")
    val formatName = "Portable Game Notation"
    assert(description.contains(formatName),
      "Description should include \"" + formatName + "\"")
    val fileExtension = "pgn"
    assert(description.toLowerCase.contains(fileExtension),
      s"Description should contain extension $fileExtension")
  }

}
