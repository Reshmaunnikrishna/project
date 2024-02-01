package finalkeyword;

public class Method extends MethodSample {

	public static void main(String[] args) {
		// inheritance is possible .Method overriding cannot be done
		// upcasting
		MethodSample obj = new Method();
		obj.sample();

	}

	// Method overriding is not possible
	/*
	 * public void sample() {
	 * 
	 * }
	 */
//this method cannot be accesed using obj because obj is created for parent class
	public void message() {
		System.out.println("Hello");
	}
}
