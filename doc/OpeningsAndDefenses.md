# Openings and Defenses

At the beginning of the game, White has only twenty possible moves: move one of 
the two knights to the left or to the right, or move one of the eight pawns one 
space forward or two. Of those twenty possible openings, players tend to use 
only four or five.

Some openings are more advantageous than others, but remember: good players can 
often figure out how to overcome disadvantages, and bad players can often 
squander advantages.

Also, for what it's worth, I can beat easy programs with any of these openings. 
But with the more common openings, a program on easy will make me work harder 
for the win. It's as if they have been programmed with more strategies for the 
common openings.

It shouldn't be any problem to pre-program two or three good defenses for each 
opening, and then have the computer choose one at random. A human player might 
make a systematic study of each opening, but they will probably prioritize 
studying defenses to the more common openings.

Theoretically, Black could choose any of the twenty possible moves to respond 
regardless of White's first move, but the vast majority of players and programs 
choose a first move that they believe will best counter White's perceived 
intentions.

In this document, I intend to cover all twenty possible openings, but for each 
opening only the most likely defenses for Black to respond with.

This document is written from the perspective of White, meaning that you're 
playing White and your opponent is playing Black.

Note also that some openings depend on the second move for their 
characterization, e.g., in some cases when your first move is to move a pawn 
other than the king's pawn but your second move is to move your king's pawn to 
e4, the opening might still be considered a king's pawn opening.

## Knight openings

Either knight for a first move perhaps signals an intention to castle on that 
knight's side, at least in regular chess. Knight openings have their pros and 
cons for the Fog of War chess variant. On the one hand, you don't get to see 
anything of your opponent's forces, but on the other hand you know them to be at 
initial state at this point.

### Queenside knight to rook's file: Durkin opening, or "Sodium Attack"

1. Na3

Most openings are named after people. This one's named after Robert T. Durkin. 
The nickname "Sodium Attack" comes from the notation "Na" (the chemical symbol 
for sodium); moving the same knight to the other side would be notated Nc3.

I believe all grandmasters have thought about this opening, and may have even 
played it in a friendly game. But I also believe that they have all concluded 
that the element of surprise is not a good enough reason to choose it over the 
other knight openings.

However, I must acknowledge that Durkin himself won a few games with this 
opening. He liked this opening so much he even wrote a pamphlet about it.

[TODO: FINISH WRITING]

### Queenside knight to bishop's file: Van Geet opening

1. Nc3

This is a much more conventional opening. It helps clear the way for queenside 
castling, and it better positions your knight to rampage through your opponent's 
ranks.

For example, I like to deprive the opponent of their queen and a rook as early 
as I can, using a knight backed up by a bishop. It goes something like this:

1. Nc3 f5 
2. e4 fxe4 
3. Nxe4 Nf6 
4. Ng5 Rg8 
5. Bc4 Rh8 
6. Nf7 Ng8 
7. Nxd8

![Van Geet setup](../diagrams/openings/VanGeetSetUpQueenCapture.png)

In this case, my opponent, a program on a very popular chess website, wised up 
to my strategy and thwarted my planned rook capture. Still, I was able adjust my 
tactics and win.

Even though my second move was e4, this is still considered the Van Geet 
opening. However, because of that second move, some of the same defenses used 
against the king's pawn opening might be suitable for the Van Geet opening.

### Kingside knight to bishop's file: R&eacute;ti opening

1. Nf3

Opponent might respond with the reversed Mexican defense or the black mustang 
defense.

Tennison gambit

Dutch variation

This opening can be considered a king's pawn opening if your second move is e4, 
e.g.,

1. Nf3 d5
2. e4 e5
3. Bb5+ Qd7
4. Bxd7+ Bxd7
5. exd5 ...

This also illustrates the elephant gambit, in which Black makes an ill-advised 
attempt to control the middle of the board.

Though that particular bot held out a lot longer than a higher rated bot I used 
this opening on.

