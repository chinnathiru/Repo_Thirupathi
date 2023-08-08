package OrangeHRMProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends Baseclass
{
	static By usernamel=By.xpath("//input[@name='username']");
	static By passwordl=By.xpath("//input[@type='password']");
	static By LoginL=By.xpath("//button[@type='submit']");
	
	static WebElement usernam=driver.findElement(usernamel);
	static WebElement pass=driver.findElement(passwordl);
	static WebElement Login=driver.findElement(LoginL);
	
	public static  void enterusername()
	{
	usernam.sendKeys("Admin");
	}
	
	public static void enterpassword()
	{
	pass.sendKeys("admin123");
	}
	
	public static void clickloginbnt() throws InterruptedException
	{
	
	Login.click();
	//Thread.sleep(2000);
	}

	

	
		
	}	


