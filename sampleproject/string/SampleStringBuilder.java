package string;

public class SampleStringBuilder {

	public static void main(String[] args) {

		StringBuilder s = new StringBuilder("Hello");
		System.out.println(s);
		s.append("Java");
		System.out.println(s);
		System.out.println(s.charAt(4));
		System.out.println(s.isEmpty());
		System.out.println(s.reverse());
		System.out.println(s.deleteCharAt(8));
		System.out.println(s.reverse());
		System.out.println(s.insert(0, "H"));
	}

}