1. Nf3 f6 
2. e4 e6 
3. Nd4 c6 
4. Qh5+ Ke7 
5. Nf5+ exf5 
6. exf5 Kd6 
7. Qg4 a5 
8. Qf4+ Ke7 
9. Qe4+ Kd6 
10. d4 a4 
11. Bf4# 1-0

That's the Arctic defense, and that particular game shows just one way out of 
several it could go wrong for Black.

### Kingside knight to rook's file: Amar opening

1. Nh3

Black will probably respond by moving their queen's pawn one or two spaces 
forward, in either case threatening your knight with their queenside bishop 
right off the bat.

## Pawn two spaces forward

Since pawns can initially move forward two spaces, it makes sense to take 
advantage of this from the beginning of the game. Your opponent might respond by 
moving their corresponding pawn forward two spaces, effectively stymying both 
pawns until such time as either one of them can capture or is itself captured.

Another option is that your opponent might offer a pawn sacrifice. Then it'll be 
up to you to decide to take them up on it or pass it up.

Or, perhaps better, they might move a pawn that neither stymies your pawn nor 
threatens to capture, as they're more interested in mobilizing their own pieces.

### Queenside rook's pawn: Ware opening

1. a4

This is a good way to get the queenside rook going, if you're not interested in 
queenside castling.

### Queenside knight's pawn: Polish opening

1. b4

This doesn't immediately help the queenside rook get out,

Potential responses: Kucharkowski-Meybohm gambit, Birmingham gambit 


### Queenside bishop's pawn: English opening

1. c4

Opponent might respond with the Anglo-Indian defense

Or with the "symmetrical variation"

Or with "King's English, queen's variation"

1 c4 Nf6

### Queen's pawn opening

1. d4

Apparently this one doesn't have a special name.

It's a weak opening, in my opinion. Your opponent might respond with the Horwitz 
defense, putting your king in check on barely the second move.

1. d4 e6
2. Qd3 Bb4+

Or your opponent might respond with the Keres defense, once again putting you in 
check not even three moves into the game.

1. d4 e6
2. c4 Bb4+

But you can still win if your opponent fails to keep up momentum after that 
early advantage.

Or the Amazon defense, if your opponent is not interested in delivering early 
checks.

1. d4 d5
2. Qd3 Nf6

Or the Amazon attack

1. d4 d5
2. Qd3 Qd6

Of course the most famous move sequence involving this opening is the queen's 
gambit.

1. d4 d5
2. c4

[FINISH WRITING]

Statistics suggest you have a 40% chance of winning with this opening, and a 36% 
chance of drawing. That means only a 24% chance of losing. But of course this 
ignores other factors, such as how your opponent's skills compare to yours.

Dutch defense

1. d4 f5

Dutch Defense: Staunton Gambit Accepted

Borg defense

1. d4 g5

### King's pawn opening

1. e4 e5

Some analysts might still consider other first moves as a king's pawn opening if 
your second move is the king's pawn forward two spaces.

1. b3 e5
2. e4

On the one hand, this sort of opening might feel like you're leaving your king 
unprotected too early in the game. But remember: your opponent hasn't begun 
mobilizing yet. Follow this opening by mobilizing your queen and kingside 
bishop.

"Sicilian Defense: Amazon Attack"  [FINISH WRITING]

1. e4 e5 
2. Qg4 Qf6 
3. Bc4 Bc5 
4. Ne2 Bb6 
5. d4 exd4 
6. Nxd4 Nh6 
7. O-O a6 
8. Bf4 Nxg4 
9. Be5 Qxe5 
10. Nc6 Qxh2# 0-1

Napoleon attack

French defense

### Kingside bishop's pawn: Bird's opening

1. f4

With this opening, be absolutely certain to also open an avenue of escape for 
your king, or else risk an embarrassingly early checkmate. Like this:

1. f4 e5
2. fxe5 Qh4#

Or prepare a counter to such a checkmate attempt:

1. f4 e5
2. Nf3 Qh4+
3. Nxh4

The Dutch variation

1. f4 ???
2. e3

gives your king an out if your opponent sends their queen to h4.

If you stick around longer with this opening, you might pull

