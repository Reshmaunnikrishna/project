package practiceClass;
//super
public class Cat extends Animal{
	public static void main(String[] args) {
		Cat obj=new Cat();
		obj.print();
		
	}
	
	public void eat()
	{
		System.out.println("Cat Eating");
	}
	
	public void print()
	{
		super.eat();
		eat();
		
	}

}
