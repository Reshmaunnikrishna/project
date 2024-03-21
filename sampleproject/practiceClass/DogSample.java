package practiceClass;

public class DogSample extends AnimalSample {

	public static void main(String[] args) {
		DogSample dog=new DogSample();
		dog.eat();

	}
	
	public void eat()
	{
		super.eat();
		System.out.println("Dog eating");
	}

}
