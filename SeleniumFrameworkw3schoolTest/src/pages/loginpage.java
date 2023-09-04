package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;


public class loginpage extends BaseClass
{	
static	By username=By.xpath("//input[@name='email']");
static	By password=By.xpath("//input[@name='current-password']");
static	By login=By.xpath("//span[text()='Log in']");
static By ErrorL=By.xpath("//span[text()='Please enter an email']");

//webelements	
public static WebElement usernamel()
{
	WebElement user=driver.findElement(username);
	return user;
}
public static WebElement passwordl()
{
	WebElement pass=driver.findElement(password);
	return pass;
}
public static WebElement loginl()
{
	WebElement log=driver.findElement(login);
	return log;
}
public static WebElement errormsg()
{
	 WebElement err=driver.findElement(ErrorL);
	 return err;
}

//actions
public static void enterusername(String username) throws InterruptedException 
{
	usernamel().clear();
	Thread.sleep(3000);
	usernamel().sendKeys(username);
	
	
}
public static void entrepassword(String password) throws InterruptedException
{
	passwordl().clear();
	Thread.sleep(3000);
	passwordl().sendKeys(password);
	
}
public static void clickloginbutton() throws InterruptedException
{
	loginl().click();
	
}
	
}
