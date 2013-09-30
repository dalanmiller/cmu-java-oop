import java.util.*;


public class fiveDigitsLab2{
	
	private static int n = 0;

	public static void main(String[] args) {
		
		n = askForFiveDigitN();


		String stringN = Integer.toString(n);

	
		System.out.printf("Digits in %d are:", n);

		for (String s : stringN.split("")){
			System.out.printf(" %s", s);
		}
		System.out.println("");



	}

	private static int askForFiveDigitN(){

		Scanner input = new Scanner(System.in);

		//Print question
 		System.out.print("Please input a five digit number!");

 		int n = 0;

		try {
			n = Integer.parseInt(input.nextLine());
		} catch (Exception e) {
			System.out.println("Not a parsable Integer, try again!");
		}

		return n;

	}

}