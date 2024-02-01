package methods;

public class OverloadingSample {

	public static void main(String[] args) {
		int avg1 = sum(10, 20, 30);
		float avg2 = sum(10.2f, 15.5f, 20.5f);
		avg(avg1);
		avg(avg2);

	}

	public static int sum(int a, int b, int c) {
		int sum = a + b + c;
		return sum;
	}

	public static float sum(float x, float y, float z) {
		float total = x + y + z;
		return total;
	}

	public static void avg(int avg1) {
		int average1 = avg1 / 3;
		System.out.println("Average of integer numbers: " + average1);
	}

	public static void avg(float avg2) {
		float average2 = avg2 / 3;
		System.out.println("Average of float numbers is: " + average2);
	}

}
