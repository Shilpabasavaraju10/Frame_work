package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import GenericScript.BasePage;

public class FbLgnPg extends BasePage{
	@FindBy(id="email")
	private WebElement unField;
	@FindBy(id="pass")
	private WebElement pwdField;
	@FindBy(id="login")
	private WebElement loginBtn;
public FbLgnPg(WebDriver driver)
{
	super(driver);
}
public void passUN(String un)
{
	unField.sendKeys(un);
}
public void passPwd(String pwd)
{
	pwdField.sendKeys(pwd);
}
public void btn()
{
	loginBtn.click();
}
}


