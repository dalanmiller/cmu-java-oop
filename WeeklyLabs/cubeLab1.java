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
			char[] s = new char[i-1];
			Arrays.fill(s, ' ');
			System.out.printf("%s", new String(s) );

			System.out.printf("*");

			char[] t = new char[n-1];
			Arrays.fill(t, ' ');
			System.out.printf("%s", new String(t) );

			System.out.printf("*");

			

			if (i<(n/2)){
				int spacesToGo = s.length + t.length + 2;

				char[] m = new char[14 - spacesToGo];
				Arrays.fill(m, ' ');

				System.out.printf("%s*", new String(m));
			}
			System.out.printf("\n");
		}


		//Top front edge
		char[] l = new char[n];
		Arrays.fill(l, '*');

		//Spaces before back edge mark
		char[] m = new char[14 - l.length];
		Arrays.fill(m, ' ');

		System.out.printf("%s%s*\n", new String(l), new String(m));


		//Print front face
		for(int i = n; i > 0; i--){

			output = "*";
			char[] s = new char[n-2];
			Arrays.fill(s, ' ');
			output += new String(s);
			output += "*";

			if (i >= n/2){

				s = new char[14 - output.length()];
				Arrays.fill(s, ' ');
				output += new String(s);
				output += "*";

			} else {

				s = new char[i];
				Arrays.fill(s, ' ');
				output += new String(s);
				output += "*";

			}

			System.out.println(output);
		}
		//Bottom front edge
		System.out.println(new String(l));

	}
}