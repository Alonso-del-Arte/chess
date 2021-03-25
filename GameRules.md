# The Rules of Chess

// TODO: Choose official reference for game rules

In this document I will write the rules of the game of chess as I understand 
them, as concisely and completely as I can. This document should not be 
regarded as binding. If it's found to contradict the official reference, this 
document should be amended to be in agreement with the official reference.

There will be occasional references to strategy, but the focus here is on what 
makes a move valid, not whether it's the best move at any given moment in the 
game.

There are two sides, White and Black. White always goes first, which 
theoretically gives Black a slight advantage. The two sides take turns. No side 
may skip a turn, but either side may concede the game.

The game is played on an 8 &times; 8 checkerboard. Each side gets sixteen 
pieces: one each of a king and a queen, two each of bishops, knights and rooks, 
and eight each of pawns.

There can only be one piece on a space at a time. Centering the pieces is a 
preference, not a requirement: the important thing is that the placement of the 
pieces be unambiguous. It is an actual rule that once you touch a piece you're 
committed to moving that piece that turn. This rule is generally enforced even 
in an informal context, though it may be relaxed for coaching.

When not capturing an opponent's piece, a player may only move one piece of 
their side (except in the special case of castling, in which case they may move 
two pieces of their own side). When capturing an opponent's piece, a player may 
only move two pieces: the captured piece, which is then moved off the board, and 
their own piece, which then takes the place of the captured piece (except in the 
case of en passant).

At the beginning of the game, the pieces are arranged in a specific manner, with
each sides' pieces arrayed on opposite ends of the board.
// TODO: Finish writing about initial board state

The pieces move in specific ways when not capturing opposing pieces:
 
 * A king may only move to an immediately neighboring square that is not 
 already occupied, except when castling (which is not possible at the beginning 
 of the game, and which will be described later on).
 * A queen may move to any unoccupied spaces in a straight line, including 
 diagonals, provided all the spaces en route are also unoccupied. Essentially a 
 queen's moves combines the moves of a bishop and a rook.
 * A bishop may move to any unoccupied spaces in a diagonal line, provided the 
 spaces in between are also unoccupied. On account of the 
 checkerboard, a side's two bishops should be on differently colored spaces. If 
 they are not, there was an invalid move at some point in the game.
 * A knight moves in a L-shape that may be described thus: two spaces forward 
 and then one space to the right or the left, or any reflection of either of 
 those combinations in 90-degree increments. The intervening spaces may be 
 occupied by pieces of either side. After each move, a knight is on a space of 
 the opposite color, so it's just as likely for a side's two knights to be on 
 spaces of the same color as it is for them to be on spaces of opposite colors.
 * A rook may move to any unoccupied spaces in a straight line (but not 
 diagonals). The only time a rook may jump over another piece is when castling, 
 * A pawn may initially move forward two spaces. Otherwise a pawn is limited to 
 one space forward. Upon reaching the opposing side's home row, a pawn must be 
 "promoted" to a queen, a bishop, a knight or a rook, and all the rules for that 
 other piece then apply. With a physical set, a previously captured rook may be 
 returned to the board upside down to represent a promoted queen. Since the 
 queen combines the abilities of the bishop and the rook, choosing to promote a 
 pawn to a bishop or a rook is generally considered a waste. And choosing to 
 promote to a knight is unlikely to be the best choice in most circumstances.
 
Even though only knights may jump other pieces, when playing on a physical board
players are allowed to move the pieces by lifting them off the board and setting
them down on the destination space rather than dragging them on the board.
 
At the very beginning of the game, the only valid move for either side is to 
move a pawn (which has clear access to the way forward), or move a knight (which 
may jump over pawns). All the other pieces are blocked by pieces of their own 
side from the first move until such time as the way is cleared for them.
 
If the space to which a piece would be allowed to move to if it was unoccupied 
is instead occupied by piece of the opposing side, that piece may be captured. 
Except if the capturing piece is a pawn, as pawns are only allowed to captured 
diagonally (pawns are the only pieces that are allowed to capture on spaces they
would not otherwise be allowed to proceed to).

