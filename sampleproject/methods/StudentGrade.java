package methods;

public class StudentGrade {
	//Constructor Sample program

	public static void main(String[] args) {
		System.out.println("Student 1 details");
		StudentGrade s1=new StudentGrade(10,20,30);
		int t1=s1.calculateTotal();
		System.out.println("Total of student 1 is: " +t1);
		s1.grade();
		System.out.println("Student 2 details");
		StudentGrade s2=new StudentGrade(20,30,50);
		int t2=s2.calculateTotal();
		System.out.println("Total of student 2 is: " +t2);
		s2.grade();

	}
	int mark1,mark2,mark3;
	static int total;
	
	StudentGrade(int m1,int m2,int m3)
	{
		int mark1=m1;
		int mark2=m2;
		int mark3=m3;
		System.out.println("Mark 1 is: "+mark1);
		System.out.println("Mark 2 is: "+mark2);
		System.out.println("Mark 3 is: "+mark3);
	}

	public int calculateTotal()
	{
		total=mark1+mark2+mark3;
		return total;
	}
	
	public void grade()
	{
		if(total>=81 && total<=100)
		{
			System.out.println("Grade A");
		}	
		else if(total>=71 && total<=81)
		{
			System.out.println("Grade B");
		}
		else if(total>=61 && total<=70)
		{
			System.out.println("Grade C");
		}
		else if(total>=40 && total<=60)
		{
			System.out.println("Grade D");
		}
		else
		{
			System.out.println("Failed");
		}
	}
}
