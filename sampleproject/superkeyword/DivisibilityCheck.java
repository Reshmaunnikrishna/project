package superkeyword;

public class DivisibilityCheck extends Add {
	public static void main(String[] args) {
		DivisibilityCheck obj = new DivisibilityCheck();
		obj.divisibility();
	}

	public void divisibility()

	{
		int s = super.adds(10, 20);
		if (s % 10 == 0)
			System.out.println("The sum is divisible by 10");
		else
			System.out.println("The sum is not divisible by 10");
	}

}
