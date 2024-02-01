package inheritance;

public class Cat extends Animal {

	public static void main(String[] args) {
		Cat obj2 = new Cat();
		obj2.eat();
		System.out.println(obj2.color);
		obj2.meow();
	}

	public void meow() {
		System.out.println("Meow");
	}

}
