//Implement the assignment 1 using Linked List

package Collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class Linkedlist 
{
	public static void main(String args[]) 
	{
		LinkedList alist = new LinkedList();
		alist.add(new String("One"));
		alist.add(new String("Two"));
		alist.add(new String("Three"));
		System.out.println(alist.get(0));
		System.out.println(alist.get(1));
		System.out.println(alist.get(2));
	}
}
