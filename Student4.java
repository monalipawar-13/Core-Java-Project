//Parameterized Constuctor

package constructor;

public class Student4 
{
	int id;
	String name;
	
	Student4(int d, String name)
	{
		this.id=id;
		this.name=name;
	}
	void display()
	{
		System.out.println(id+""+name);
	}
	public static void main(String[] args) 
	{
		Student4 s1=new Student4(111,"ABC");
		Student4 s2=new Student4(222,"XYZ");
		s1.display();
		s2.display();

	}

}
