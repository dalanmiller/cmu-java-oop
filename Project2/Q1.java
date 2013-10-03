/** 
* @version 1.0
* @author Daniel Alan Miller
*/

//Class for Question 1
//This class is to complete Question 1 and ultimately simulates eliminating
// in a inefficient fashion all non-perfect square numbers from a set. 
public class Q1 {

	//An array of booleans which correpsond to the 100 lockers.
	private static boolean[] lockers = new boolean[100];

	//This is the main method of this class and runs all the code for this assignment.
	public static void main(String[] args){

		//Iterate through 100 simulated students		
		for (int s = 1; s <= 100; s++){

			//Translate index of student to initial starting locker 
			// and then the stepping amount
			for( int i = s-1; i < lockers.length; i+=s ){

				//invert the current state of that locker
				lockers[i] = !lockers[i];
			}
		}

		//Iterate through the lockers and print if the locker is open
		for( int i = 0; i < lockers.length; i++){

			// If the locker at 'i' is open
			if (lockers[i]){

				//Print out locker is open message
				System.out.printf("Locker %3d is open\n", i+1);
			}
		}

	}
	
}
