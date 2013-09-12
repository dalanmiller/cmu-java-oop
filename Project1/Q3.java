import java.util.*;

public class Q3 {

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

		System.out.println(" # - 1 - 2 - 3 - 4 - 5 - 6 - 7 - 8 - 9 - 10 - 11 - 12");

		for(int j = 1; j<= 12; j++ ){
			int row = 1;
			for (int i = 1 ; i <= 12; i++ ){
				if (i == 1){
					System.out.println(" |");
					System.out.printf("%2d", j);
				}
				
				if (i < 10){
					System.out.printf("   %s", (row * i)%n );
				} else {
					System.out.printf("   %2d", (row * i)%n );
				}

				if (i == 12){
					System.out.print("\n");
					row++; 
				}
			}
		}

	}


}
