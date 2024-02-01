package inheritance;

public class SalaryCalculation extends Salary {
	float hra, pf;

	public static void main(String[] args) {

	}

	public void calculation() {
		hra = (basicpay * 5) / 100;
		pf = (basicpay * 20) / 100;
		System.out.println("HRA of employee is: " + hra);
		System.out.println("PF of employee is: " + pf);
	}

}
