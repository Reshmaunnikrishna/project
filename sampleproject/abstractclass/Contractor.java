package abstractclass;

public class Contractor extends Employee{
	int salary;
	public static void main(String args[])
	{
		Employee obj=new Contractor();
		obj.calculateSalary();

	}	
	public void calculateSalary()
	{
		salary=payment*workhrs;
		System.out.println("Salary of contract employee: "+salary);
	}

}

