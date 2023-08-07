package Practices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass 
{
	static WebDriver driver;
	public static void lanchbrwoser() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://profile.w3schools.com/log-in");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	}
	public static void closeBroswer() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}

}
