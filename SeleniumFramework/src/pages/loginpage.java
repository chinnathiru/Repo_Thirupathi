package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import SeleniumUtility.Baseclass;

public class loginpage extends Baseclass 
{
	static By usernaml=By.xpath("//input[@name='username']");
	static By passwordl=By.xpath("//input[@type='password']");
	static By loginL=By.xpath("//button[@type='submit']");
	
	public static WebElement usernameE()
	{
		WebElement user=driver.findElement(usernaml);
		return user;
	}
	public static WebElement passwordE()
	{
		WebElement pass=driver.findElement(passwordl);
		return pass;
	}
	public static WebElement LoginBtnE()
	{
		WebElement login=driver.findElement(loginL);
		return login;
	}
	
	public static void enterusername()
	{
		
		WebDriverWait wait1=loginpage.Explicitywait();
		wait1.until(ExpectedConditions.visibilityOf(usernameE()));
		usernameE().sendKeys("Admin");
		
	}
	public static void enterpassword()
	{
		passwordE().sendKeys("admin123");
	}
	public static void clickloginbtn()
	{
		LoginBtnE().click();
	}

}
