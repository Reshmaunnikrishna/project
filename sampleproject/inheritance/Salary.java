package inheritance;

import java.util.*;

public class Salary {
	int basicpay, deduction, bonus;

	public static void main(String[] args) {

	}

	public void input() {
		System.out.println("Enter basic pay");
		Scanner input = new Scanner(System.in);
		basicpay = input.nextInt();
		System.out.println("Enter deduction");
		deduction = input.nextInt();
		System.out.println("Enter bonus");
		bonus = input.nextInt();

	}

}
