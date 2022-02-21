package ui.graphical

import java.awt.{BorderLayout, Canvas, Color, Dimension, Graphics, Graphics2D,
  Point}
import java.awt.event.{ActionEvent, ActionListener, ItemEvent, ItemListener}

import javax.swing.{JCheckBox, JComboBox, JFrame, JPanel}

/**
 * This will be a viewer program to enable one to inspect pieces. It is not
 * meant to supplant JUnit tests, but rather to give a quick visual confirmation
 * of how the pieces are looking.
 * @author Alonso del Arte
 */
object PieceInspector extends JPanel {
  private val frame: JFrame = new JFrame("Piece Inspector")
  this.frame.add(this)

}
