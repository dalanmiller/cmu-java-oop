/** 
* @version 1.0
* @author Daniel Alan Miller
*/

//Import java.util package for use of Date class
import java.util.*;

//Class for Question 6
public class Q6{

	public static void main(String[] args){

		//Initial instructions print out.
		System.out.println("Your job is to type the sentence \"I type very quickly \" as fast as you can.");
		System.out.println("When you are ready, press enter, type the sentence, and press enter again.");
		System.out.println("Now press enter...");
		
		//This askFor waits for the user to press enter before moving forward.
		askFor("");

		//Initialize a new Date object and then hold the time
		long before = new Date().getTime();

		//Now store the user's input for typing out the sentence
		String entry = askFor("");

		//Run this loop while 'entry' does not equal the target sentence
		do{
			//Instructions to user to repeat
			System.out.println("Sorry, but your entry does not match \"I type very quickly\"");
			System.out.println("Please press enter and try again!...");

			//Wait for enter
			askFor("");

			//Assigned new time to before 
			before = new Date().getTime();

			//Assign new entry for user input. 
			entry = askFor("");

		} while (entry.compareTo("I type very quickly") != 0); 

		//Calculate time that has elapsed since the moment before the user
		// was able to start typing.
		long elapsed = new Date().getTime() - before;

		//Print out results to the user. 
		System.out.printf("\nWay to go Speed Racer! Your total time was %dms!%n", elapsed);

	}

	/**
	* Method which takes a String question which is shown to the user,
	* and then return their input. 
	* @param Takes String q which is expected to be a question sentence.
	* @return A string which is the user's input or answer to the question.  
	*/
	private static String askFor(String q){

		Scanner input = new Scanner(System.in);

		//Print question
 		System.out.print(q);

		return input.nextLine();

	}

}