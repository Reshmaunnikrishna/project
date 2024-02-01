package abstractclass;

public class Sbi extends Bank {

	public static void main(String[] args) {
		Bank obj = new Sbi();
		System.out.println(obj.getRateOfInterest());

	}

	public int getRateOfInterest() {
		return 7;
	}

}
