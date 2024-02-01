package abstractclass;

public class FullTimeEmployee extends Employee {

	public static void main(String[] args) {
		Employee obj1 = new FullTimeEmployee();
		obj1.calculateSalary();
	}

	public void calculateSalary() {
		int salary = payment * 8;
		System.out.println("Salary of full time employee: " + salary);
	}

}
