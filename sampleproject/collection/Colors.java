package collection;

import java.util.*;

public class Colors {
//list created with colors
	public static void main(String[] args) {
		ArrayList<String> col = new ArrayList();
		System.out.println("** Colors in array list **");
		col.add("Blue");
		col.add("Black");
		col.add("White");
		col.add("Yellow");
		col.add("Red");
		// Printing the collection
		Iterator itr = col.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		// Retrieving element at index 2
		String str = col.get(2);
		System.out.println("color at index 2 is " + str);
		// removing 3rd element from array list
		System.out.println("Element removed from 3rd index is " + col.remove(3));
		// to search an element in array list
		System.out.println(col.contains("Blue"));

	}

}
