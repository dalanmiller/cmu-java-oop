public class Q1 {

	public static void main(String[] args){
 
 		int n = Helper.askForN();

		int total = 0;

		for (int i = n ; i > 0; i-- ){
			total += i;
		}

		System.out.format("Your total sum is: %s", total);
	}
}
