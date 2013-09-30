
import java.util.*;
import java.lang.Math;

public class calcLab2 {

	private static int[] numbers;
	
	public static void main(String[] args) {
	
		numbers = askForInts();

		System.out.println("Sum of values");
		int sum = 0;
		for (int n : numbers){
			sum += n;
		}
		System.out.println(sum);

		System.out.print("\n");
		System.out.println("Average of values");
		System.out.println( (double)(sum) / numbers.length );

		System.out.print("\n");
		System.out.println("Min value");
		int min = numbers[0];
		int max = numbers[0]; 
		for (int i = 1; i < numbers.length; i++){
			
			min = min < numbers[i] ? min : numbers[i]; 	
			max = max > numbers[i] ? max : numbers[i];
		}

		System.out.println(min);

		System.out.print("\n");
		System.out.println("Max value");
		System.out.println(max);

		System.out.print("\n");
		System.out.println("Product of values");
		System.out.println(numbers[0] * numbers[1] * numbers[2]);		

		System.out.print("\n");
		for (int n : numbers){
			System.out.printf("The number %d is: ", n);
			if (n % 2 == 0){
				System.out.print("even!\n");
			} else {
				System.out.print("odd!\n");
			}
		}

	}

	public static int sum(int[] n){
		if (n.length == 0 ) {
			return 0;
		} else if (n.length == 1) {
			return n[0];
		} else {
			int total = 0;
			for ( int num : n) {
				total += num;
			}
			return total;
		}
	}


	private static int[] askForInts(){

		Scanner input = new Scanner(System.in);

		//Print question
 		System.out.print("Please input three integers!");

		int[] n = new int[]{0,0,0};

		int count = 0;
		int inc = 0;

		do {
			try {
				inc = Integer.parseInt(input.nextLine());
			} catch (Exception e) {
				System.out.println("Not a parsable Integer, try again!");
			}

			n[count] = inc;
			count++;

		} while ( count < n.length );




		return n;

	}
}

