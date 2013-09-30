/** 
* @version 1.0
* @author Daniel Alan Miller
*/

import java.util.*;

//Class for Question 3
public class Q3{

	//Int array to hold the 10000 random integers
	private static int[] rando = new int[999999];

	//Int to hold the range of integers that the test should generate.
	// The default 100 will test 1 - 100 inclusive.
	private static int n = 9999;

	public static void main(String[] args) {
			
		//Generate the random numbers and put each into an index in the array
		for (int i = 0; i < rando.length; i++){
			rando[i] = new Random().nextInt(n) + 1;
		}

		//Generate a random key in which to search for
		int key = new Random().nextInt(n) + 1;

		//Begin the test for linearSearch
		//Save before time for testing linear search.
		long startTime = System.currentTimeMillis();

		//Convert randon into list and then find the first instance 
		// of the key. 
		Arrays.asList(rando).indexOf(key);

		//Get the elapsed time by subtacting the original time from the 
		// time immediately after the search is complete. 
		long linearExecutionTime = System.currentTimeMillis() - startTime;


		//Begin the test for binarySearch
		//Assign a new start time 
		startTime = System.currentTimeMillis();
		//Sort the rando integer array
		Arrays.sort(rando);

		//Use a binary search implementation to search for the key in 
		// the sorted array.
		Arrays.binarySearch(rando, key);

		//Calculate elapsed time by subtacting the original time from the 
		// time immediately after the search is complete. 
		long binaryExecutionTime = System.currentTimeMillis() - startTime;		

		//Print results
		System.out.printf("Time to complete linearSearch: %2d ms \n", linearExecutionTime);
		System.out.printf("Time to complete binarySearch: %2d ms \n", binaryExecutionTime);
	}	

}