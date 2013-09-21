/** 
* @version 1.0
* @author Daniel Alan Miller
*/

import java.util.*;

//Helper class for multiple Project 1 questions
public class Helper{

	/**
	* Method which asks the user for an 'n' input. If the input is not 
	* a parseable integer, an error is caught and the user informed that
	* their input was not valid.
	* @return The integer which the user inputs.
	*/
	public static int askForN(){

		//Instantiate the Scanner input 
		Scanner input = new Scanner(System.in);

		//Asks the user for their 'n' input
 		System.out.print("Please input your \"n\":");

 		//Assigns the users input as string_n
		String string_n = input.nextLine();		

		//Try to parseInt the inputted variable, otherwise catch the error and print
		// error message.
		int i= 0;
		try {
			i = Integer.parseInt(string_n);
		} catch (Exception e) {
			System.out.println("Not a parsable Integer, try again!");
		}

		return i;
	}
}