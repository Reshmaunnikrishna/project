package abstraction_interface;

public class Hdfc implements Rbi{

	public static void main(String[] args) {
		Rbi obj=new Hdfc();
		obj.recurringDeposit();
		
	}
	
	public void recurringDeposit()
	{
		double interest=amount*interest_rate*duration;
		double maturity_amt=amount+interest;
		System.out.println("Maturity amount: "+maturity_amt);
	}
	

}
