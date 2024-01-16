package practice;

public class ArrayPractice {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		for(int i=0;i<a.length;i++)
			System.out.println("Element at index " +i+ "is" +a[i]);
		System.out.println("Even numbers in the array are: ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
				System.out.println(a[i]);
		}

	}

}
