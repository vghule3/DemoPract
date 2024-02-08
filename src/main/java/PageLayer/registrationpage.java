package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class registrationpage extends BaseClass {
	
  @FindBy(name="firstname")
  WebElement name;
  
  @FindBy(name="lastname")
  WebElement lastname;
  
  @FindBy(name="reg_email__")
  WebElement email;
 
  
  @FindBy(name="reg_passwd__")
  WebElement regpass;
  
  public registrationpage()
  {
	  PageFactory.initElements(driver, this);
  }
  
 public void regi(String fname,String lname,String emailid,String regPass)
  {
	  name.sendKeys(fname);
	  lastname.sendKeys(lname);
	  email.sendKeys(emailid);
	  regpass.sendKeys(regPass);
  }
 public void nameenter(String fname,String lname) throws InterruptedException
 {
	name.sendKeys(fname);
	lastname.sendKeys(lname);
	Thread.sleep(5000);
 }

  
}
