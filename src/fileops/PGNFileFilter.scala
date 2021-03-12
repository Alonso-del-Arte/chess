package fileops

import java.io.File
import javax.swing.filechooser.FileFilter

class PGNFileFilter extends FileFilter {

  // STUB TO FAIL THE FIRST TEST
  override def accept(f: File): Boolean = {
    if (f.isDirectory) true else f.getName.toLowerCase.endsWith(".png")
  }

  // STUB TO FAIL THE FIRST TEST
  override def getDescription: String = "Sorry not implemented yet (*.png)"

}
