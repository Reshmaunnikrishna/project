package aggregation;

public class Student {
int id;
String name;
//entity reference to Address class
Address address;

	public static void main(String[] args) {
		//obj1 created for Address class 
		Address obj1=new Address("Kochi","Kerala","India");
		//obj2 created for Student class
		Student obj2=new Student(3,"Reshma",obj1);
		obj2.print();
	}
	//Constructor for Student class and details in address accessed by Address address(Class name entity variable)
	Student(int id,String name,Address address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
	}
	
	public void print()
	{
		System.out.println("Student id: "+id);
		System.out.println("Student name: "+name);
		//city,state,country accessed through entity reference address(eg.address.city)
		System.out.println("Student address: "+address.city +" "+address.state +" "+address.country);
	}
	

}
