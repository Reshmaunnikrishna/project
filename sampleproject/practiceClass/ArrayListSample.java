package practiceClass;
import java.util.*;
public class ArrayListSample {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList();
		list.add("Red");
		list.add("Blue");
		list.add("Black");
		System.out.println(list);
		String s=list.get(0);
		System.out.println(s);
		
		Iterator itr=list.iterator();
				
		
	}

}
