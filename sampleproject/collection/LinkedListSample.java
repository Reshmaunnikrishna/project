package collection;
import java.util.*;
public class LinkedListSample {
//Linked List
	public static void main(String[] args) {
		LinkedList<String>list=new LinkedList();
		list.add("Circle");
		list.add("Square");
		list.add("Rectangle");
		//adding an element at specific position
		list.add(1, "Triangle");
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		//creating new list
		LinkedList<String>list1=new LinkedList();
		list1.add("Cube");
		list1.add("Cone");
		//adding 2nd list to 1st list
		list1.addAll(list1);
		System.out.println(list1);

	}

}
