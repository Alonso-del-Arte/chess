package game.moves

import game.BoardState
import game.pieces.Piece

object SpecialMoveSpecification {

  def validate(spec: SpecialMoveSpecification, boardState: BoardState,
               piece: Piece, secondPiece: Piece): Unit = {
    // TODO: Write tests for this. The idea here is that the trait's execute()
    //  function will call this procedure to ensure the board state meets the
    //  special move prerequisites and throw an exception if it doesn't
  }

}

trait SpecialMoveSpecification {

  /**
   * Determines whether a proposed move meets the special prerequisites, without
   * regard for other considerations. Any proposed move, special or not, must
   * meet basic requirements to be considered valid. Such as that the target
   * square is not already occupied by a piece of the same side, or that the
   * completed move does not put the player’s own king in danger. Suppose an
   * enemy queen or bishop threatens a so far unmoved pawn protecting the king
   * from attack on the diagonal. Then that pawn is barred from making the
   * special move of two steps forward in the same way that pawn is also barred
   * from moving a single step forward. However, this does not preclude
   * consideration of the king’s present safety, and his safety during execution
   * of the move may also be considered. For castling, this means that the
   * king's initial and intermediate safety is considered by this function. But
   * this function leaves it to the normal validation function to determine if
   * the king ends up in a safe position.
   * @param boardState The board state. For example, a board state in which a
   *                   pawn is about to reach the opponent's home row.
   * @param piece The piece. For example, a pawn.
   * @param secondPiece The second piece, which may be either of the same side
   *                    or the opposing side. May also be null. For example, an
   *                    enemy bishop on the opponent's home row.
   * @return True if all the special prerequisites are met, even if the normal
   *         prerequisites are not met; false otherwise.
   */
  def meetsPrerequisites(boardState: BoardState, piece: Piece,
                         secondPiece: Piece = null): Boolean

  def isCapture: Boolean

  def involvesPiecesOfSameSide: Boolean

  def execute(boardState: BoardState, piece: Piece,
              secondPiece: Piece = null): BoardState

}
