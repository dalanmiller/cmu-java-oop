import java.util.*;

public class Helper{

	public static int askForN(){

		Scanner input = new Scanner(System.in);
 		System.out.print("Please input your \"n\":");
		String string_n = input.nextLine();		

		int n = 0;
		try {
			n = Integer.parseInt(string_n);
		} catch (Exception e) {
			System.out.println("Not a parsable Integer, try again!");
		}

		return n;

	}

}