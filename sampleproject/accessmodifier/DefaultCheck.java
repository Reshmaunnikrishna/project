package accessmodifier;

public class DefaultCheck {

	public static void main(String[] args) {
		//creating object for Default Sample
		DefaultSample obj=new DefaultSample();
		//instance variable a can be accessed inside same package
		System.out.println(obj.a);

	}

}
