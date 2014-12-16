TicTacToe-AI
===

##About
Tic Tac Toe is an easy game to play. Though it is easy, but there are still game theory knowledge in it. So I wrote this program to practice myself.

I wrote the non-gui version earlly, and when I knew more about java, I wrote the gui/swing version.

The project is about game theory, and some logic and *java swing*.

##Tic Tac Toe AI

There is no gui. you can input a 'x y' to play with AI.


##Tic Tac Toe AI GUI

The GUI is written with swing, just click the mouse to play with AI.

##How to use it
There are binary files in [bin](/bin) folder.

You can download them and play with the little program.

##Game Theory

1 Central First

2 Angle Second

3 Attack
	if a line already has 2 the same color piece and the third position is space: 
		check the third position
		
4 Defend

	if a line already has 2 the different color piece and the third position is space: 
		check the third position
		
5 Trash Time

	to win or to lost is already done. just check the space position.
	
6 Special Situation

	If the player first, but it did not check center, and just check an angle.
	Then after AI check the center, if player check opposite angle,
	AI did not folle the rule 2 'Angle Second', but check a borader position.

##Bug Fix

And there is a bug in it. This bug occures in a playe fist situation, the judge will make AI win though it is a draw.

For encourage the one who find it and fix it.

#1.00 Darkcoin

###For The One 
