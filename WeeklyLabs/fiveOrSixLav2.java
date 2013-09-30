import java.util.*;

public class fiveOrSixLav2{
	
	public static void main(String[] args) {
		
		int n = askForN();

		if (n % 5 == 0 && n % 6 == 0){
			System.out.printf("%d is divisible by both 5 & 6.\n", n);
		} else if ( n % 5 == 0 || n % 6 == 0 ){
			System.out.printf("%d is divisible evenly by either 5 or 6 but not both.\n", n);
		} else {
			System.out.printf("%d is not divisible by either 5 or 6.", n);
		}


	}


	private static int askForN(){

		Scanner input = new Scanner(System.in);

		//Print question
 		System.out.print("Please input your N value:");

 		int n = 0;

		try {
			n = Integer.parseInt(input.nextLine());
		} catch (Exception e) {
			System.out.println("Not a parsable Integer, try again!");
		}

		return n;

	}

}