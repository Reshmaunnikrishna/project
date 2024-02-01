package abstraction_interface;

public class Hdfc implements Rbi {

	public static void main(String[] args) {
		Rbi obj = new Hdfc();
		obj.recurringDeposit(3000.5, 7);

	}

	public void recurringDeposit(double amount, int duration) {
		double interest = amount * interest_rate * duration;
		double maturity_amt = amount + interest;
		System.out.println("Maturity amount: " + maturity_amt);
	}

}
