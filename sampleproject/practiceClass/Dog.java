package practiceClass;

//super
public class Dog extends Animal {
	String color = "Black";

	public static void main(String[] args) {
		Dog obj = new Dog();
		obj.print();

	}

	public void print() {
		System.out.println(super.color);
		System.out.println(color);
	}

}
