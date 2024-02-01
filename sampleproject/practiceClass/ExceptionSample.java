package practiceClass;

public class ExceptionSample {

	public static void main(String[] args) {
		checkAge(14);
		try {
			int num = 5 / 0;
			System.out.println(num);
		} catch (ArithmeticException ex) {
			System.out.println("cannot divide by 0");

		} finally {
			System.out.println("Always executed");
		}

	}

	public static void checkAge(int age) throws ArithmeticException {
		if (age <= 18)
			throw new ArithmeticException("Access Denied");
		else
			System.out.println("Access granted");

	}

}
