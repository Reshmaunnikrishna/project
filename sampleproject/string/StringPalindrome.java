package string;

public class StringPalindrome {

	public static void main(String[] args) {

		StringPalindrome obj = new StringPalindrome();
		obj.isPalindrome("Java");
		obj.isPalindrome("Malayalam");

	}

	public void isPalindrome(String str) {
		StringBuilder s = new StringBuilder(str);
		String s1 = s.reverse().toString();
		boolean flag = s1.equalsIgnoreCase(str);
		if (flag)

			System.out.println("It is a palindrome");

		else
			System.out.println("Not a palindrome");
	}

}
