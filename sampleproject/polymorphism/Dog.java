package polymorphism;

public class Dog extends Animal{

	public static void main(String[] args) {
		//Dog obj=new Dog();
		Animal obj=new Dog();
		obj.sound();
		
	}
	public String sound()
	{
		//invoking sound() of parent class using super keyword
		super.sound();
		System.out.println("Bark");
		return null;
	}

}
