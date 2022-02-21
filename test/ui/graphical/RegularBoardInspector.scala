package ui.graphical

import game.{Black, Player, RegularBoard, RegularPosition, White}

import java.awt.{BorderLayout, Canvas, Color, Dimension, Graphics, Graphics2D,
  Point}
import java.awt.event.{ActionEvent, ActionListener, ItemEvent, ItemListener}

import javax.swing.{JCheckBox, JComboBox, JFrame, JPanel}

/**
 * Shows a window with a board colored according to
 * [[game.RegularBoard.getColor()]]. This is not meant to supplant JUnit tests,
 * but rather to provide quick visual confirmation of why the tests are passing
 * or failing.
 * @author Alonso del Arte
 */
object RegularBoardInspector extends JPanel {
  private val frame: JFrame = new JFrame("Board Inspector")
  private val playerSelect: JComboBox[Player] =
    new JComboBox[Player](Array(Black, White))
  private[graphical] val individualSidePixelLength: Int = 60
  private[graphical] val sidePixelLength: Int = 8 * individualSidePixelLength
  private val dimension: Dimension = new Dimension(sidePixelLength,
    sidePixelLength)
  private[graphical] val side: Player = White
  this.setPreferredSize(dimension)
  this.setBackground(Color.MAGENTA)
  this.frame.add(this, BorderLayout.CENTER)

  private[graphical] def getCoords(position: RegularPosition): (Int, Int) = {
    (0, 0)
  }

  override def paintComponent(g: Graphics): Unit = {
    super.paintComponent(g)
    for (rank <- 1 to 8) {
      val x = rank * this.individualSidePixelLength
      for (file <- 1 to 8) {
        val y = file * this.individualSidePixelLength
        val position = new RegularPosition(rank, file)
        g.setColor(RegularBoard.getColor(position))
        g.fillRect(x, y, this.individualSidePixelLength,
          this.individualSidePixelLength)
      }
    }
  }

  def main(args: Array[String]): Unit = {
    this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
    this.frame.pack()
    this.frame.setVisible(true)
  }

}
