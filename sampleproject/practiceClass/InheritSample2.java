package practiceClass;

//Multi level inheritance
public class InheritSample2 extends InheritSample1 {
	public static void main(String[] args) {
		InheritSample2 obj1 = new InheritSample2();
		System.out.println(obj1.id);
		obj1.print();
		obj1.message();

	}

	public void printmsg() {
		System.out.println("message from this class");
	}

}
