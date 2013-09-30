import java.lang.Math;
import java.util.Arrays;

public class forStarPrintsLab3{
	
	private static int n = 50;

	public static void main(String[] args) {
		
		for (int i = 1; i <= n; i++){

			char[] outer = new char[i];
			char[] inner = new char[Math.abs(i-n)+1];
			Arrays.fill(outer, '*');
			Arrays.fill(inner, '*');

			String sOuter = new String(outer);
			String sInner = new String(inner);

			System.out.printf("%s   %s   %s   %s\n", sOuter, sInner, sInner, sOuter);
		}
			
	}
}