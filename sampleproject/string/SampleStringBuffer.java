package string;

public class SampleStringBuffer {

	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("Welcome");
		s1.append("Home");
		System.out.println(s1);
		System.out.println(s1.charAt(2));
		System.out.println(s1.isEmpty());
		// to delete a char at any index
		System.out.println(s1.deleteCharAt(1));
		// to insert a char at any index
		System.out.println(s1.insert(1, "e"));
		// to reverse the string
		System.out.println(s1.reverse());

	}

}
