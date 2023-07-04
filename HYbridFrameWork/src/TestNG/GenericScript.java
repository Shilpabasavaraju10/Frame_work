package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class GenericScript {
public WebDriver driver;
@BeforeMethod
public void openAppln()
{
System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
@AfterMethod
public void closeAppln() {
	driver.close();
}
}
