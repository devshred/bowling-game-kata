# Bowling-Game Kata
Bootstrap code to exercise the bowling-game kata as described by uncle Bob.

## the rules of bowling
* each game consists of 10 frames
* in each frame the player has two rolls to knock down 10 pins
* bonuses:
  * spare: if a player knocks down 10 pins in two rolls, the bonus for that frame is the number of pins of the next roll
  * strike: if a player knocks down 10 pins in one roll, the bonus for that frame is the number of pins of the next two rolls
* the player that scores a strike or spare in the 10th frame, is allowed to do 3 rolls to complete the frame 

## the exercise
* run the [test](src/test/java/org/example/bowling/CyberBowlORamaTest.java)
* implement the [interface](src/main/java/org/example/bowling/BowlingGame.java)
* implement the proposed tests

Source: [TheBowlingGameKata by Robert C. Martin](http://butunclebob.com/ArticleS.UncleBob.TheBowlingGameKata)