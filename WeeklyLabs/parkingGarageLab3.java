import java.lang.Math;

public class parkingGarageLab3 {


	private static String[] customers = new String[]{"Daniel", "Bob", "Mark", "George"};
	private static int[] hours = new int[]{ 10, 4, 2, 20};
	
	public static void main(String[] args) {
		
		System.out.println("Outputting total charges for yesterday...\n");

		for (int i = 0; i < customers.length; i++){


			System.out.printf("%s parked for %s hour(s)\n", customers[i], hours[i]);
			System.out.printf("Total: %2f\n\n", calculateCharges(hours[i]));

		}


	}


	public static double calculateCharges(int hours){

		double total = 2.00;

		total += hours * 0.50;

		if (total > 10.00) {
			total = 10.00;
		}

		return Math.round(total * 100.0) / 100.0;

	}

}