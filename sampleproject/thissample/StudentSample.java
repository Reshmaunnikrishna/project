package thissample;

public class StudentSample {

	public static void main(String[] args) {
		StudentSample obj=new StudentSample();
		obj.display2();
		

	}
	public void display1() {
		System.out.println("Message from display 1 method");
		
	}
	public void display2() {
		System.out.println("Message from display 2 method");
		//to invoke current class instance method
		this.display1();
		
	}
	
	
}
