//Create an ArrayList of Employee( id,name,address,sal) objects
//and search for particular Employee object based on id number.
package Collection;
import java.util.ArrayList;
import java.util.Iterator;
class Employees
{
	private int id;
	private String name;
	private String address;
	private double salary;
	
	public Employees(int id, String name, String address, double salary)
	{
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}
	public int getId()
	{
		return id;
	}
	public String toString()
	{
		return "\nEmp [id=" + id + ", name=" + name + ",address=" + address + ", salary=" + salary +"]";
	}
	
	
}
public class AssQue5 
{
	public static void main(String[] args)
	{
		ArrayList<Employees> a1 = new ArrayList<Employees>();
		
		Employees emp1 = new Employees(101, "ABC", "Pune", 50000);
		Employees emp2 = new Employees(102, "XYZ", "Mumbai", 70000);
		Employees emp3 = new Employees(103, "PQR", "Nashik", 75000);
		
		a1.add(emp1);
		a1.add(emp2);
		a1.add(emp3);
		
		System.out.println(a1.toString());
		
		Iterator<Employees> it =a1.iterator();
		int searchId =102;
		
		while(it.hasNext())
		{
			Employees emp = it.next();
			if (emp.getId() == searchId)
			{
				System.out.println(emp);
				System.out.println("employee id"  +searchId + " present in the List ");
			}
		}

	}

}
