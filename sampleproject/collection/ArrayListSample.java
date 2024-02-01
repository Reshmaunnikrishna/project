package collection;

import java.util.*;

//Non Generic collection
public class ArrayListSample {

	public static void main(String[] args) {
		// creating array list
		ArrayList list = new ArrayList();
		list.add("Ria");
		list.add(2);
		String s = (String) list.get(0);
		System.out.println(s);

	}

}
