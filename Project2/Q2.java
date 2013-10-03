/** 
* @version 1.0
* @author Daniel Alan Miller
*/

import java.util.*;
	
	
//Class for Question 2
//This class simulates thousands of games of craps and outputs a ratio of wins
// to losses. 
public class Q2{

	//Total number of wins 
	private static int wins = 0;

	//Total number of losses
	private static int losses = 0;

	//Integer to hold number of games. 
	private static int numberOfGames = 10000;
	
	//This is the main method of the class and runs all the simulation code. 
	public static void main(String[] args) {
			
		//Iterate through the number of games 	
		for (int i = 1; i <= numberOfGames; i++){

			//Simulate the sum of a double dice roll
			int roll = diceRoll() + diceRoll();

			//Integer to hold the current point value if necessary.
			int point;

			//Switch statement that results in either the roll being  
			// one of the 'points' values which sends the logic to the next phase, or 
			// rolling a 2, 3, 12 which results in an immediate loss,
			// or rolling anything else which results in an immediate win.
			switch(roll){
				case 4: case 5: case 6: case 8: case 9: case 10:

					point = roll;
					break;
					
				case 2: case 3: case 12:

					losses++;
					continue;

				default: 

					wins++;
					continue;
			}


			//Simulation of the second phase of the game where a dice is 
			// is rolled until the point value is rolled  and the user wins
			// or a 7 is rolled and the user loses. 
			do {
				
				//Dice roll
				roll = diceRoll() + diceRoll();

				if (roll == 7){
					losses++;
				} else if (roll == point) {
					wins++;
				}

			} while (roll != 7 && roll != point);

		}

		//Print out results
		System.out.printf("Wins   : %d\n", wins);
		System.out.printf("Losses : %d\n", losses);
		System.out.printf("Win%%   : %f\n", (double)wins / (double)numberOfGames);


	}

	/**
	* A method to represent a single dice roll (between 1 - 6 inclusive)
	* @return Returns the result of one dice roll
	*/
	public static int diceRoll()  {
		return new Random().nextInt(6) + 1;
	}

}
