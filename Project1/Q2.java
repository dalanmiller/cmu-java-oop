
/** 
* @version 1.0
* @author Daniel Alan Miller
*/

//Class for Question 2
public class Q2 {

	public static void main(String[] args){
 	
 		//Ask the user for their 'n' input
 		int n = Helper.askForN();

 		//Declare int for the total sum
		int total = n;

		//Loop through 'n' amount of iterations and multiply each 'n' 
		// to current total
		for (int i = n - 1 ; i > 0; i-- ){
			total *= i;
		}

		//Print out the total to the user
		System.out.printf("The factorial of %s is: %s", n, total);
	}
}
