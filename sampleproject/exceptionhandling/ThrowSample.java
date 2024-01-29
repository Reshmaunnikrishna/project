package exceptionhandling;

public class ThrowSample {

	public static void main(String[] args) {
		checkAge(15);

	}
	public static void checkAge(int age)throws ArithmeticException
	{
		if(age<=18)
			
			throw new ArithmeticException("Access denied,age must be atleast 18");
		else
			System.out.println("Access Granted");
	}

}
