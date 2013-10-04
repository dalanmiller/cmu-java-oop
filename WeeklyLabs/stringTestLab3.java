public class stringTestLab3{
		
	public static void main(String[] args) {
		

		System.out.println("String length 0");
		String s = new String("");
		System.out.println(s.length());

		//New string with same value as S
		String s2 = new String(s);

		s2 = "a really boring example";

		//String length, notably it is a method
		System.out.println(s2.length());

		//Charat, should be 
		System.out.println(s2.charAt(2));

		//Substring, 'really', inclusive 2, exclusive 8
		System.out.println(s2.substring(2,8));

		//Does it start with pre?
		String pre = "a";
		System.out.println(s2.startsWith(pre));

		//Does end with post?
		String post = "example";
		System.out.println(s2.endsWith(post));

		//indexOf, well duh
		System.out.println(s2.indexOf("a"));

		//IndexOf after an index
		System.out.println(s2.indexOf("a",0));

		//Concat
		System.out.println(s2.concat("wtf"));

		//toUpper
		System.out.println(s2.toUpperCase());

		//toLower
		System.out.println(s2.toLowerCase());

		//replace
		System.out.println(s2.replace('a','z'));

		//split
		System.out.println(s2.split(" ").toString());

		//Equals
		System.out.println(s2.equals(s2));

	}

}