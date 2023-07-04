package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testscript1 
{
	@Test
	public void testcase1() 
	{
	Reporter.log("helloworld",true);
	}
	
	@Test
	public void testcase2()
	{
	  Reporter.log("hi hello",true);
	}

}
