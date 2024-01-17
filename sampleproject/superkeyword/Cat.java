package superkeyword;

public class Cat extends Animal{

	public static void main(String[] args) {
		Cat obj=new Cat();
		obj.print();
	
	}
	
	public void eat()
	{
		System.out.println("CatEating");
	}
	// eat method inside print
	public void print()
	{
		//calling eat() in Animal class using super keyword
		super.eat();
		eat();
		
	}

}
