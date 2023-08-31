package SeleniumUtility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{
	public static WebDriver driver;
	public static void lanchbrowser()
	{
		driver=new ChromeDriver();
		driver.get("https://profile.w3schools.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

}
