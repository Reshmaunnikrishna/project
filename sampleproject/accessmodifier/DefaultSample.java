package accessmodifier;

public class DefaultSample {
	int a = 10;
	protected int b = 20;

	public static void main(String[] args) {

	}

	// private method cannot be accessed in Default Check class
	private void display() {
		System.out.println("Message from display method");
	}

}
