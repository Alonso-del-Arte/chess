package fileops

import java.io.File
import javax.swing.filechooser.FileFilter

class PGNFileFilter extends FileFilter {

  override def accept(f: File): Boolean = {
    if (f.isDirectory) true else f.getName.toLowerCase.endsWith(".pgn")
  }

  override def getDescription: String = "Portable Game Notation (*.pgn)"

}
