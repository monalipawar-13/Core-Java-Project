/*Create an Employee class with the related attributes and
behaviours. Create one more class EmployeeDB which has the
following methods. a. boolean addEmployee(Employee e) b.
boolean deleteEmployee(int eCode) c. String showPaySlip(int
eCode) d. Employee[] listAll() Use an ArrayList which will be
used to store the emplyees and use enumeration/iterator to
process the employees. Write a Test Program to test that all
functionalities are operational.

*/


package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class EmployeeDB
{
	List<Employee> emp = new ArrayList();
	boolean addEmployee(Employee e)
	{
		return emp.add(e);
	}

boolean deleteEmployee(int eCode)
{
	boolean status =false;
	
	Iterator<Employee> it =emp.iterator();
	
	while(it.hasNext())
	{
		Employee emp = it.next();
		
		if (emp.geteCode() == eCode)
		{
			status = true;
			it.remove();
		}
	}
	return status;
}
String showPaySlip(int eCode)
{
	String paySlip = "Invalid employee code";
	
	for(Employee e : emp)
	{
		if(e.geteCode()== eCode)
		{
			paySlip = "Pay slip for employee id" +eCode +"is " +e.geteSalary();
		}
	}
	return paySlip;
}

public Employee[] listAll()
{
	Employee[] eArray =new Employee[emp.size()];
	for(int i=0; i < emp.size(); i++ )
	
		eArray[i] = emp.get(i);
		return eArray;
}
}
