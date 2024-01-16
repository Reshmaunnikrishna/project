package practice;
import java.util.*;

public class Switch {

	public static void main(String[] args) {
		System.out.println("Enter a month");
	Scanner input=new Scanner(System.in);
	int month=input.nextInt();
	switch(month) {
	
	case 1:System.out.println("Month is Jan");
	break;
	case 2 :System.out.println("Month is Feb");
	break;
	case 3:System.out.println("Month is Mar");
	break;
	case 4:System.out.println("Month is Apr");
	break;
	case 5:System.out.println("Month is May");
	break;
	case 6:System.out.println("Month is Jun");
	break;
	case 7:System.out.println("Month is July");
	break;
	case 8:System.out.println("Month is Aug");
	break;
	case 9:System.out.println("Month is Sep");
	break;
	case 10:System.out.println("Month is Oct");
	break;
	case 11:System.out.println("Month is Nov");
	break;
	case 12:System.out.println("Month is Dec");
	break;
	default:System.out.println("Invalid entry");
	}
	

	}

}
