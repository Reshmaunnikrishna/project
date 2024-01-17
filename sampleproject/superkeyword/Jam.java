package superkeyword;
public class Jam extends Bread{

	public static void main(String[] args) {
		Jam obj=new Jam();
	}
	//constructor of Jam class
	Jam()
	{	
		//invoke parametrized constructor
		//super("Hungry");
		//calling constructor in parent class using super keyword
		//super has to be the first statement
		super();
		System.out.println("Sweet Jam");
	}
	
}
