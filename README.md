# Chess

WORK IN PROGRESS: I've decided that in this program you can play against the 
computer. It will have three levels of difficulty: Easy, Medium and Hard, 
roughly equivalent to Stockfish levels 1, 4, 7.

When playing White, the computer will always choose the opening randomly, 
regardless of the difficulty level.

* On Easy, the computer will only look one move ahead, and prioritize short term 
checks and captures over longer-term strategy. When playing Black, the computer 
will choose its response to White's opening randomly without regard for 
vulnerabilities that might thus be exposed. There will be unlimited undo for any 
reason.
* On Medium, the computer will look ahead at more moves, but still prioritize 
short term advantages over longer-term strategy. When playing Black, the 
computer will choose its response so as to avoid vulnerabilities. Undo will be 
limited to reversing the loss of a queen, bishop, knight or rook, or to avoid 
stalemate or draw.
* On Hard, the computer will prioritize long term strategy over short term 
advantages. Undo will be limited to avoiding stalemate or draw.

This project will not include machine learning or any of the other things that 
generally fall under the umbrella of "artificial intelligence."

This project is currently in the research phase. At this point I'm focusing more 
on studying the game than in programming it.

The next phase will be to enable playing the game on the command line (e.g., if 
you're playing White, you might type "e4" to make your first move).

The second phase will be the graphical user interface.

Scala 2.13 (with Java 8), JUnit 5.

It would be a good idea to make sure all the terms in Terminology.md are in the 
project dictionary.

I've decided to use the 
[ChessVideos.tv Diagram Generator](https://www.chessvideos.tv/chess-diagram-generator.php). 
That's licensed under BSD, which I hope is no problem with GPL.
