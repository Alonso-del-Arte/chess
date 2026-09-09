package game.moves

import game.{BoardState, RelativePositionRange}
import game.pieces.Piece

/**
 * Specifies one possible move for a piece, and whether there are special
 * prerequisites for the move (e.g., castling, en passant). It should be
 * understood that the move described by this instance might not always be
 * available, such as because it would put the piece off the board, or because
 * the destination is occupied by a piece of the same side.
 * @param piece The piece which is to be moved. For example, a knight.
 * @param destination The destination. For example two ranks up, a file to the
 *                    left.
 * @param prerequisites A function that indicates whether a given board state meets the prerequisites for the move.
 * @param isCapture Whether the move is a capture.
 */
abstract class MoveSpecification(val piece: Piece,
                                 val destination: RelativePositionRange,
                                 val prerequisites: BoardState => Boolean,
                                 val isCapture: Boolean = true)
