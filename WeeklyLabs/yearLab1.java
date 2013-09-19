import java.util.*;

/**
*  
*
*
*/

public class yearLab1{
	static String howOld = "Please input your year of birth: ";
	static String desiredYearAtAge = "At what year of age would you like to know the year it will be?: ";

	public static void main(String[] args){

		int year = askFor(howOld);
		int age = askFor(desiredYearAtAge);

		System.out.printf("\n THE YEAR WILL BE %d when you are %d years of age!", year+age, age);
	}

	private static int askFor(String q){

		Scanner input = new Scanner(System.in);

		//Print question
 		System.out.print(q);

		int n = 0;
		try {
			n = Integer.parseInt(input.nextLine());
		} catch (Exception e) {
			System.out.println("Not a parsable Integer, try again!");
		}

		return n;

	}

}