King's Gambit Declined: Soller-Zilbermints Gambit

From's gambit

1. f4 e5

From's gambit and Langheld gambit

Double duck formation

### Kingside knight's pawn: Grob opening

1. g4

Your opponent might respond to this opening with the Alessi gambit.

1. g4 f5
2. gxf5

I see no disadvantage for White to immediately capture that pawn. But you might 
have other priorities at this point in the game.

Generally this might not seem like a good opening for kingside castling. 
However, if your opponent's king ventures far out enough to file f, kingside 
castling might just be the way to a clever check.

Sicilian defense: Grob variation

### Kingside rook's pawn: K&aacute;das opening

1. h4

Your opponent will quite predictably try to make an early incursion into your 
side of the board with a bishop, e.g.,

1. h4 d5
2. g4 Bxg4

Schneider gambit

[TODO: FINISH WRITING]

## Pawn one space forward

These openings strike me as particularly cautious. Some of them are just as good 
as their corresponding two-spaces-forward openings for mobilizing the queen and 
the bishops, while perhaps offering some more protection for the king.

### Queenside rook's pawn: Anderssen opening

1. a3

Not as good as the Ware opening, in my opinion, because it doesn't help your 
rook get out, and it restricts the queenside knight to move to c3 (since d2 is 
for the time being also occupied by a pawn).

Some players might care more about the statistics: this is the second worst 
opening because you only have a 3-in-10 chance of winning. But of course that's 
ignoring how good your opponent is.

A really good player will overcome the disadvantages of this opening, while a 
really bad opponent will squander the initial advantage, such as perhaps by 
choosing a bad defense to counter.

Note that if your second move is your king's pawn forward two spaces, e.g.,

1. a3 e5 
2. e4 

then this is considered a king's pawn opening, and it's called the Mengarini 
opening.

### Queenside knight's pawn: Nimzowitsch-Larsen attack 

1. b3

I think this is a bad choice to prepare for queenside castling. This opening 
might still be considered a king's pawn opening if your second move is e4.

Watch out for an embarrassing early checkmate with the modern variation of the 
Nimzowitsch-Larsen:

1. b3 e5 
2. Bb2 Qf6 
3. e4 Bc5 
4. Bd3 Qxf2#

"Sicilian Defense: Snyder Variation" [FINISH WRITING]

### Queenside bishop's pawn: Saragossa opening

1. c3

This one's good for getting your queen out early on. But if you also want to get 
one of your bishops going early, choose another opening, like maybe king's pawn.

### Queen's pawn: Mieses opening

1. d3

The easy bots tend to respond with the reversed rat variation, and then I like 
to threaten the queen with my bishop backed up by my own queen.

1. d3 e5
2. Be3 d6
3. Qd2

They never take the bait, but I'm usually able to get their queen some other 
way.

[FINISH WRITING]

### King's pawn: Van't Kruijs opening

1. e3

Statistically, this is the worst opening. According to the statistics, you only 
a 28% chance of winning with this opening, and only a 25% chance of stalemate. 
Which means almost a 1-in-2 chance you will lose. But of course those are odds 
without knowing anything about your opponent.

For what it's worth, I can beat all the easy computer programs, like Stockfish 
level 1) with this opening. For the hard programs, like Stockfish level 8, I'm 
gonna lose no matter what opening I use.

What it boils down to


you'll probably wish you had started with e4.

### Kingside bishop's pawn: Barnes opening

1. f3

This is a particularly bad opening, in my opinion. It exposes your king to check 
from your opponent's queen or kingside bishop very early on, and it makes 
mobilizing your own queen and bishops rather awkward.

If you use this opening, be absolutely certain to also open an avenue of escape 
for your king, or else risk an embarrassingly early checkmate. Like this:

1. f3 e6
2. g4 Qh4#

### Kingside knight's pawn: Hungarian opening

1. g3

Also called "king's fianchetto opening."

### Kingside rook's pawn: Clemenz opening

1. h3

A rather awkward opening that wastes initial momentum, in my opinion.

[TODO: FINISH WRITING]
