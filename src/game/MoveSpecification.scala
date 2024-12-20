package game

import game.pieces.Piece

// TODO: Reevaluate parameters: is start necessary? should destination be
//  different type?
/**
 * Specifies one possible move for a piece, and whether or not there are special
 * prerequisites for the move (e.g., castling, en passant). It should be
 * understood that the move described by this instance might not always be
 * available, such as because it would put the piece off the board, or because
 * the destination is occupied by a piece of the same side.
 * @param piece The piece which is to be moved. For example, a knight.
 * @param start The starting position.
 * @param destination The destination. For example two ranks up, a file to the
 *                    left.
 * @param prerequisites An `Option` with the special prerequisites for this
 *                      move. Empty by default.
 */
class MoveSpecification(val piece: Piece, val start: Position,
                        val destination: Position,
                        val prerequisites: Option[BoardState => Boolean] = None)
