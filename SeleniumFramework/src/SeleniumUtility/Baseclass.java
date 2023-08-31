package SeleniumUtility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Baseclass
{
	protected static WebDriver driver;
	public static void lanchbrowser()
	
	{
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public static WebDriverWait Explicitywait()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		return wait;
		
	}
	

}
