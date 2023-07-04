package TestNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RunnerScript extends GenericScript
{
@Test
public void validLogin() throws InterruptedException
{
	driver.findElement(By.id("email")).sendKeys("hello");
	driver.findElement(By.id("pass")).sendKeys("hello");
	driver.findElement(By.name("login")).click();
	Thread.sleep(4000);
	String title = driver.getTitle();
	System.out.println(title);
}
}
