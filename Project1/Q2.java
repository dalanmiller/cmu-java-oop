import java.util.*;

public class Q2 {

	public static void main(String[] args){
 
 		Scanner input = new Scanner(System.in);
 		System.out.print("Please input your \"n\":");
		String string_n = input.nextLine();		

		int n = 0;
		try {
			n = Integer.parseInt(string_n);
		} catch (Exception e) {
			System.out.println("Not a parsable Integer, try again!");
		}

		int total = n;

		for (int i = n - 1 ; i > 0; i-- ){
			total *= i;
		}

		System.out.printf("The factorial of %s is: %s", n, total);
	}
}
