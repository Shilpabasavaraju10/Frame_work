package test_script;

import org.testng.Reporter;
import org.testng.annotations.Test;

//to skip the test cases

public class ToSkipTC {
	@Test(enabled=false)
	public void test1()
	{
  Reporter.log("hello world",true);
	}
	public void test2()
	{
		Reporter.log("hello India", true);
	}
}
