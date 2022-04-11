//Create an ArrayList which will be able to store only numbers
//like int,float,double,etc, but not any other data type.


package Collection;

import java.util.*;


public class AssQue4
{
	public static void main(String[] args)
	{
		ArrayList<Object> list=new ArrayList<Object>();
		list.add(3);
		list.add(2.2f);
		list.add(3.14);
		list.add("string");
		
		
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			Object e1 = itr.next();
			
			if(e1 instanceof Integer || e1 instanceof Float)
			{
				System.out.println(e1);
				continue;
			}
			else
			{
				System.out.println("Invalid data");
			}
		}
	}
}