package Automation;

public class InstanceSample {
	
	String name;

	public static void main(String[] args) {
		InstanceSample obj=new InstanceSample("Reshma");
		obj.display();

	}
	
	public void display()
	{
		System.out.println(name);
	}
	
	InstanceSample(String str)
	{
		name=str;
		
	}

}
