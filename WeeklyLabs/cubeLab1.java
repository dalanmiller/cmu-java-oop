import java.util.Arrays;

public class cubeLab1{
	static int n = 10;	

	public static void main(String[] args){

		//Print top
		String output = "";
		for(int i =1; i<=n;i++){
			output+="*";
		}
		char[] spaces = new char[n/2];
		Arrays.fill(spaces, ' ');

		System.out.printf("%s%s%n",new String(spaces),output);

		//Print top, side edges
		for(int i=n/2; i>0; i--){
			char[] s = new char[i];
			Arrays.fill(s, ' ');

			char[] t = new char[n];
			Arrays.fill(t, ' ');

			System.out.printf("%s%s%s%s%n", new String(s),"*", new String(t),"*");
		}


		//Top front edge
		char[] l = new char[n];
		Arrays.fill(l, '*');

		System.out.println(new String(l));


		//Print front face
		for(int i = n; i>0; i--){
			output = "*";
			char[] s = new char[n-2];
			Arrays.fill(s, ' ');
			output+= new String(s);
			output+= "*";
			System.out.println(output);
		}

		//Bottom front edge
		System.out.println(new String(l));


	}

}