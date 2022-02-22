package ui.graphical

import game.{Black, Player, RegularBoard, RegularPosition, White}

import java.awt.{BorderLayout, Canvas, Color, Dimension, Font, Graphics,
  Graphics2D, Point}
import java.awt.event.{ActionEvent, ActionListener, ItemEvent, ItemListener}

import javax.swing.{JCheckBox, JComboBox, JFrame, JPanel}

/**
 * Shows a window with a board colored according to
 * [[game.RegularBoard.getColor() RegularBoard.getColor()]]. This is not meant
 * to supplant JUnit tests, but rather to provide quick visual confirmation of
 * why the tests are passing or failing.
 * @author Alonso del Arte
 */
object RegularBoardInspector extends JPanel with ActionListener
    with ItemListener {
  private val frame: JFrame = new JFrame("Board Inspector")
  private val playerList: JComboBox[Player] =
    new JComboBox[Player](Array(White, Black))
  this.playerList.addItemListener(this)
  private[graphical] val individualSidePixelLength: Int = 60
  private[graphical] val sidePixelLength: Int = 8 * individualSidePixelLength
  private val dimension: Dimension = new Dimension(sidePixelLength,
    sidePixelLength)
  private[graphical] var side: Player = White
  private val labelText = "Show labels"
  private val labelCheckBox: JCheckBox = new JCheckBox(labelText, false)
  this.labelCheckBox.addActionListener(this)
  this.setPreferredSize(dimension)
  this.setBackground(Color.MAGENTA)
  private val options: JPanel = new JPanel
  options.add(this.playerList)
  options.add(this.labelCheckBox)
  this.frame.add(options, BorderLayout.PAGE_START)
  this.frame.add(this, BorderLayout.CENTER)

  private[graphical] def getCoords(position: RegularPosition): (Int, Int) = {
    val preX = this.side match {
      case White => position.x - 1
      case Black => 8 - position.x
    }
    val preY = this.side match {
      case White => 8 - position.y
      case Black => position.y - 1
    }
    val x = preX * this.individualSidePixelLength
    val y = preY * this.individualSidePixelLength
    (x, y)
  }

  override def paintComponent(g: Graphics): Unit = {
    super.paintComponent(g)
    for (rank <- 1 to 8) {
      for (file <- 1 to 8) {
        val position = new RegularPosition(rank, file)
        val coords = this.getCoords(position)
        val x = coords._1
        val y = coords._2
        g.setColor(RegularBoard.getColor(position))
        g.fillRect(x, y, this.individualSidePixelLength,
          this.individualSidePixelLength)
        if (this.labelCheckBox.isSelected) {
          g.setFont(new Font(g.getFont.getFontName, Font.PLAIN, 32))
          g.setColor(Color.MAGENTA)
          g.drawString(position.toString, x, y + this.individualSidePixelLength)
        }
      }
    }
  }

  override def itemStateChanged(ie: ItemEvent): Unit = {
    this.side = this.playerList.getSelectedItem.asInstanceOf[Player]
    this.repaint()
  }

  override def actionPerformed(ae: ActionEvent): Unit = {
    val command = ae.getActionCommand
    command match {
      case this.labelText => this.repaint()
      case _ => System.err.println(s"""Command "$command" not recognized""")
    }
  }

  def main(args: Array[String]): Unit = {
    this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
    this.frame.pack()
    this.frame.setVisible(true)
  }

}
