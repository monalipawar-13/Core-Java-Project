package constructor;

class Student
{
	int rollno;//instance variable
	String name;
	static String college ="ITS";//static variable
//constructor
Student(int r, String n) // Local variable
{
	rollno = r;
	name = n;
}
//method to display the values
void display ()
{
	System.out.println(rollno+" "+name+" "+college);
}

//java program to demostrate the use of static variable
	public static void main(String args[])
	{
		Student s1= new Student(111,"ABC");
		Student s2= new Student(222,"XYZ");
		
		s1.display();
		s2.display();
	}
}