## Battleship Project Documentation

Week 1:

We decided on giving each other roles for how we would go about the project. We decided that Anthony would make a proof of concept in Replit

We went over how the game was played and discussed how we wanted the game to be played. Decided on the game being two players, as opposed to playing against a computer, where the device it was played on would switch between each other.

We laid out all the classes and objects we would need in order to make the game. 

Classes:
Ship //contains information about a ship such as length

Destroyer // length of 2
Cruiser  // length of 3
Submarine // 3
Battleship // 4
Carrier // 5

//all of these classes were children of the ship class. Names are based on the actual game.

Square //Ethan think’s we need this, Anthony says it's unnecessary. It would have information about what's on the actual squares of a grid

A grid class// this would be a 2d array of square objects and displayed the grid to be played on

The actual game itself would probably be controlled in the main method, seems unnecessary to create a different method for running the game.

Methods 

Make an action during a turn.
Print a grid every turn
Setting up the grid in the beginning of the game
Check when a game is over
Checking if a ship can be placed in a valid spot


Anthony makes the ship class and the others first because it was easier.

Disagreements on whether we needed a square class. When Anthony starts developing the grid method, file name BattleGrid, he realizes we do need it.

Anthony creates a square class with information about if a square has a ship, is hit, or is missed, all booleans.

Created a toString method that outputs a different character depending on the above booleans.

Not occupied and not miss -> “-” //the default output that is given at the start, when the player has not interacted with the square yet.

Not occupied and a miss -> “*” //to show that a given input is a miss if there is no ship there.

Is occupied and hit -> “X” //shows that a player guessed correctly


Ethan starts exploring Processing. Downloads Processing and looks at the sample code, trying to understand it. Starts with the tutorials provided by Processing.

Week 2:

Goals: Work on the grid class, learn processing.

In BattleGrid class, create a turn method that tells the result of the turn, if it hits or misses, and changes the square to match the information. 

Midway through this and the start of the Main method, we came up with the idea of there being 2 different kinds of grids. One of them would be shown when setting up the grid, the other would be implemented after the setting up phase is finished. The second grid would be hidden and is the only one that would be used from that point forward.

Anthony begins development of the Main method and the board setup. 
Challenge: How to place ships while giving a choice between horizontal and vertical placement. AND make sure that they don’t place it in an invalid position.

Realizes that there should be a different character to the toString of the square class. “O” signifies that a ship is placed on the player's own board, shown only during the setup phase.

Solution: each ship has information about their own position and if it’s horizontal or vertical. Also, when inputting coordinates, the options will be limited based on if it’s horizontal or vertical. 

After both players set up the board, switch to the hidden board. 
Challenge: How to check if the game is over?
Solution: Do it in the BattleGrid class, by checking if there are any ships left to hit. Depending on whose turn it is, call the method from the BattleGrid class and print the winner based on that.

Anthony is done with his part. The Base code is finished

Ethan works on the Processing tutorial. General opinion is that it is pretty cool.
https://hello.processing.org/editor/
The tutorial 

Anthony finishes writing comments for Ethan to hopefully have an easier time transferring the code.

Ethan finishes the tutorial. To do: copy and paste code and then switch output code for graphical output. 

Challenge: Copying and pasting into Processing is very confusing. Hard to tell how to exactly correspond text output to visuals.

Ethan gives up completely on copy and pasting and instead opts to use Anthony’s code as a framework for writing the code in Processing. 

Challenge: Inheritance is very weird for some reason, you different files can’t interact with each other for some reason. Lots of squiggly lines
Solution: Put everything in one file. 


Challenge: Ethan is struggling with how to make interactive graphics. How to get the mouse positions and correspond it to interacting with the grid. 
Solution: Make the grid out of individual square objects instead and tile them out
Challenge: How do you print out each square object so they are perfectly spaced apart?
Challenge: How do you distinguish between each square object?
Challenge: It feels like you can’t make any progress without first answering the first two questions above

SOLUTION: Give up completely and try something else. Use someone else’s code to get inspiration or modify it to match our goal.

Reference: https://forum.processing.org/two/discussion/15952/just-a-little-question-to-how-to-make-the-game-battleships.html

In the forum, a user provides a step by step process on how to make the game. However, it is very different and lacks lots of features of what we are trying to make. 

Ethan figures out and understands how the code works.

Challenge: Ethan can’t figure out how to, using the given code, apply it so that you can place several objects in a single row.
Challenge: Ethan is running low on time and very frustrated with the project.

Ethan gives up on his part completely at the end of the week.

Reflection (Ethan): I think the reason why I couldn’t successfully complete the project was because I did not have enough experience with Processing. Although the tutorials were useful, they only ended up covering the bare minimum to start processing, and did not show or go into detail in many of the features covered in the forum. This project could have been done more successfully through starting with easier, mini projects to both learn Processing more thoroughly and get comfortable with using it. Implementing Battleship into Processing was a much harder task than it appeared to be and is better suited as a project done after several weeks of learning. 

Additionally, I could have probably devoted even more time to this project and make a clear roadmap for programming the game. It is partially my fault for why I could not finish the project.
