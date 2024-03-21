package reviewsample;

public class Displaysample1 extends Displaysample{

	public static void main(String[] args) {
		Displaysample1 obj=new Displaysample1();
		obj.display();
		
	}
	
	public void display()
	{
		super.display();
		System.out.println("This is child class method");
	}

}
