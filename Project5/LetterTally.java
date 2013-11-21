/** 
* @version 1.0
* @author Daniel Alan Miller
*/

import java.util.*;
import java.io.*;


//Main class which handles taking the path via argument, checking that file exists, then counting the 
// all the letters in the file. 
public class LetterTally{

	public static void main(String[] args) {

		//Ensure that an argument exists
		if (args.length < 1 ){
			System.out.println("Please provide a path to the file");
		}

		//Init File object
		File file = new File(args[0]);

		//Ensure that the file exists
		if (file.exists()){

			//Create the ArrayList with 26 indices of 0 integer.
			ArrayList<Integer> charCount = new ArrayList<Integer>(Collections.nCopies(26, 0));

			//Init variables for use inside the while loop.
			BufferedReader in;
			int r;
			char c;

        	try {

            	in = new BufferedReader(new FileReader(file));

            	//Iterate through each char in the file (which is returned as int)
            	while((r = in.read()) != -1) {
            		
            		//Cast the integer to a char and make it lowercase if possible.
            		c = Character.toLowerCase((char)r);

            		//Ensure that the char is a letter.
					if (Character.isLetter(c)){	

						//Set the appropriate index for the letter to the new value plus one
            			charCount.set( (c - 'a') , charCount.get( (int)(c - 'a') ) + 1   );	
					}
					
            	}

            	//Get the sum of all letters in the corpus.
				double totalLetters = 0.0;
				for (int i : charCount){
					totalLetters += i;
				}

				//Iterate through all the indices and output the percentage of letters over totalLetters in the corpus.
				for (int i = 0; i < charCount.size(); i++){

					//Get the ratio of current letter over total letters and round to 5 decimals
					double ratio = ((double)charCount.get(i) / totalLetters) * 100000;
					ratio = Math.round(ratio);
					ratio /= 100000;

					System.out.println((char)(i + 'a') + " = " + ratio);
				
				}

			//Catch any exceptions in case there are i/o errors
        	} catch (Exception e) {
        		System.out.println(e);
        		e.printStackTrace();
        	}
		}		
	}
}





