/** 
* @version 1.0
* @author Daniel Alan Miller
*/

import java.util.*;

//Class for Question 3
//This class does a comparison between linear and binary search on an array
// of randomly generated integers and then outputs the results in time to completion. 
// For more information please refer to question three of Project 2. 
public class Q3{

	//Int array to hold the 999999 random integers
	private static int[] rando = new int[999999];

	//This is the main method of the class which runs all the simulation code. 
	public static void main(String[] args) {
			
		//Generate the random numbers and put each into an index in the array
		for (int i = 0; i < rando.length; i++){
			rando[i] = new Random().nextInt();
		}

		//Generate a random key in which to search for
		int key = new Random().nextInt();

		//Begin the test for linearSearch
		//Save before time for testing linear search.
		long startTime = System.currentTimeMillis();

		//Convert randon into list and then find the first instance 
		// of the key. 
		Arrays.asList(rando).indexOf(key);

		//Get the elapsed time by subtacting the original time from the 
		// time immediately after the search is complete. 
		long linearExecutionTime = System.currentTimeMillis() - startTime;


		//Sort the rando integer array outside of the time keeping because
		// it's assumed the array is presorted.
		Arrays.sort(rando);

		//Begin the test for binarySearch
		//Assign a new start time 
		startTime = System.currentTimeMillis();
		
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
