package test_script;

import org.testng.Reporter;
import org.testng.annotations.Test;

//to run the same test script multiple times

public class InvocationCount {
@Test(invocationCount=3,priority=1)
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
