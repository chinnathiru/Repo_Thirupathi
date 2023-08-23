package hyrtutorialWinds;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class flights extends baseclass
{
	
	static By flights=By.xpath("//a[text()=' FLIGHTS ']");
	static By laterL=By.xpath("//button[text()='Later']");
	static By login=By.xpath("//a[text()='Login']");
	static By singup=By.xpath("(//a[text()='Sign Up'])[1]");
	static By username=By.xpath("//input[@id='loginuseridUser']");
	static By password=By.xpath("(//input[@name='password'])[1]");
	static By log=By.xpath("(//button[text()='Login'])[1]");
	
	public static WebElement flight()
	{
		WebElement fligh=driver.findElement(flights);
		return fligh;	
	}
	
	public static WebElement Later()
	{
		WebElement late=driver.findElement(laterL);
		return late;
	}
	public static WebElement loginL()
	{
		WebElement logi=driver.findElement(login);
		return logi;
	}
	public static WebElement signUp()
	{
		WebElement sign=driver.findElement(singup);
		return sign;
	}
	public static WebElement usernameE()
	{
		WebElement sign=driver.findElement(username);
		return sign;
	}
	public static WebElement passwordE()
	{
		WebElement pass=driver.findElement(password);
		return pass;
	}
	public static WebElement loginBtn()
	{
		WebElement loL=driver.findElement(log);
		return loL;
	}
	
	//actions....
	public static void flightsL()
	{
		flight().click();
		
	}
	public static void laterpop() throws InterruptedException
	
	{
		System.out.println(driver.getTitle());
		Set<String>w=driver.getWindowHandles();
		String[] str=w.toArray(new String[w.size()]);
		driver.switchTo().window(str[3]);
		System.out.println(driver.getTitle());
		Thread.sleep(6000);
		Later().click();
	}
	public static void loginbtn()
	{
		loginL().click();
	}
	public static void signl() throws InterruptedException
	{
		signUp().click();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
	}
	public static void enterusername()
	{
		usernameE().sendKeys("thirupathi");
	}
	public static void enterpassword()
	{
		passwordE().sendKeys("thirupathi");
	}
	public static void clickloginbtn()
	{
		loginBtn().click();
	}

}
