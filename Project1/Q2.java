public class Q2 {

	public static void main(String[] args){
 
 		int n = Helper.askForN();

		int total = n;

		for (int i = n - 1 ; i > 0; i-- ){
			total *= i;
		}

		System.out.printf("The factorial of %s is: %s", n, total);
	}
}
