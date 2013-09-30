/** 
* @version 1.0
* @author Daniel Alan Miller
*/

//Class for Question 1
public class Q1 {

	//An array of booleans which correpsond to the 100 lockers.
	private static boolean[] lockers = new boolean[99];

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
				System.out.printf("Locker %2d is open\n", i+1);
			}
		}

	}
	
}