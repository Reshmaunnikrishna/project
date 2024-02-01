package polymorphism;

public class Onseason {

	public static void main(String[] args) {

	}

	public void discount(float price) {
		float disc = (price * 40) / 100;
		float tot_amt = price - disc;
		System.out.println("*** On Season discount *** " + disc);
		System.out.println("Final price after discount: " + tot_amt);

	}
}
