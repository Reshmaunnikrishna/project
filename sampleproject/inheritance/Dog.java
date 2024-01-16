package inheritance;
//Single Inheritance
public class Dog extends Animal{

	public static void main(String[] args) {
	Dog obj=new Dog();
	obj.eat();
	System.out.println(obj.color);
	obj.bark();

	}
	
	public void bark()
	{
		System.out.println("Barking");
	}

}
