# Variants

There are several variants of chess. The following is not a complete list. These 
are arranged roughly in order from closest to traditional chess to farthest 
away.

## Three-check

First side to put the other in check thrice wins the game. Or you can win with a 
regular checkmate before giving three checks.

## Fog of War

At the beginning of the game, you can only see the half of the board with your 
pieces. As you move your pieces, your view of the board changes according to 
what spaces of the board your pieces can move to. Your opponent likewise has a 
limited view of the board. It is a one-check game. Therefore, castling is 
generally advantageous, much more so than in regular chess.

Also called "dark chess." Closely related to **Kriegspiel**, which was played 
long before anyone thought of using computers for chess. Kriegspiel was played 
with three boards and required an arbiter to keep track of what pieces are 
visible to each player.

## King of the hill

Four squares in the center of the board, d4, e4, d5 and e5, are marked as a 
special area. If one side can get their king to one of those squares, they win 
the game. Or you can win with a regular checkmate, which might be the only way 
you can win if you're playing against an evenly matched opponent.

## Crazyhouse

Captures give the capturing side the ability to place a piece of the same kind 
on an empty square as a move later on. For example, if White captures a Black 
knight, White can later place a White knight on an empty square later.

Both sides are prohibited from placing pawns on rank 1 or rank 8 even if all 
those squares are empty. A White pawn placed on the seventh rank and a Black 
pawn placed on the second rank are just as eligible for promotion as pawns that 
made it all the way from their starting squares.

In this variant, the distinction between original pieces and promoted pieces is 
very important. Capturing a promoted queen, bishop, knight or rook entitles the 
capturing player to place a pawn, not what the captured pawn had promoted to.

For this reason, as a matter strategy, you should be bolder with promoted queens 
in this variants than with queens in regular chess, because if they're captured, 
the capturing player just gets a pawn to place.

Conversely, you should be much more careful with original queens, because if one 
of them is captured, you not only lose the queen's tactical advantage, your 
opponent gains a queen they can place on any empty square they want.

The notation for crazyhouse is the same as regular chess except for the use of 
the symbol '@' for placements.

Pawn placements are notated with '@' followed by the position where the pawn is 
placed. For example, a pawn placed at d7 is notated "@d7". This may be followed 
by + or # when appropriate.

Placements of other pieces are notated with the appropriate letter (one of Q, B, 
N or R) followed by '@' and the position. For example, a knight placed at h6 is 
notated N@h6. This may be followed by + or # when appropriate.

## Power-up by capture

To my knowledge, no one else has published anything about this 
crazyhouse-inspired chess variant, but I'm sure someone else has thought about 
it.

In this variant, "officer" pieces can gain abilities by capturing certain other 
pieces. Specifically:

* A king who captures any of an opponent's queen, bishops, knights or rooks 
gains the ability to move as that captured piece.
* A queen who captures an opponent's knight gains the ability to move like a 
knight. No special abilities are conferred from capturing a bishop or a rook 
because she already has their abilities.
* A bishop who captures an opponent's queen or rook gains the ability to move 
like a rook.
* A bishop who captures an opponent's knight gains the ability to move like a 
knight.
* A knight who captures any of an opponent's queen, bishops or rooks gains the 
ability to move as that captured piece.
* A rook that captures an opponent's queen or bishop gains the ability to move 
like a bishop.
* A rook that captures an opponent's knight gains the ability to move like a 
knight.

Pawns can't gain abilities in this manner. For example, a pawn who captures the  
opponent's knight doesn't gain the ability to move like a knight. However, if 
that pawn promotes to a queen and *then* captures the opponent's other knight, 
that pawn promoted to queen can then move like a knight.

It should go without saying that abilities can't be combined in a single move. 
Just as a  regular queen must choose to move as a bishop or as a rook in a given 
move but not both, a queen with the ability to move like a knight must choose to 
move as a bishop, knight or rook in a given move.

## Atomic

This is another variant in which captures have special significance. When a 
capture occurs, it's not just the captured piece that is removed from the board. 
The capturing piece is also removed, as well as any non-pawn pieces that 
happened to be in the immediately neighboring squares.

Played on the computer, each capture is accompanied by the sound of an 
explosion. [FINISH WRITING]

[FINISH WRITING]

## Antichess

[FINISH WRITING]

## Misplaced royals, or royals misplaced

This variant arises when the person setting up the board minds the rule each 
queen should be on a square of her own color but neglects or ignores the rule 
that the corner at each player's left must be a dark-colored square.

The result of this mix-up is that the kings and queens wind up on the wrong 
squares relative to each other. Queenside castling is still one square longer 
than kingside castling, but apparently occurs on the right rather than the left.

![Variant initial state](../diagrams/openings/MisplacedRoyals.png)

OR

![Variant initial state](../diagrams/openings/RoyalsMisplaced.png)

If you fail to notice this before making your first move, I suppose your only 
choice is to keep going and try not to compound the mistake by castling your 
queen instead of your king.

As this variant is common among beginners, it might be necessary to announce all 
checks, explain castling and pretend there's no en passant.

## Variant for testing purposes

In all the variants explained so far, the initial board state is the same as in 
traditional chess, or very close to it. The two sides are White and Black, and 
White goes first.

But in this testing variant, which I will only flesh out enough to help with 
testing regular chess play, the two sides are Dark Gray and Light Gray, and 
either may go first.

Also, instead of a king, each side gets an emperor; an empress instead of a 
queen, one pointy hat guy instead of two bishops; one horse instead of two 
knights; one tower instead of two rooks; and five pawns instead of eight.

However, this variant may be played with a standard set. The initial board state 
is somewhat asymmetrical:

![Variant initial state](../diagrams/TestingVariantInitialBoardState.png)

FEN: 3qkbnr/3ppppp/8/8/8/8/PPPPP3/RNBQK3 w Qk - 0 1

And so one side may only castle queenside and the other only kingside. However, 
if there are no pieces between the emperor and the tower, castling is allowed 
even if the emperor is in check and even if he must pass through a threatened 
square, provided he ends up on a relatively safe square.

Furthermore, castling is also allowed if the emperor has moved from his original 
square but has since returned. The tower must not have moved prior to castling, 
however.

Pawns may promote to emperors but they may not stay pawns upon reaching the 
opponent's home row.

An emperor of one side may be captured, and the game continues if that side has 
other emperors, or any empresses.

A check to an emperor must be addressed, unless the only way to address it 
requires putting another emperor in check.

A threat to an empress of one side may be ignored if that side still has other 
empresses, or any emperors.

## Racing kings

[FINISH WRITING]

## Horde

[FINISH WRITING]
