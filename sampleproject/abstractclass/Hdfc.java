package abstractclass;

public class Hdfc extends Bank {

	public static void main(String[] args) {
		Bank obj = new Hdfc();
		System.out.println(obj.getRateOfInterest());

	}

	public int getRateOfInterest() {
		return 8;
	}

}
