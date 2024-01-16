package methods;

public class Palindrome {
static int rev,num;
	public static void main(String[] args) {
		
		Palindrome.reverse(121);
		Palindrome.palindromeCheck();

	}
	public static void reverse(int a) {
		rev=0;
		num=a;
		while(a>0)
		{
			int r=a%10;
			rev=rev*10+r;
			a=a/10;
		}
		System.out.println("Reverse of the number is "+rev);
	}

	public static void palindromeCheck() {
		if(num==rev) {
			System.out.println("Number is a palindrome");
		}
		else
		{
			System.out.println("Number is not a palindrome");
	}
}
}
