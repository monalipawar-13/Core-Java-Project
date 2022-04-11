package testcases;

import static org.junit.Assert.*;
import junit.framework.Assert;
import JUnit.Div;
import org.junit.Test;

public class Testcase3
{
	@Test
	public void test()
	{
		Div obj = new Div();
		int result = obj.division(10, 5);
		
		Assert.assertEquals(2,result);
	}
}
