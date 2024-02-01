package collection;

import java.util.*;

public class StackSample {
//stack
	public static void main(String[] args) {
		Stack<Integer> stk = new Stack();
		stk.push(1);
		stk.push(2);
		stk.push(3);
		stk.push(4);
		stk.push(5);
		// to check if stack is empty
		System.out.println(stk.empty());
		// to see top most element
		System.out.println(stk.peek());
		// delete last element.Pop is used to delete an element
		System.out.println(stk.pop());

		Iterator itr = stk.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
