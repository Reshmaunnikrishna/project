package string;

public class SampleLiteral {

	public static void main(String[] args) {
		//String creation using literal
		String str="Hello";
		//with new keyword
		String s1=new String("Good Morning");
		System.out.println(str);
		String s="World";
		System.out.println(str);
		System.out.println(str + "World");
		//String is immutable cannot be changed
		System.out.println(str);
		str.charAt(0);
		//to find length of the string and stored in size
		int size=str.length();
		System.out.println(str.charAt(0));
		System.out.println("Length is: "+size);
		//finding char at 4th position
		System.out.println(str.charAt(4));
		//concat operation to combine 2 strings
		System.out.println(str.concat(s));
		//to check if a string is empty or not
		System.out.println(str.isEmpty());
		//to check if a specific char is present in string
		System.out.println(str.contains("r"));
		// convert to upper and lower case
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println();
	}

}
