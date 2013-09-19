public class Q5{

	private static int[] results = new int[11];

	public static void main(String[] args){

		int n = Helper.askForN();

		populateResults(n);

		int total = 0;
		//Convert each value to a percentage of the total n
		for (int i = 0; i < 10; i++){

			int calc = (int)(((double)results[i] / (double)n) * 100.0);
			results[i] = calc;
			total+=calc;
		// 	System.out.println("After: "+results[i]);
		}

		//Round final amount to fit nicely within 100
		results[10] = 100 - total;

		//Print graph
		for (int i=10; i>=0; i--){
			String output = "";

			output += String.format("%3s%% - ", i*10);

			//Iterate through all the percentages in the results find which ones
				//should be printed for this row.
			for ( int j : results){
				if (j >= i * 10){
					output += "*";
				} else {
					output += " ";
				}
				//spaces between each value
				output+="  ";
			}

			System.out.println(output);

		}

		System.out.println("      02-03-04-05-06-07-08-09-10-11-12");
		
	}

	public static int rollDice(){
		return 1 + (int)(Math.random() * (6));
	}

	public static void populateResults(int n){
		for (int i = 1; i<=n; i++ ){
			results[rollDice() + rollDice() - 2]++;
		}
	}

}