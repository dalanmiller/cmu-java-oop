/** 
* @version 1.0
* @author Daniel Alan Miller
*/

import java.util.*;
import java.io.*;

//Class that runs the quick grouping check
public class GroupingCheck {

	public static void main(String[] args) {
			
		//Ensure that there is actually an argument
		if (args.length < 1 ){
			System.out.println("No argument path provided");
		}

		//Init the File object
		File f = new File(args[0]);

		//Ensure that a file exists at the path provided
		if (!f.exists()){
			System.out.println("No file exists at the path specified");
		}

		//Init the variables to use in the while loop
		BufferedReader in;
		int r;
		char charR;
		
		//Using a stack to push when I find an opening brace/bracket and pop when I find a closing brack to match 
		Stack<Character> s = new Stack<Character>();

		try {
			//Attempt to open file with FileReader and wrap in BufferedReader
            in = new BufferedReader(new FileReader(f));

            	//Keep reading from the file character by character until end and a -1 is returned.
	            while((r = in.read()) != -1) {
	            	
	            	//Cast the integer returned from the reader into a character
	            	charR = (char)r;
	            	
	            	//If current char matches an opening brace/bracket and push onto the stack 
	            	if (charR == '{' || charR == '(' || charR =='['){

	            		s.push(charR);

	            	//Else if char matches a closing brace/bracket 
	            	} else if (charR == '}' || charR == ')' || charR == ']'){

	            		//If empty stack and end brace/bracket detected, exit if empty
	            		if (s.empty()){ System.out.println("NON-MATCH (Empty Stack)"); System.exit(1); }

	            		//Make sure that we match opening to closing bracket, if the ending matches the opening
	            		// break and skip the default.
	            		switch(charR){

            				case '}': if (s.pop() == '{') break; 
            				case ')': if (s.pop() == '(') break;
            				case ']': if (s.pop() == '[') break;
            				default:
            					System.out.println("OVERLAP DETECTED (Bracket Mismatch)");	
            					System.exit(1);
            			}	
	            	} 
	           	}

	           	if (!s.empty()){
	           		System.out.println("NON-MATCH (Stack Not Empty)");	
            		System.exit(1);
	           	} else {
	           		System.out.println("Brackets/Braces paired correctly");
	           	}

	    //Catch all exceptions if necessary
    	} catch (Exception e) {

    		System.out.println(e);
    		e.printStackTrace();
    	}

	}
	
}


