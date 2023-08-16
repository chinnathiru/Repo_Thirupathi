package OrangeHRMProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends Baseclass
{
	static By usernamel=By.xpath("//input[@name='username']");
	static By passwordl=By.xpath("//input[@type='password']");
	static By LoginL=By.xpath("//button[@type='submit']");
	
	//webelement
	public static WebElement usernametxt()
	{
	    WebElement usernam=driver.findElement(usernamel);
		return usernam;
	}
	
	public static WebElement paswordtxt()
	{
	 WebElement pass=driver.findElement(passwordl);
	return pass;
	}
	
	public static WebElement loginbtn()
	{
	 WebElement Login=driver.findElement(LoginL);
	return Login;
	}
	//actions
	public static  void enterusername()
	{
		usernametxt().sendKeys("Admin");
	}
	
	public static void enterpassword()
	{
		paswordtxt().sendKeys("admin123");
	}
	
	public static void clickloginbnt() throws InterruptedException
	{
	
		loginbtn().click();
	//Thread.sleep(2000);
	}

	

	
		
	}	


