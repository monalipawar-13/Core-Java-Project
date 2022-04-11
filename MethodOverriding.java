package polymorphism;

class Animal 
{ 
	public void move() 
	{ 
		System.out.println("Animals can move"); 
	} 
} 
class Dog extends Animal 
{ 
	public void move() 
	{ 
		System.out.println("Dogs can walk and run"); 
	} 
} 
public class MethodOverriding 
{ 
	public static void main(String args[]) 
	{ 
		Dog b = new Dog(); //
		b.move(); // runs the method in Dog class 
	} 
}


