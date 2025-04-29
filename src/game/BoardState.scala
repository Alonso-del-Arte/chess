package game

import game.pieces.Piece

/**
 * Immutable class to represent a state of the board. An instance of this class
 * does not record what the next board state is or even what the previous board
 * state was.
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
abstract class BoardState(val board: Board, val nextToPlay: Player,
                          val positionedPieces: Map[Position, Piece],
                          val capturedPieces: Set[Piece] = Set()) {

  /**
   * Gives the number of plies in the game leading up to this board state. For
   * the number of moves, call [[moveCount]]. For the example, suppose the whole
   * game so far is 1. e4 e5 2. d4.
   * @return An even integer if it's White's turn to play (or would be White's
   *         turn to play but this state represents checkmate or stalemate), an
   *         odd integer if it's Black's turn to play (or would be Black's turn
   *         to play). In the example, this would be 3, since White has played
   *         two plies (1. e4 and 2. d4) and Black has played one ply (1. ...
   *         e5).
   */
  def plyCount: Int

  /**
   * Gives the number of completed moves (pairs of plies) in the game leading up
   * to this board state. For the number of plies, call [[plyCount]]. For the
   * example, suppose the whole game so far is 1. e4 e5 2. d4.
   * @return The floor of the number of plies divided by 2. In the example, this
   *         would be 1, even though White has played 2. d4. This is because
   *         Black has not yet completed the second move.
   */
  def moveCount: Int

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
