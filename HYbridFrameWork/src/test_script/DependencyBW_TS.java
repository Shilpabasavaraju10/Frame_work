package test_script;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependencyBW_TS {
	@Test
	public void compose() 
	{
		Reporter.log("hello world",true);
	}
  @Test(dependsOnMethods="compose")
  public void sentItems()
{
	Reporter.log("hello India",true);
	Assert.fail();
}
  @Test(dependsOnMethods="sentItems")
  public void trash()
{
	Reporter.log("hello Bangalore",true);
}
}
