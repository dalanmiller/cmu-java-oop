/** 
* @version 1.0
* @author Daniel Alan Miller
*/

//Problem 4
public class Q4 {

	public static void main(String[] args){

		//Test/Example code 
		System.out.print("Now testing F(0) => ");
		System.out.println(F(0));
		System.out.print("Now testing F(1) => ");
		System.out.println(F(1));
		System.out.print("Now testing F(25) => ");
		System.out.println(F(25));
	}

	/** 
	* Method F which was given in the assignment to test our ability
	* to write a recursive function.
	* @param Takes integer N
	* @return Returns 3 if n = 0, 5 if n = 1, and then uses a recursive statement for all other values.
	*/
	public static int F(int n){
		switch(n){
			case 0:
				return 3;
			case 1: 
				return 5;
			default:
				return F(n-1) + 5 * F(n-2) + n + 3;
			}
	}
}