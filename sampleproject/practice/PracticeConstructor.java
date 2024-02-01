package practice;

public class PracticeConstructor {
	int id;
	String name;

	public static void main(String[] args) {
		PracticeConstructor obj = new PracticeConstructor(3, "Ria");
		obj.display();
	}

	PracticeConstructor(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void display() {
		System.out.println("Id and name is: " + id + name);
	}

}
