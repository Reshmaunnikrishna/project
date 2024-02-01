package practiceClass;

//single inheritance
public class InheritSample1 extends InheritSample {

	public static void main(String[] args) {
		InheritSample1 obj = new InheritSample1();
		System.out.println(obj.id);
		System.out.println(obj.name);
		obj.print();
		obj.message();

	}

	public void message() {
		System.out.println("message from child class");
	}

}
