package Automation;

public class EqualgnoreSample {
	//check if contents are same case sensitivity is ignored

	public static void main(String[] args) {
		String s="Java";
		String str="java";
		String a="Python";
		String b="Java";
		System.out.println(s.equalsIgnoreCase(str));
		System.out.println(str.equalsIgnoreCase(a));
		System.out.println(s.equalsIgnoreCase(b));

	}

}
