import java.util.*;

public class Q6{

	public static void main(String[] args){


		System.out.println("Your job is to type the sentence \"I type very quickly \" as fast as you can.");
		System.out.println("When you are ready, press enter, type the sentence, and press enter again.");
		System.out.println("Now press enter...");
		

		askFor("");
		long before = new Date().getTime();
		String entry = askFor("");
		do{
			System.out.println("Sorry, but your entry does not match \"I type very quickly\"");
			System.out.println("Please press enter and try again!...");
			askFor("");
			before = new Date().getTime();
			entry = askFor("");

		} while (entry.compareTo("I type very quickly") != 0); 

		long elapsed = new Date().getTime() - before;

		System.out.printf("\nWay to go Speed Racer! Your total time was %dms!%n", elapsed);


	}

	private static String askFor(String q){

		Scanner input = new Scanner(System.in);

		//Print question
 		System.out.print(q);

		return input.nextLine();

	}

}