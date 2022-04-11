package testcases;

import static org.junit.Assert.*;
import junit.framework.Assert;
import JUnit.Add;
import org.junit.Test;

public class Testcase1 
{
	@Test
	public void test()
	{
		Add obj = new Add();
		int result = obj.addition(6, 5);
		
		Assert.assertEquals(11,result);
	}


}
