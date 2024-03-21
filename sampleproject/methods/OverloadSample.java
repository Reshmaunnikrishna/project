package methods;

public class OverloadSample {

	public static void main(String[] args) {
		System.out.println(OverloadSample.add(5, 5));
		System.out.println(OverloadSample.add(3, 6, 9));
		

	}
	
	public static int add(int a,int b)
	{
		int c=a+b;
		return c;
	}
	
	public static int add(int x,int y,int z)
	{
		int d=x+y+z;
		return d;
	}
	
	

}
