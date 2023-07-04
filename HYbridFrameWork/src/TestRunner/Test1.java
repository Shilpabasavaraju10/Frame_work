package TestRunner;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom.pom1;

public class Test1 {
   @Test
	public void test1()
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		 pom1 p=new pom1(driver);
	 p.passun("admin");
	 p.passpwd("manager");
	 p.btn();	
	}
}