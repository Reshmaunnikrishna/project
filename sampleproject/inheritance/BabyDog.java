package inheritance;
//Multi Level Inheritance

public class BabyDog extends Dog{

	public static void main(String[] args) {
	BabyDog obj1=new BabyDog();
	obj1.bark();
	obj1.eat();
	obj1.babyDog();
	System.out.println(obj1.color);

	}
	
	public void babyDog()
	{
		System.out.println("Baby Dog");
	}

}
