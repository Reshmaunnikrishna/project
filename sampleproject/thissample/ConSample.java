package thissample;

public class ConSample {
int id;
	public static void main(String[] args) {
		ConSample obj=new ConSample(3);
		// TODO Auto-generated method stub

	}
	ConSample(){
		
		System.out.println("Message from Constructor 1");
		
	}
	ConSample(int id){
		//Constructor call must be first statement of a constructor
		//to invoke current class constructor
		this();
		this.id=id;
		System.out.println("Id is " +id);
		
	}

}
