package Practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Loginpage extends Baseclass
{

	// xpath
	
static	By username=By.xpath("//input[@name='email']");
static	By password=By.xpath("//input[@name='current-password']");
static	By login=By.xpath("//span[text()='Log in']");
//webelements	
static WebElement usernamel=driver.findElement(username);
static WebElement passwordl=driver.findElement(password);
static WebElement loginl=driver.findElement(login);
//actions
public static void enterusername() throws InterruptedException
{
	usernamel.sendKeys("gopu.thirupathi143@gmail.com");
	Thread.sleep(2000);
	
}
public static void entrepassword() throws InterruptedException
{
	passwordl.sendKeys("Thiruramya@143");
	Thread.sleep(2000);
}
public static void clickloginbutton() throws InterruptedException
{
	loginl.click();
	Thread.sleep(3000);
}
	
	
	
}
