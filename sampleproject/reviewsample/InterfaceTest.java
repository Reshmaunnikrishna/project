package reviewsample;

public class InterfaceTest implements Interfacesample1,Interfacesample2{

	public static void main(String[] args) {
		InterfaceTest obj=new InterfaceTest();
		obj.print();

	}

	public void print()
	{
		System.out.println("Message from interface");
	}
}
