package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class Loginpage extends BaseClass {
	
	@FindBy(name="username")
	WebElement user;
	@FindBy(name="password")
	WebElement pass;
	@FindBy(xpath="//button[@type='submit']")
	WebElement button;
	public  Loginpage()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void loginfuctionality()
	{
		user.sendKeys("Admin");
		pass.sendKeys("admin123");
		button.click();
	}

}
