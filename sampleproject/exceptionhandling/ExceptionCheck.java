package exceptionhandling;

public class ExceptionCheck {

	public static void main(String[] args) {
		ExceptionCheck obj=new ExceptionCheck();
		try
		{
			System.out.println(obj.divideNum(25, 0));
		}
		
		catch(ArithmeticException ex)
		{
			System.out.println("Cannot divide by 0");
		}
		
		System.out.println("Rest of the code");

	}
	public static int divideNum(int a,int b) throws ArithmeticException
	{
		int div=a/b;
		return div;
	}

}
