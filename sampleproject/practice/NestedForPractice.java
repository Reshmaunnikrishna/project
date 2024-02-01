package practice;

public class NestedForPractice {

	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {
			System.out.println("Week is " + i);
			for (int j = 1; j <= 7; j++) {
				System.out.println("Day is " + j);
			}
		}
		System.out.println();
	}

}
