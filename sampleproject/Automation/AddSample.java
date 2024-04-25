package Automation;

public class AddSample {
	int a,b,c;

	public static void main(String[] args) {
		AddSample obj=new AddSample(10,5);
		obj.adds();

	}
	
	public void adds()
	{
		c=a+b;
		System.out.println(c);
	}
	
	AddSample(int x,int y)
	{
		a=x;
		b=y;
	}

}
