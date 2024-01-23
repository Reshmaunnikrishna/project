package encapsulation;

public class Bank {
	private int pin;

	public static void main(String[] args) {
	

	}
	public void setPin(int pin)
	{
		this.pin=pin;
	}
	
	public int getPin()
	{
		return pin;
	}
	
	public void check(int pin)
	{
		if(pin==1000)
			System.out.println("Valid Pin");
		else if(pin==1234)
		{
			System.out.println("Valid Pin");
		}
		else if(pin==1212)
		{
			System.out.println("Valid Pin");
		}
		else
			System.out.println("Invalid Pin");
	}

}
