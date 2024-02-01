package thissample;

public class Student {
	int id;
	String name;

//Distinguish between instance variables and constructor parameters 
	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void display() {
		System.out.println("The id and name is: " + id + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj = new Student(3, "Priya");
		obj.display();
	}

}
