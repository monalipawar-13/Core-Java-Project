//Create an ArrayList which will be able to store only Strings.
//Create a printAll method which will print all the elements
//using an Iterator.


package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class AssQue3 
{
	public void showAll(ArrayList list)
	{
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

	public static void main(String[] args) 
	{
		AssQue3 a3=new AssQue3();
		ArrayList<String>list=new ArrayList<String>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		list.add("Five");
		a3.showAll(list);
	}	

}


