package finalkeyword;

public class VariableSample {
	//blank final variable
	final int pin;
	// syntax for final variable final int pin=2356;

	public static void main(String[] args) {
		VariableSample obj=new VariableSample();
		obj.display();
		
	}
	public void display()
	{
		System.out.println(pin);
	}
	// blank final variable can be initialized only inside a constructor
	VariableSample()
	{
		pin=2356;
	}

}
