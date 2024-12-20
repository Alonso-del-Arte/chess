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

  // TODO: Write tests for this
  def move(moveSpec: MoveSpecification, opponent: Player)
      : BoardState = {
    this
  }

  // TODO: Write tests for this
  def exchange(clientMoveSpec: MoveSpecification,
               guardMoveSpec: MoveSpecification, opponent: Player)
      : BoardState = {
    // The idea here is that this procedure is what will enable castling. The
    // only validation here will be that the destination spaces are clear, not
    // whether the path is safe and clear.
    this
  }

}
