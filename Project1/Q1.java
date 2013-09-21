/** 
* @version 1.0
* @author Daniel Alan Miller
*/

//Class for Question 1 
public class Q1 {

	public static void main(String[] args){
 		
 		//Ask the user for their 'n' input
 		int n = Helper.askForN();

 		//Declare int for the total sum
		int total = 0;

		//Loop through 'n' amount of iterations and add each 'n' 
		// to current total
		for (int i = n ; i > 0; i-- ){
			total += i;
		}

		//Print out the total to the user
		System.out.format("Your total sum is: %s", total);
	}
}
