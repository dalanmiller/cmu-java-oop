public class Q3 {

	public static void main(String[] args){
 
 		int n = Helper.askForN();

		System.out.println(" # - 1 - 2 - 3 - 4 - 5 - 6 - 7 - 8 - 9 - 10 - 11 - 12");

		for(int j = 1; j<= 12; j++ ){
			for (int i = 1 ; i <= 12; i++ ){
				if (i == 1){
					System.out.println(" |");
					System.out.printf("%2d", j);
				}
				
				if (i < 10){
					System.out.printf("   %s", (j * i)%n );
				} else {
					System.out.printf("   %2d", (j * i)%n );
				}

				if (i == 12){
					System.out.print("\n");
				}
			}
		}

	}

}
