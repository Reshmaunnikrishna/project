package practiceClass;

public class Square implements Shape {

	public static void main(String[] args) {
		Shape obj = new Square();
		obj.draw();

	}

	public void draw() {
		System.out.println("Draw Square");
	}

}
