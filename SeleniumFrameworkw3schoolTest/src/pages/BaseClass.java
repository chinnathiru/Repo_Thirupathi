package pages;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{

	protected static WebDriver driver;
	public static void lanchbrowser()
	{
		driver=new ChromeDriver();
		driver.get("https://profile.w3schools.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
//	static By framel=By.xpath("//iframe[@id='classic-menu']");
	//public static WebElement frameL()
//	{
//		WebElement framew=driver.findElement(framel);
//		driver.switchTo().frame(framew);
//		return framew;
//	}
//	public static WebElement frameL1()
//	{
//		WebElement framew=driver.findElement(framel);
//		driver.switchTo().frame(framew);
//		return framew;
//	}
	
public static void closebrowser()
{
	driver.close();
}
public static String Getcurrenturl()
{
	return driver.getCurrentUrl();
}
}
