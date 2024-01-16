 package string;

public class SampleNew {

	public static void main(String[] args) {
		String s=new String("Welcome");
			System.out.println(s);
			//to check which char is at index 0
			System.out.println(s.charAt(0));
			//to find length of the string
			System.out.println(s.length());
			//to check if string is empty or not
			System.out.println(s.isEmpty());
			//to check which char is at index 2
			System.out.println(s.charAt(2));
			String s1=new String("Java");
			//print 2 strings
			System.out.println(s+s1);
			System.out.println(s+"Java");
			System.out.println(s);
			//check if c is present in the string
			System.out.println(s.contains("c"));
			System.out.println(s.contains("t"));
			//convert to upper case
			System.out.println(s1.toUpperCase());
			//concatinate 2 strings
			System.out.println(s.concat(s1));
		
			
	}

}
