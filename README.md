# Chess

WORK IN PROGRESS: I've decided that in this program you can play against the 
computer. It will have three levels of difficulty: Easy, Medium and Hard, 
roughly equivalent to Stockfish levels 1, 4, 7.

When playing White, the computer will always choose the opening randomly, 
regardless of the difficulty level.

* On Easy, the computer will only look one move ahead, and prioritize short term 
checks and captures over longer-term strategy. When playing Black, the computer 
will choose its response to White's opening randomly without regard for 
vulnerabilities that might thus be exposed.
* On Medium, the computer will look ahead at more moves, but still prioritize 
short term captures over longer-term strategy [FINISH WRITING]
* On Hard, [FINISH WRITING]

This project is currently in the research phase. At this point I'm focusing more 
on studying the game than in programming it.

Scala 2.13 (with Java 8), JUnit 5.

It would be a good idea to make sure all the terms in Terminology.md are in the 
project dictionary.

I've decided to use the 
[ChessVideos.tv Diagram Generator](https://www.chessvideos.tv/chess-diagram-generator.php). 
That's licensed under BSD, which I hope is no problem with GPL.
