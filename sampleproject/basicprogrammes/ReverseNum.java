package basicprogrammes;
import java.util.*;
public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=input.nextInt();
		int rev=0;
		while(num!=0)
		{
			int remainder=num%10;
			rev=rev*10+remainder;
			num=num/10;
		}
		System.out.println("Reverse of the number is: "+rev);
	}

}
