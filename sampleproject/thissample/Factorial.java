package thissample;

public class Factorial {
	int fact = 1;

	public static void main(String[] args) {
		Factorial obj = new Factorial();
		obj.display();

	}

	public void factorial(int num) {
		for (int i = 1; i <= num; i++)
			fact = fact * i;

	}

	public void display() {
		this.factorial(4);
		System.out.println("Factorial of the number is :" + fact);
	}
}
