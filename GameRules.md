# The Rules of Chess

// TODO: Choose official reference for game rules

In this document I will write the rules of the game of chess as I understand 
them, as concisely and completely as I can. This document should not be 
regarded as binding. If it's found to contradict the official reference, this 
document should be amended to be in agreement with the official reference.

There are two sides, White and Black. White always goes first, which 
theoretically gives Black a slight advantage. The two sides take turns. No side 
may skip a turn, but either side may concede the game.

The game is played on an 8 &times; 8 checkerboard. Each side gets sixteen 
pieces: one each of a king and a queen, two each of bishops, knights and rooks, 
and eight each of pawns.

At the beginning of the game, the pieces are arranged in a specific manner, with
each sides' pieces arrayed on opposite ends of the board.
// TODO: Finish writing about initial board state

 The pieces move in specific ways when not capturing opposing pieces:
 
 * A king may only move to an immediately neighboring square that is not 
 already occupied, except when castling (which is not possible at the beginning 
 of the game).
 * A queen to any unoccupied spaces in a straight line, provided all the spaces 
 en route are also unoccupied. Essentially a queen's moves combines the moves of 
 a bishop and a rook.
 * A bishop may move to any unoccupied spaces in a straight diagonal line 
 provided the spaces in between are also unoccupied. On account of the 
 checkerboard, a side's two bishops should be on differently colored spaces. If 
 they are not, there was an invalid move at some point in the game.
 * A knight moves in a L-shape that may be described thus: two spaces forward 
 and then one space to the right or the left, or any reflection of either of 
 those combinations in 90-degree increments. The intervening spaces may be 
 occupied by pieces of either side. After each move, a knight is on a space of 
 the opposite color, so it's just as likely for a side's two knights to be on 
 spaces of the same color as it is for them to be on spaces of opposite colors.
 * A pawn may initially move forward two spaces. Otherwise a pawn is limited to 
 one space forward. Upon reaching the opposing side's home row, a pawn must be 
 "promoted" to a queen, a bishop, a knight or a rook, and all the rules for that 
 other piece then apply.
 
 At the very beginning of the game, the only valid move for either side is to 
 move a pawn, which has clear access to the way forward, or move a knight, which 
 may jump over pawns. All the other pieces are blocked by pieces of their own 
 side from the first move until such time as the way is cleared.    
 
 If the space to which a piece would be allowed to move to if it was unoccupied, 
 is instead occupied by piece of the opposing side, that piece may be captured. 
 Except if the capturing piece is a pawn, as pawns are only allowed to captured 
 diagonally.
 
 The promotion of pawns, combined with the preference of players to promote 
 pawns to queens means that theoretically one side could have nine queens, 
 which would be a logistical problem for two players with only one chess set, 
 but it is no problem for a program such as this one to draw all those queens on 
 the screen.
 
 I think such a scenario could occur among players playing precisely with the 
 goal of making that happen, rather playing to win. More likely, among players 
 of roughly equal ability, each side is only able to promote one pawn   
 
 Among beginners captures may occur because a player failed notice one of their 
 pieces was in the line of attack. Among more experienced players, either side 
 may choose to deliberately allow one of their pieces to be captured. This is 
 called a sacrifice, and may be part of a gambit to gain a tactical advantage.
 
 However, if a king is threatened, that's a check and the threatened side must 
 neutralize that threat, either by moving the king to a safe position or by 
 having another piece intervene to defend the king. The king can't be 
 sacrificed, because then that side loses the game.
  
 However, if there's no way under the rules to neutralize the threat to the 
 king, that's checkmate and the threatening side has won the game. In 
 tournament play there is no need for any further moves to be made or recorded. 
 
 In both informal and tournament play either side has the option to concede if 
 don't think they can win. Tournament play may add rules that have consequences 
 for the unfolding of the tournament.
 
 There also arise situations in which neither side can win. That's a stalemate.
 // TODO: Write regarding rules for determining stalemate has occurred 
