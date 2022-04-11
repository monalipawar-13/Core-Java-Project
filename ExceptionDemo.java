package exception;

public class ExceptionDemo 
{
	public void input()
	{
		try
		{
			System.out.println("This is input method");
			int a=10;
			int b=a/0; //try throw the exception object
			System.out.println("Hello");
		}
		catch(Exception e) //Here e object catch the exception object
		{
			System.out.println("Exception is generated" +e);
		}
	}
	public void output()
	{
		System.out.println("This is output method");
	}
	public void show1()
	{
		System.out.println("This is show1 method");
	}
	public void show2()
	{
		System.out.println("This is show2 method");
	}
	public static void main(String[] args)
	{
		ExceptionDemo obj=new ExceptionDemo();
		obj.input();
		obj.output();
		obj.show1();
		obj.show2();
	}

}
