Author: Mike Urbano
This simple java application takes an input file which represents a tic tac toe
board and checks to see if there is a winner. The input file format appears as
such:
X X X O O X X O O
X O O O X X O X O
The format represents three rows of characters. So, in the above example, the
first line shows a game where X is the winner via the first row of X's. The
second line represents a game with no winner; either by row, column or
diagonally. The main function scans and reads the input file and continues to
do so as long as there is more input. It takes a line of input and then calls
the checkBoard function to check for a winner. The checkBoard function contains
4 small code chunks. The first part checks if there is a winner by row, the
second chunk checks if there is a winner by column, the next chunk checks for a
winner by the forward diagonal and then finally, the last part checks for a
winner by backward diagonal. The program displays what the board looks like,
then displays if there is a winner or not, if so, it displays the value of the
player and the method of the win.
*******************************************************
Compile application: javac Tictac.java
Run application: java Tictac 
