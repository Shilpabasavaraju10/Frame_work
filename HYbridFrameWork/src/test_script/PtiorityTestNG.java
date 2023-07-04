package test_script;


import org.testng.Reporter;
import org.testng.annotations.Test;

//to specify the priority

public class PtiorityTestNG {
	@Test(priority=1)
	public void test1()
	{
	Reporter.log("hello world",true);
	}
@Test
public void test2()
{
	Reporter.log("hello India",true);
}
}
