package collection;

import java.util.*;

public class ArraylistGeneric {
	// Generic collection
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList();
		list.add("Apple");
		list.add("Orange");
		list.add("Grape");
		String s = list.get(0);
		// Collections.sort(list);
		System.out.println(s);
		Iterator itr = list.iterator();
		// checking for next element
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// removed element printed
		System.out.println(list.remove(1));
		System.out.println(list.size());

	}

}
