package basicprogrammes;

import java.util.*;

public class NestedIfSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter age of the person ");
		int age = input.nextInt();
		System.out.println("Enter weight of the person");
		float weight = input.nextFloat();

		if (age >= 18) {
			if (weight >= 50)
				System.out.println("Person is eligible for blood donation");
		}
	}

}
