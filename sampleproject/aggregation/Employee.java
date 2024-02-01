package aggregation;

public class Employee {
	int empid;
	String empname;
	Address address;

	public static void main(String[] args) {
		Address obj = new Address("Kochi", "Kerala", "India");
		Employee emp = new Employee(305, "Ria", obj);
		emp.employeedetails();

	}

	Employee(int empid, String empname, Address address) {
		this.empid = empid;
		this.empname = empname;
		this.address = address;
	}

	public void employeedetails() {
		System.out.println("*** Employee details ***");
		System.out.println("Employee id: " + empid);
		System.out.println("Employee name: " + empname);
		System.out.println("Employee address: " + address.city + " " + address.state + " " + address.country);

	}
}
