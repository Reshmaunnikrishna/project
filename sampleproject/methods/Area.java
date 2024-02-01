package methods;

public class Area {

	public static void main(String[] args) {
		area(6f);
		area(3, 5);
		area(3);

	}

	public static void area(float radius) {
		float c = 3.14f * radius * radius;
		System.out.println("The area of circle is: " + c);
	}

	public static void area(int length, int width) {
		int r = length * width;
		System.out.println("The area of rectangle is: " + r);
	}

	public static void area(int side) {
		int s = side * side;
		System.out.println("The area of square is: " + s);
	}

}
