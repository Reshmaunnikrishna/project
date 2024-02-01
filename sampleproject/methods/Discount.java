package methods;

import java.util.*;

public class Discount {
	static float amt, p1, p2, p3, final_amt;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter price of item 1");
		float item1 = input.nextFloat();
		System.out.println("Enter price of item 2");
		float item2 = input.nextFloat();
		System.out.println("Enter price of item 3");
		float item3 = input.nextFloat();
		price(item1, item2, item3);
		total();
		float tot = discount();
		System.out.println("Final price is " + tot);

	}

	public static void price(float item1, float item2, float item3) {
		p1 = item1;
		p2 = item2;
		p3 = item3;
		System.out.println("Price of item 1 " + item1);
		System.out.println("Price of item 2 " + item2);
		System.out.println("Price of item 3 " + item3);
	}

	public static void total() {
		amt = p1 + p2 + p3;
		System.out.println("Total amount is  " + amt);
	}

	public static float discount() {
		if (amt > 5000) {
			float disc = (amt * 20) / 100;
			final_amt = amt - disc;
		} else
			final_amt = amt;

		return final_amt;
	}

}