However, there is a wrinkle to pawn capture that may occasionally occur under 
very specific circumstances. It's called "en passant," from the French for "in 
passing."

Even though you're unlikely to see it in normal game play, a computer program 
must be ready for it. That's why I'll spend a litle bit of time explaining it.

// FINISH WRITING: EN PASSANT

You might play a thousand games and never once see en passant. But if you play 
just a hundred games, you will see castling more than once.

There are two kinds of castling: queenside castling (with the queen's rook) and 
kingside castling. In either case, the king moves two spaces towards the rook to 
be castled with, but the queenside rook must move one more space to meet the 
king.

With queenside castling, the king ends up on file c and the rook ends up on file 
d. With kingside castling, the king ends up on file g and the rook ends up on 
file f.

Castling might seem like a great way to get the king out of trouble, but the 
rules require that the king not be under threat of capture. // FINISH WRITING: CASTLING
 
The promotion of pawns, combined with the preference of players to promote pawns
to queens means that theoretically one side could have nine queens. That would 
be a logistical problem for two players with only one chess set, but it is no 
problem for a program such as this one to draw all those queens on the screen.
 
I think such a scenario could occur among players playing precisely with the 
goal of making that happen, rather playing to win. More likely, among players of
roughly equal ability, each side is only able to promote one or two pawns. That 
means more than four queens on the board at any given time are highly unlikely.
 
Among beginners, captures may occur because a player failed to notice one of 
their pieces was in the line of attack. Among more experienced players, either 
side may choose to deliberately allow one of their pieces to be captured. This 
is called a sacrifice, and may be part of a gambit to gain a tactical advantage.
 
However, if a king is threatened, that's a check and the threatened side must 
neutralize that threat, either by moving the king to a safe position or by 
having another piece intervene to defend the king. The king can't be sacrificed, 
because capturing the opponent's king is the whole point of the game.
 
Because the king must be defended at all costs, a player can sometimes be forced 
to give up a valuable piece (like a rook) in order to get the king out of the 
way of danger.
 
For example, one player's knight might simultaneously threaten both the 
opponent's king and rook. The opponent must then move the king, allowing the 
rook to be captured.
 
In other cases, a player might simultaneously threaten two of the opponent's 
pieces other than the king, such as for example a queen and a bishop. In that 
case, the player with the threatened pieces may choose to save one of the 
threatened pieces, or ignore the threat altogether.

The player may not ignore a threat to the king, though sometimes, a player, too 
engrossed with devising a line of attack, may fail to notice their king is in 
danger. For that reason, players sometimes announce a check by saying "check."

Then the player with the endangered king understands that the only valid moves 
are moves that neutralize the threat. However, if there's no way under the rules 
to neutralize the threat to the king, that's checkmate. The threatening side has 
won the game. In tournament play, there is no need for any further moves to be 
made or recorded. 
 
In both informal and tournament play either side has the option to concede if 
they don't think they can win. Tournament play may add rules that have 
consequences for the unfolding of the tournament.
 
There also arise situations in which neither side can win. That's a stalemate.
// TODO: Write regarding rules for determining stalemate has occurred 

Additional rules apply for timed play (with a clock). In some games, a player 
who takes too long to decide on a move simply "forfeits on time." I've lost that 
way several times.

## Variants

There are several variants of chess. The ones that interest me the most, 
personally, are the ones that don't diverge too much from the official game. And 
honestly, some variants, like Horde, might be much more of a programming 
challenge than I care to undertake.

 * '''Fog of War''' or '''Dark Chess''' &mdash; You can only see your own pieces 
 and the squares your pieces may move to. This means that at the beginning each 
 player can only see half the board. Putting the opponent's king in check is 
 suffficient to win. Hence castling could be much more useful than in Fog of War 
 than in normal play. As far as I know, this variant is only played on a 
 computer.
 * '''Kriegspiel''' &mdash; A forerunner of Fog of War. There are three boards
