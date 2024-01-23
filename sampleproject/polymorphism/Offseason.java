package polymorphism;

public class Offseason extends Onseason{

	public static void main(String[] args) {
	Onseason obj=new Offseason();
	obj.discount(3000);


	}

	public void discount(float price)
	{
		super.discount(3000);
		float disc=(price*15)/100;
		float tot_amt=price-disc;
		System.out.println("*** Off Season discount *** " +disc);
		System.out.println("Final price after discount: "+tot_amt);
	
		
	}
}
