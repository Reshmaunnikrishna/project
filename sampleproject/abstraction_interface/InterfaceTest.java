package abstraction_interface;

public class InterfaceTest implements InterfaceSample,InterfaceSample2{

	public static void main(String[] args) {
		InterfaceTest obj=new InterfaceTest();
		obj.print();

	}
	
	public void print()
	{
		System.out.println("Printing...");
	}

}
