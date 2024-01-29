package exceptionhandling;

public class ExceptionSample {

	public static void main(String[] args) {
		//try block where exception code is placed
		try 
		{
			int num=6/0;
			System.out.println(num);
		}
		//catch block to handle exception 
		catch(ArithmeticException ex)
		{
			//System.out.println("Cannot divide by zero");
			System.out.println(ex.getMessage());
		} 
		//finally block 
		finally
		{
			System.out.println("Always executed");
		}
		//System.out.println("Rest of the code");
		
	}

}
