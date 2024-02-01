package basicprogrammes;

//import accessmodifier package
import accessmodifier.DefaultSample;

//protected can be used only through child class
public class AccessCheck extends DefaultSample {

	public static void main(String[] args) {
		AccessCheck obj = new AccessCheck();
		System.out.println(obj.b);

	}

}
