package superkeyword;

public class Dog extends Animal{
	//variable color of Dog class
	String color="Black";

	public static void main(String[] args) {
		Dog obj=new Dog();
		obj.print();
		
	}
	
	public void print()
	{
		//invoking variable color of parent class(Animal) using super keyword
		System.out.println(super.color);
		System.out.println(color);
	}

}
