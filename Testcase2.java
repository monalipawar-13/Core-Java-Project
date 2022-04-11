package testcases;

import static org.junit.Assert.*;
import junit.framework.Assert;
import JUnit.Mul;
import org.junit.Test;

public class Testcase2
{
	@Test
	public void test()
	{
		Mul obj = new Mul();
		int result = obj.multiplication(2, 5);
		
		Assert.assertEquals(10,result);
	}


}
