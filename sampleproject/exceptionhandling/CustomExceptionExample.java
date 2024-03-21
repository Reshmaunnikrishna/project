package exceptionhandling;

public class CustomExceptionExample {

	public static void main(String[] args) {
		try
		{
			isEligible();
		}
		catch(InvalidAgeException e)
		{
			System.out.println(e.getMessage());
		}

	}
	private static void isEligible() throws InvalidAgeException
	{
		int age=7;
		if(age<18)
		{
			throw new InvalidAgeException("Not eligible");
		}
	}

}
