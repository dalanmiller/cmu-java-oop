public class calcLab2 {
	
	public static void main(String[] args) {
	


	}

	public static int sum(int... n){

		if (n.length == 1) {
			return n[0];
		} else {
			int total = 0;
			for ( int num : n) {
				total += num;
			}
			return total;
		}
	}

	public static boolean oddEven(){
		return true;
	}


	private static int askForInts(){

		Scanner input = new Scanner(System.in);

		//Print question
 		System.out.print("Please input three integers!");

		int n = 0;
		try {
			n = Integer.parseInt(input.nextLine());
		} catch (Exception e) {
			System.out.println("Not a parsable Integer, try again!");
		}

		return n;

	}
}

