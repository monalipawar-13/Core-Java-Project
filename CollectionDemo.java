package Collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

public class CollectionDemo 
{
	public static void main(String[] args) 
	{
		List list=new ArrayList();
		list.add("Monali");
		list.add(true);
		list.add(4.5);
		
//		for(int i=0;i<list.size();i++)
//		{
//			System.out.println(list.get(i));
//		}
//		
		Iterator itr=list.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		for(Object obj:list)
		{
			System.out.println(obj);
		}
	}
	
}
