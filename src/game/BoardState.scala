package game

import game.pieces.Piece

/**
 * Immutable class to represent a state of the board.
 * @param board The board to put the pieces on. Should generally be
 *              [[RegularBoard]].
 * @param nextToPlay The player who is expected to make a move to bring about
 *                   the next board state.
 * @param positionedPieces Pieces that are on specific positions on the board,
 *                         mapping positions to pieces.
 * @param capturedPieces The set of all pieces that have been captured on this
 *                       board state or previous board states. This parameter
 *                       may be omitted if no pieces have been captured so far.
 * @author Alonso del Arte
 */
class BoardState(val board: Board, val nextToPlay: Player,
                 val positionedPieces: Map[Position, Piece],
                 val capturedPieces: Set[Piece] = Set()) {

  def move(piece: Piece, destination: Position): Unit = {
    // TODO: Write tests for this
    // The idea here is that this procedure will check whether destination is
    // empty or occupied by an opposing piece. But there will be no other move
    // validation whatsoever.
  }

}
