package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom1 {
	@FindBy (id="email")
	private WebElement unField;
	@FindBy (id="pass")
	private WebElement pwdField;
	@FindBy(name="login")
	private WebElement loginbtn;
	public Pom1(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
public void passun(String un)
{
 unField.sendKeys(un);
}
public void passpwd(String pwd)
{
	pwdField.sendKeys(pwd);
}
public void btn()
{
	loginbtn.click();
}
}


