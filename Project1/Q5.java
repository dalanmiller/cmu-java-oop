/** 
* @version 1.0
* @author Daniel Alan Miller
*/

import java.util.Random;


//Class for Question 5
public class Q5{

	//int array to hold all the amount of times that roll was rolled.
	// index 0 corresponds to a roll of 2 upwards to index 11 which 
	// corresponds to 12.  
	private static int[] results = new int[11];

	public static void main(String[] args){

		//Ask the user for their 'n' input
		int n = Helper.askForN();

		//Run the numbers and populate the results of 'n' dice rolls. 
		populateResults(n);

		//Declare integer 'total' to hold the sum
		int total = 0;

		//Convert each value to a percentage of the total n
		for (int i = 0; i < 10; i++){

			int calc = (int)(((double)results[i] / (double)n) * 100.0);
			results[i] = calc;
			total+=calc;
		// 	System.out.println("After: "+results[i]);
		}

		//Round final amount to fit nicely within 100
		results[10] = 100 - total;

		//Print graph
		for (int i=10; i>=0; i--){
			String output = "";

			output += String.format("%3s%% - ", i*10);

			//Iterate through all the percentages in the results find which ones
			//	should be printed for this row.
			for ( int j : results){

				//Only print the star if the percentage is less than the current
				// threshold of i * 10. For example: if the percentage is
				// 42%, it will not print until the iteration is on the row 
				// correspodning to 40%. 
				if (j >= i * 10){
					output += "*";
				} else {
					output += " ";
				}

				//spaces between each value
				output+="  ";
			}

			//Print the finalized line. 
			System.out.println(output);

		}

		//Print the bottom chart row. 
		System.out.println("      02-03-04-05-06-07-08-09-10-11-12");
		
	}

	/**
	* Method for simulating a single dice roll.
	* @return An integer representing the result of a single dice roll
	*/
	private static int rollDice(){
		return new Random().nextInt(6) + 1;
	}

	/** 
	* Method for populating all the results for the class and putting the
	* results in the class attribute results. 
	* @param Takes int n for the number of dice rolls that should be rolled. 
	*/
	private static void populateResults(int n){
		for (int i = 1; i<=n; i++ ){
			results[rollDice() + rollDice() - 2]++;
		}
	}

}