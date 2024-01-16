package thissample;

public class Reverse {
int num=369;
static int rev=0;
	public static void main(String[] args) {
		Reverse obj=new Reverse();

	}
	
	Reverse(int num){
		this.num=num;
		while(num!=0) {
			int remainder=num%10;
			rev=rev*10+remainder;
			num=num/10;
		}
		//System.out.println("Reverse of the number is: "+rev);
		}
	Reverse()
	{	this(369);
		System.out.println("*Finding reverse*"+rev);
	}
	
	
	
	
	}



