package encapsulation;

public class Bank {
	private int pin;

	public void setPin(int pin) {
		this.pin = pin;
	}

	public void check(int pin) {
		if (pin == 1001 || pin == 1234 || pin == 1212)

			System.out.println("Valid Pin");

		else
			System.out.println("Invalid Pin");
	}

}
