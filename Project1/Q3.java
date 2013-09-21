/** 
* @version 1.0
* @author Daniel Alan Miller
*/

//Class for Question 3
public class Q3 {

	public static void main(String[] args){
 	
 		//Ask the user for their 'n' input
 		int n = Helper.askForN();

 		//Print the top row of the graph
		System.out.println(" # - 01 - 02 - 03 - 04 - 05 - 06 - 07 - 08 - 09 - 10 - 11 - 12");

		//iterate through the graph rows. 
		for(int j = 1; j<= 12; j++ ){

			//iterate through the graph columns
			for (int i = 1 ; i <= 12; i++ ){

				//If the loop is in the first column, print the row
				if (i == 1){
					System.out.println(" |");
					System.out.printf("%2d", j);
				}
				
				//If the loop is in any of the middle columns, print the
				// result of column * row and then modulus by the user
				// inputted 'n' 
				System.out.printf("   %2d", (j * i)%n );

				//If we have reached the last column add a newline char
				// to start the next row.
				if (i == 12){
					System.out.print("\n");
				}
			}
		}
	}
}
