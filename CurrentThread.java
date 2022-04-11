package Multithreading;

public class CurrentThread 
{
	public static void main(String[] args) 
	{
		Thread t = new Thread();
		t.currentThread();
		t.setName("My thread");
		System.out.println("After Name Change..."+t);
		try
		{
			for(int n=5; n>0; n--)
			{
				System.out.println(n);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("MailThread Interrupted");
		}
	}

}
