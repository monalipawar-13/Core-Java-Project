package testcases;
import static org.junit.Assert.*;
import junit.framework.Assert;
import org.junit.Test;

public class Testcase11
{
	@Test
	public void test()
	{
		String s1 = null;
		String s2 = "Welcome";
		
		assertNotNull(s2);
	}
	@Test
	public void test01()
	{
		String s1 = null;
		String s2 = "java";
		
		assertNull(s1);
	}
	@Test
	public void test02()
	{
		String s1 = "edubridge";
		String s2 = "edubridge";
		
		assertSame(s1,s2);
	}
	@Test
	public void test03()
	{
		int arr1[] = {1,2,3};
		int arr2[] = {1,2,3};
		
		assertArrayEquals(arr1,arr2);
	}
	@Test
	public void test04()
	{
		int a = 5;
		int b = -5;
		int c= a+b;
		
		assertTrue(c==10);
		assertFalse(c==11);
	}
	
	

}
