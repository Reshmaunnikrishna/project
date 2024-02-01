package inheritance;

import java.util.*;

public class TotalSalary extends SalaryCalculation {
	double total;

	public static void main(String[] args) {
		TotalSalary obj = new TotalSalary();
		obj.input();
		System.out.println("***Salary Slip***");
		System.out.println("--Basic Pay--" + obj.basicpay);
		System.out.println("--Deduction--" + obj.deduction);
		System.out.println("--Bonus--" + obj.bonus);
		obj.calculation();
		System.out.println("--Total Salary--");
		obj.tot();

	}

	public void tot() {
		total = basicpay + hra - pf - deduction + bonus;
		System.out.println(total);
	}

}
