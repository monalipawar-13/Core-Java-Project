package Inheritance;

class Sem11 
{ 
	public Sem11() 
	{ 
		System.out.println("Sem1 constructor "); 
	} 
	int math, c, cpp; // instance variable 
	void input() // Member function 
	{ 
		math=50; c=60; cpp=70; 
	} 
	public void output() // Member function 
	{ 
		System.out.println("Result of Semester-1 \n\n"); 
		System.out.println("Marks in Mathematics "+math); 
		System.out.println("Marks in C-language "+c); 
		System.out.println("Marks in CPP "+cpp); 
		System.out.println("-------------- \n\n");
	}
}
class Sem22 extends Sem11 
{ 
	int java, dbms, eng; // instance variable 
	public Sem22() 
	{ 
		System.out.println("Sem2 constructor "); 
	} 
	public void input2() // Member functions 
	{ 
		java =55; 
		dbms=88; 
		eng=65; 
	} 
	public void output2() 
	{ 
		System.out.println("Result of Semester-2 \n\n"); 
		System.out.println("Marks in Java "+java); 
		System.out.println("Marks in DBMS "+dbms); 
		System.out.println("Marks in English "+eng);
	}
}
class Sem33 extends Sem22 
{ 
	int mis, dm, android; 
	public void input3() // Member functions 
	{ 
		mis =65; dm=88; 
		android=65; 
	} 
	public void output3() 
	{ 
		System.out.println("Result of Semester-3 \n\n"); 
		System.out.println("Marks in MIS "+mis); 
		System.out.println("Marks in DM "+dm); 
		System.out.println("Marks in Android "+android);
	}
}
class MultiLevelInheritance
{
	public static void main(String args[])
	{
		Sem33 obj = new Sem33();
		obj.input();
		obj.input2();
		obj.input3();
		obj.output();
		obj.output2();
		obj.output3();
	}
}